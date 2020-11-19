class Main {
    public static void main(String[] args) {

        SpecifMultiEnsNonGen ens = new MultiEnsNonGen();
        System.out.println(ens.taille()); // affiche 0
        System.out.println(ens.present(11)); // affiche false
        System.out.println(ens.frequence(11)); // affiche 0
        System.out.println(ens.enlever(11)); // affiche false
        ens.ajouter(33);
        ens.ajouter(11);
        System.out.println(ens.present(11)); // affiche true
        System.out.println(ens.frequence(11)); // affiche 1
        System.out.println(ens.taille()); // affiche 2
        ens.ajouter(33);
        System.out.println(ens.present(33)); // affiche true
        System.out.println(ens.frequence(33)); // affiche 2
        System.out.println(ens.enlever(33)); // affiche true
        System.out.println(ens.present(33)); // affiche true
        System.out.println(ens.frequence(33)); // affiche 1
        System.out.println(ens.enlever(33)); // affiche true
        System.out.println(ens.present(33)); // affiche false
        System.out.println(ens.frequence(33)); // affiche 0
        System.out.println(ens.taille()); // affiche 1

        System.out.println("\n////////////// \n"); // CHANGEMENT EXO

        SpecifMultiEnsGen<String> ens2 = new MultiEnsGen<String>() ;
        ens2.ajouter("11") ;
        System.out.println(ens2.taille()) ; // affiche 1
        System.out.println(ens2.present("11")) ; // affiche true
        System.out.println(ens2.frequence("11")) ; // affiche 1
        System.out.println(ens2.enlever("11")) ; // affiche true
        System.out.println(ens2.taille()) ; // affiche 0


        System.out.println("\n////////////// \n"); // CHANGEMENT EXO

        MultiEnsIterable<String> ens3 = new MultiEnsIterable<String>();
        ens3.ajouter("11");
        ens3.ajouter("11");
        ens3.ajouter("11");
        ens3.ajouter("03");
        ens3.ajouter("03");
        ens3.ajouter("3");
        ens3.ajouter("11");
        ens3.ajouter("12");
        ens3.iterator();

        System.out.println("\n////////////// \n"); // CHANGEMENT EXO

        MultiEnsConcatenable<Integer> ens4 = new MultiEnsConcatenable<Integer>() ;
        ens4.ajouter(11) ;
        ens4.ajouter(22) ;
        ens4.ajouter(11) ;
        ens4.ajouter(44) ;
        System.out.println(ens4.concatenation()) ; // affiche 11112244
    }
}

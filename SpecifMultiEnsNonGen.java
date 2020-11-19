
public interface SpecifMultiEnsNonGen {

    // Ajout de la valeur val au multi-ensemble
    public abstract void ajouter(int val);
    // Retrait de la valeur val du multi-ensemble :
    // (retourne true si et seulement si sa fréquence
    // est initialement non nulle)
    public abstract boolean enlever(int val);
    // Fréquence de la valeur val
    //= nombre d'occurrences de val
    //= (nombre d'ajouts de val)
    //– (nombre de retraits réussis de val)
    public abstract int frequence(int val);
    // Présence de la valeur val
    //= vrai si et seulement si val a au moins 1 occurrence
    public abstract boolean present(int val);
    // Taille
    //= nombre total d'occurrences d'éléments
    //= (nombre total d'ajouts)
    // – (nombre total de retraits réussis)
    public abstract int taille();
    
}

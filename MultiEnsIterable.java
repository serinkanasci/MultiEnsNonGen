import java.util.Iterator;

public class MultiEnsIterable<T> extends MultiEnsGen<String> implements Iterable<String>{

    MultiEnsIterable(){

    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = multiEns.keySet().iterator();
        while(it.hasNext()) {
            String val = it.next();
            int nbRep = multiEns.get(val);
            while(nbRep != 0){
                System.out.println(val);
                nbRep -= 1;
            }
        }
        return it;
    }

}
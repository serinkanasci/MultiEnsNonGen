import java.util.Iterator;

public class MultiEnsConcatenable<T> extends MultiEnsIterable<T> implements Concatenable {

    @Override
    public String concatenation() {
        String res = "";
        Iterator<String> it = multiEns.keySet().iterator();
        while(it.hasNext()) {
            T val = (T) it.next();
            Integer nbRep = (Integer) multiEns.get(val);
            while(nbRep != 0){
                res += val;
                nbRep -= 1;
            }
        }
        return res;
    }
    
}

// if(getApplicationContext().getBean("someMap") instanceof HashMap) {
//     private Map<String, String> someMap = (HashMap<String, String>)getApplicationContext().getBean("someMap");
// }
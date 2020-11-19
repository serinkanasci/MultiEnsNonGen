import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MultiEnsGen<T> implements SpecifMultiEnsGen<T> {

    public Map<T, Integer> multiEns = new HashMap<>();

    MultiEnsGen() {
    }

    @Override
    public void ajouter(Object val) {
        if (this.present(val)) {
            this.multiEns.put((T) val, this.multiEns.get(val) + 1);
        } else {
            this.multiEns.put((T) val, 1);
        }
    }

    @Override
    public boolean enlever(Object val) {
        if (this.present(val)) {
            this.multiEns.put((T) val, this.multiEns.get(val) - 1);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int frequence(Object val) {
        int freq = 0;
        if (this.present(val)) {
            freq = this.multiEns.get(val);
        }
        return freq;
    }

    @Override
    public boolean present(Object val) {
        if (this.multiEns.containsKey(val)) {
            if (this.multiEns.get(val) == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @Override
    public int taille() {
        int mySize = 0;
        for (Entry<T, Integer> entry : this.multiEns.entrySet()) {
            mySize += entry.getValue();
        }
        return mySize;
    }
    
}

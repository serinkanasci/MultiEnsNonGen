import java.util.HashMap;
import java.util.Map;

public class MultiEnsNonGen implements SpecifMultiEnsNonGen {

    Map<Integer, Integer> multiEns= new HashMap<>();

    MultiEnsNonGen(){
    }

    @Override
    public void ajouter(int val) {
        if(this.present(val)){
            this.multiEns.put(val, this.multiEns.get(val) + 1);
        }
        else{
            this.multiEns.put(val, 1);
        }
    }

    @Override
    public boolean enlever(int val) {
        if(this.present(val)){
            this.multiEns.put(val, this.multiEns.get(val) - 1);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int frequence(int val) {
        int freq = 0;
        if(this.present(val)){
            freq = this.multiEns.get(val);
        }
        return freq;
    }

    @Override
    public boolean present(int val) {
        if(this.multiEns.containsKey(val)){
            if(this.multiEns.get(val) == 0){
                return false;
            }else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    @Override
    public int taille() {
        int mySize = 0;
        for (Map.Entry<Integer, Integer> entry : this.multiEns.entrySet()) {
            mySize += entry.getValue();
        }
        return mySize;
    }
    
}

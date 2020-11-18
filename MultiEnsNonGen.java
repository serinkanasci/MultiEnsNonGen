import java.util.HashMap;
import java.util.Map;

public class MultiEnsNonGen implements SpecifMultiEnsNonGen {

    Map<Integer, Integer> val = new HashMap<>();

    @Override
    public void ajouter(int val) {

    }

    @Override
    public boolean enlever(int val) {
        return false;
    }

    @Override
    public int frequence(int val) {
        return 0;
    }

    @Override
    public boolean present(int val) {
        return false;
    }

    @Override
    public int taille() {
        return 0;
    }
    
}

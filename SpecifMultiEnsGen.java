public interface SpecifMultiEnsGen <T>
{
// (cf. SpecifMultiEnsNonGen pour les commentaires)
public abstract void ajouter(T val);
public abstract boolean enlever(T val);
public abstract int frequence(T val);
public abstract boolean present(T val);
public abstract int taille();
}
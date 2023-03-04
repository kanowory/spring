package pl.edu.wszib.springwprowadzenie;

public class MojPrototyp implements Cloneable{

    private static final MojPrototyp PROTOTYP = new MojPrototyp();

    private MojPrototyp(){
    }

    public static MojPrototyp getInstance(){
        try {
            return (MojPrototyp) PROTOTYP.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

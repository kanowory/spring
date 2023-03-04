package pl.edu.wszib.springwprowadzenie;

public class MojSingleton {

    private static final MojSingleton INSTANCE = new MojSingleton();

    private MojSingleton(){
    }

    public static MojSingleton getInstance() {
        return INSTANCE;
    }

}

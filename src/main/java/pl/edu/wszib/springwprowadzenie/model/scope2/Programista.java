package pl.edu.wszib.springwprowadzenie.model.scope2;

import org.springframework.stereotype.Component;

@Component
public class Programista {

    private Komputer komputer;
    private Ekspres ekspres;

    public Programista(Komputer komputer, Ekspres ekspres) {
        this.komputer = komputer;
        this.ekspres = ekspres;
    }

    public String pracuj() {
        return komputer.pracuj();
    }

    public String pijKawe() {
        return ekspres.kawa();
    }
}

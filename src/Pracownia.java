import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pracownia {
    private Map<Osoba, Komputer> przypisania = new HashMap<>();

    public void dodajKomputerDoUcznia(Uczen uczen, Komputer komputer) {
        przypisania.put(uczen, komputer);
    }

    public void wyswietlPracownie() {
        Set<Osoba> setOsoba = przypisania.keySet();
        Iterator<Osoba> iterator = setOsoba.iterator();

        while (iterator.hasNext()) {
            Osoba osoba = iterator.next();
            Komputer komputer = przypisania.get(osoba);
            System.out.println(osoba.getImie() + ", " + osoba.getNazwisko() + " -> " + komputer.getNumer());
        }
    }
}

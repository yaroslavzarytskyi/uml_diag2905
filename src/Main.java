public class Main {
    public static void main(String[] args) {
        Uczen uczen1 = new Uczen("Adrian", "Nowak", "12345678901", "2A");
        Uczen uczen2 = new Uczen("Andrzej", "Mróz", "09876543210", "3Re");

        Komputer komputer1 = new Komputer(1, true);
        Komputer komputer2 = new Komputer(2, true);

        Pracownia pracownia = new Pracownia();
        pracownia.dodajKomputerDoUcznia(uczen1, komputer1);
        pracownia.dodajKomputerDoUcznia(uczen2, komputer2);

        pracownia.wyswietlPracownie();
    }
}
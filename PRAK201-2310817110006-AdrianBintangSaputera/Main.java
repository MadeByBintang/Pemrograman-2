package PRAK201_2310817110006_AdrianBintangSaputera;

public class Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0, 40.0);
        Buah mangga = new Buah("Mangga", 0.2,3500.0, 15.0);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0, 12.0);
        apel.display();
        mangga.display();
        alpukat.display();
    }
}
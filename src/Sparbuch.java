public class Sparbuch {
    private int kontonummer;
    private double kapital;
    private double zinssatz;

    public Sparbuch(int kontonummer, double kapital, double zinssatz) {
        this.kontonummer = kontonummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }
    public void zahleEin(double betrag) {
        kapital = kapital + betrag;
    }
    public void hebeAb(double betrag) {
        kapital = kapital - betrag;
    }
    public double getErtrag (int jahre) {
        return kapital * (Math.pow(1 + zinssatz / 100.0, jahre) - 1);
    }
    public void verzinse() {
        kapital = kapital + getErtrag(6);
    }
    public int getKontonummer() {
        return kontonummer;
    }
    public double getKapital() {
        return kapital;
    }
    public double getZinssatz() {
        return zinssatz;
    }
}

public class Kiste {
    private int hoehe;
    private int breite;
    private int tiefe;
    private String farbe;
    private Etikett etikett;

    public Kiste(int hoehe, int breite, int tiefe, String farbe, String eigentuemer, String beschreibung) {
        this.farbe = farbe;
        this.tiefe = tiefe;
        this.breite = breite;
        this.hoehe = hoehe;
        this.etikett = new Etikett(eigentuemer, beschreibung);
    }
    public int getVolumen () {
        return hoehe * breite * tiefe;
    }
    public String getFarbe () {
        return this.farbe;
    }
    public Etikett getEtikett() {
        return this.etikett;
    }
}

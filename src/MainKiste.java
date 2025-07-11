//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainKiste {
    public static void main(String[] args) {
        Kiste Schatz = new Kiste (10, 5, 5, "rot", "Blackbeard", "Mein Gold");
        Kiste Umzug = new Kiste (20, 20, 20, "braun","Tante Erna", "Teetassen");
        Kiste Sarg = new Kiste (15, 20, 100, "schwarz", "Rübezahl", "Riesensarg");
        System.out.println("Volumen: " + Schatz.getVolumen() + " cm³");
        System.out.println("Farbe: " + Schatz.getFarbe());
        System.out.println("Eigentümer: " + Schatz.getEtikett().getEigentuemer());
        System.out.println("Beschreibung: " + Schatz.getEtikett().getBeschreibung());
        System.out.println("Volumen: " + Umzug.getVolumen() + " cm³");
        System.out.println("Farbe: " + Umzug.getFarbe());
        System.out.println("Eigentümer: " + Umzug.getEtikett().getEigentuemer());
        System.out.println("Beschreibung: " + Umzug.getEtikett().getBeschreibung());
        System.out.println("Volumen: " + Sarg.getVolumen() + " cm³");
        System.out.println("Farbe: " + Sarg.getFarbe());
        System.out.println("Eigentümer: " + Sarg.getEtikett().getEigentuemer());
        System.out.println("Beschreibung: " + Sarg.getEtikett().getBeschreibung());

        Lager Kistenstellplatz = new Lager(10000);
        Kistenstellplatz.addKiste(Schatz);
        Kistenstellplatz.addKiste(Umzug);
        Kistenstellplatz.addKiste(Sarg);
        Kistenstellplatz.druckeAlleKisten();
    }
}
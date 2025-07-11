import java.util.ArrayList;

public class Lager {
    private ArrayList<Kiste> kisten;
    private int maxVol;

    public Lager(int maxVol) {
        this.kisten = new ArrayList<>();
        this.maxVol = maxVol;
    }
    public void addKiste(Kiste kiste) {
        int newVol = getGesVol() + kiste.getVolumen();
        if (newVol <= maxVol) {
            kisten.add(kiste);
            System.out.println("Kiste in das Lager verladen.\nGesamtvolumen: " + newVol + " cm³");
        }
        else {
            System.out.println("Kiste NICHT in das Lager verladen. Das Lager ist zu klein!");
        }
    }
    public int getGesVol(){
        int summe = 0;
        for (Kiste kiste : kisten) {
            summe = summe + kiste.getVolumen();
        }
        return summe;
    }
    public void druckeAlleKisten() {
        if (kisten.isEmpty()) {
            System.out.println("Keine Kiste im Lager.");
        }
        else {
            System.out.println("Kisten im Lager:");
            for (Kiste kiste : kisten) {
                System.out.println("Farbe: " + kiste.getFarbe() + "\nVolumen: " + kiste.getVolumen() + " cm³");
            }
        }
    }
}

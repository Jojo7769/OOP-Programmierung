//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainKiste {
    public static void main(String[] args) {
        Kiste Schatz = new Kiste (10, 5, 5, "rot");
        System.out.println("Volumen: " + Schatz.getVolumen() + " cm³");
        System.out.println("Farbe: " + Schatz.getFarbe());

    }

}
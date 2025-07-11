package ktaris;

public class KtarisMain {

    public static void main(String[] args) {
        // Erzeugen der Objekte
        Gegenstand g1 = new Gegenstand("Quantenkanone", 17);
        Gegenstand g2 = new Gegenstand("Graviton-Blaster", 15);

        /* TODO: 1. Erzeugen Sie ein zusaetzliches Objekt g3, g4
         * die Attributwerte für alle Instanzvariablen finden Sie im Objektdiagramm
         * aus (Hinweis: verwenden Sie den vollparametrisierten Konstruktor)
         */

        /* TODO: 2. Erzeugen Sie das zusaetzliche Objekt g5 mit dem Konstruktor,
         * der nichts initialisiert (parameterloser Konstruktor),
         */

        // Setzen der Attribute

        /* TODO: 3. Fuegen Sie g5 die Attributwerte über die Setter hinzu, siehe Objektdiagramm
         */

        // Bildschirmausgabe
        System.out.println("Typ: " + g1.getTyp());
        System.out.println("Faktor: " + g1.getFaktor());
        System.out.println(g1.toString()); // Die toString() Methode wird aufgerufen
        System.out.println();
        System.out.println("Typ: " + g2.getTyp());
        System.out.println("Faktor: " + g2.getFaktor());
        System.out.println(g2); // Die toString() Methode wird selbstständig aufgerufen
        System.out.println();

        // TODO: 4. Ausgabe von g3, ergänzen Sie die fehlenden Methodenaufrufen
        System.out.println("Typ: ");
        System.out.println("Faktor: ");
        System.out.println(); // TODO: 5. Die toString() Methode wird aufgerufen
        System.out.println();

        /* TODO: 6. Geben Sie g4, g5 auch auf dem Bildschirm aus, in dem Sie die
         * fehlenden Methodenaufrufen ergänzen.
         */

    }

}
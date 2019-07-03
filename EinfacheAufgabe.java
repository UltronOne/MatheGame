import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.util.Random;

/*
Einfachste Variante einer Aufgabe
Zwei Zahlen werden zufällig gewählt. Wenn das Ergebnis die Summe der Zahlen war, ist die Aufgabe richtig gelöst worden
 */

public class EinfacheAufgabe extends Aufgabe
{
    // Die beiden Zahlen
    private int zahl1;
    private int zahl2;
private int zahl3;
    // Zufallsgenerator
    private Random random; 

    // Darstellung der Aufgabe
    private EinfacheAufgabeController controller;

    // Konstruktor
    public EinfacheAufgabe()
    {
        super(); //Aufruf des Konstruktors der Superklasse, könnte hier auch weggelassen werden

        punkte = 1;  // Soviele Punkte ist diese einfache Aufgabe wert

        // Erstellt ein Objekt für neue Zufallszahlen
        random = new Random();     

    }

    // Methoden
    /*
     * Diese Methode wird noch nicht verwendet
     */
    public  void richtigeLoesungAnzeigen(){}

    /*
     * Erstellt eine neue Aufgabe
     * Wählt die beiden Zahlen zahl1 und zahl2 neu zwischen 0 und 100
     */
    public void neu()
    {
        zahl1 = random.nextInt(100);
        zahl2 = random.nextInt(100);
        zahl3 = random.nextInt(100);
        controller.neueAufgabe(zahl1, zahl2, zahl3);
    }

    /*
     * Überprüft, ob die gegebene Antwort richtig war
     */
    public boolean loesungUeberpruefen(){
        int antwort = controller.getAntwort();
        int antwort1 = controller.getAntwort1();
        int antwort2 = controller.getAntwort2();
        if (zahl2 - antwort == zahl1 && antwort + zahl3 == antwort1&& antwort1+zahl2==antwort2)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    /*
     * Erstellt eine Darstellung für die einfache Aufgabe und gibt das Pane mit der Oberfläche zurück
     * Mit jedem Aufruf wird eine neue einfache Aufgabe mit anderen Zahlen erstellt
     */
    public  Pane darstellungErstellen(){
        // Lädt die Oberfläche 
        FXMLLoader loader = new FXMLLoader(getClass().getResource("einfacheaufgabe_view.fxml")); 

        try {
            Pane view = (Pane) loader.load();
            controller = loader.getController();
            // Füllt sie mit neuen Zahlen
            neu();
            // Gibt die neue Oberfläche zurück
            return view;
        }catch(IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}

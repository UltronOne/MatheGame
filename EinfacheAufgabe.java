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
    private String aufgabe;

    // Zufallsgenerator
    private Random random; 


    // Darstellung der Aufgabe
    private EinfacheAufgabeController controller;
    

    private String typString;
    
    private int typ;
    // Konstruktor
    public EinfacheAufgabe()
    {
        super(); //Aufruf des Konstruktors der Superklasse, könnte hier auch weggelassen werden

          // Soviele Punkte ist diese einfache Aufgabe wert

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
        typ = random.nextInt(4)+1;
        System.out.println(typ);
        switch(typ) {
            case 1:
            typString = "+";
            punkte = 1;
            controller.neueAufgabe(zahl1, zahl2, "+");
            break;
            case 2:
            typString = "-";
            punkte = 1;
            controller.neueAufgabe(zahl1, zahl2, "-");
            break;
            case 3:
            typString = "*";
            punkte = 2;
            controller.neueAufgabe(zahl1, zahl2, "*");
            break;    
            case 4:
            typString = "/";
            punkte = 2;
            controller.neueAufgabe(zahl1, zahl2, "/");
            break;
        }
    }

    /*
     * Überprüft, ob die gegebene Antwort richtig war
     */
    public boolean loesungUeberpruefen(String typp){
        int antwort = controller.getAntwort();

        switch(typp) {
            case "+":
           
             if (zahl1 + zahl2 == antwort){
                return true;
            }
            
            
            break;          

            case "-":
            if (zahl1 - zahl2 == antwort)
            {
                return true;
            }
            
            break;
            
            case"*":
            if (zahl1 * zahl2 == antwort)
            {
                return true;
            }
            
            break; 
            
            case "/":
            if (zahl1 / zahl2 == antwort)
            {
                return true;
            }
            
            break;
           
        }
            return false;
    }

    public String getTyp(){

        return typString ;
    }

    /*
     * Erstellt eine Darstellung für die einfache Aufgabe und gibt das Pane mit der Oberfläche zurück
     * Mit jedem Aufruf wird eine neue einfache Aufgabe mit anderen Zahlen erstellt
     */
    public  Pane darstellungErstellen(Controller c){
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

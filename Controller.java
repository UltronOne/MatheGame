
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import java.util.Random;
public class Controller
{
    // Anzeige der erreichten Punkte
    @FXML 
    private Label lblPunkte; 
    @FXML
    private Label rechenzeichen;
    // Der Button Prüfen oder Weiter
    @FXML
    private Button button;

    // Anzeige der Aufgabe
    @FXML
    private StackPane inhalt;

    // Aufgabe, die gerade angezeigt wird
    private Aufgabe a;

    // Anzeige, ob die Lösung richtig war
    @FXML
    private Label lblErgebnis;

    // Anzahl der Gesamtpunktzahl
    private int punkte;

    // Zustand
    int zustand; // 0: Aufgabe gestellt / 1: Antwort getippt

    /*
     * Wenn auf den Button geklickt wurde, wird diese Methode aufgerufen
     * Je nach Zustand wird etwas anderes auf dem Button angezeigt und tut
     * der Button auch etwas anderes
     */

    @FXML
    void buttonGeklickt(ActionEvent event) {
       
        switch (zustand)
        {
            case 0: { // Zustand Aufgabe gestellt
                
                // Es wird überprüft, ob die richtige Lösung eingegeben wurde

                boolean ergebnis = a.loesungUeberpruefen();
                if (ergebnis)
                {
                    // Richtig
                    lblErgebnis.setText("Super!");
                    punkte = punkte + a.getPunkte();
                    lblPunkte.setText("" + punkte);

                }
                else
                {
                    // Falsch
                    lblErgebnis.setText("Leider falsch");
                }
                // Der Zustand wird auf Antwort getippt gesetzt
                zustand = 1;
                button.setText("Weiter");

            } break;

            case 1: {  // Zustand Antwort getippt               
                a.neu(); // Eine neue Aufgabe wird angezeigt
                button.setText("Prüfen!"); 
                lblErgebnis.setText("");
                zustand = 0; // Zustand wird wieder auf Aufgabe gestellt gesetzt
            }
            Random r =new  Random(); 
        int i = r.nextInt(3);
        if (i== 0)
        {
         a= new EinfacheAufgabe();
          
        }
         else if (i ==1)
        {
          a= new Minus();
          
        }
         else if (i ==2)
        {
        a =new Multi();
     }
     // else if (i==3)
    // {
        // a= new Divi();
    // }
    inhalt.getChildren().clear();
    inhalt.getChildren().add(a.darstellungErstellen());
        // Punktstand am Anfang ist 0
       
        // Die Anwendung befindet sich im Zustand Aufgabe gestellt
        zustand = 0;
        lblErgebnis.setText("");
            break;
        
        }
    }
    /*
     * Diese Methode wird aufgerufen, wenn alle Label und Button vom Loader erstellt worden sind
     */
  
    @FXML 
    void initialize() {    
        
        Random r =new  Random(); 
        int i = r.nextInt(3);
        if (i== 0)
        {
         a= new EinfacheAufgabe();
          
        }
        else if (i ==1)
        {
         a= new Minus();
          
        }
        else if (i ==2)
        {
        a =new Multi();
         
    }
    // else if (i==3)
    // {
        // a= new Divi();
    // }
        // fügt die Darstellung der einfachen Aufgabe in die Oberfläche ein
        inhalt.getChildren().add(a.darstellungErstellen());
        // Punktstand am Anfang ist 0
        punkte = 0;
        // Die Anwendung befindet sich im Zustand Aufgabe gestellt
        zustand = 0;
        lblErgebnis.setText("");
    }
}


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.ProgressIndicator;
import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;

public class EinfacheAufgabeController {

    @FXML
    private Label aufgabentext;

    @FXML
    private TextField antwort;

    //@FXML
    //private ProgressIndicator progressIndicator;

    private Controller c;

    private String typ = "";

    /*
     * Setzt den Aufgabentext
     */
   
    public void neueAufgabe(int zahl1, int zahl2, String s)
    {
        
        typ = s;
        aufgabentext.setText(zahl1 + " " + s + " " + zahl2 + " = ");
        antwort.setText("");

        // set timer and progress bar
        //CountDown cd = new CountDown(progressIndicator,c);
        
    }

   
     
   
    
    @FXML
    void keyPressed(KeyEvent event) {

        if (event.getCode() == KeyCode.ENTER){

        }
    }

    /*
     * Holt die eingegebene Antwort
     */
    public int getAntwort()
    {
        int s = 999999;
        try {
            s = Integer.parseInt(antwort.getText());  
        } catch (Exception e) {

        }

         
        return s;
    }
}


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EinfacheAufgabeController {

    @FXML
    private Label aufgabentext;
    @FXML
    private Label aufgabentext1;
@FXML
    private Label aufgabentext2;
    @FXML
    private Label rechenzeichen;

    @FXML
    private TextField antwort;
@FXML
    private TextField antwort1;
    @FXML
    private TextField antwort2;
    /*
     * Setzt den Aufgabentext
     */
    public void neueAufgabe(int zahl1, int zahl2,int zahl3)
    {
        aufgabentext.setText(zahl1 +"");
        aufgabentext1.setText(zahl2+ "");
        aufgabentext2.setText(zahl3+ "");
        //antwort.setText(zahl1 + zahl2);
    }

    /*
     * Holt die eingegebene Antwort
     */
    public int getAntwort()
    {
        try {
            int s = Integer.parseInt(antwort.getText());
            return s;
        }catch(Exception ex)
        {
            return 1000000000;
        }
        

    }
    public int getAntwort1()
    {
        try {
            int s = Integer.parseInt(antwort1.getText());
            return s;
        }catch(Exception ex)
        {
            return 1000000000;
        }
        

    }
     public int getAntwort2()
    {
        try {
            int s = Integer.parseInt(antwort2.getText());
            return s;
        }catch(Exception ex)
        {
            return 1000000000;
        }
        

    }
}

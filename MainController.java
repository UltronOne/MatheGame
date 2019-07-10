import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCampain;

    @FXML
    private Button btnFreeplay;

    @FXML
    private Button btnScoreboard;

    @FXML
    void initialize() {
        assert btnCampain != null : "fx:id=\"btnCampain\" was not injected: check your FXML file 'daw.fxml'.";
        assert btnFreeplay != null : "fx:id=\"btnFreeplay\" was not injected: check your FXML file 'daw.fxml'.";
        assert btnScoreboard != null : "fx:id=\"btnScoreboard\" was not injected: check your FXML file 'daw.fxml'.";

    }
}

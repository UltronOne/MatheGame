import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

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
    void actCampain(ActionEvent event) throws Exception{
            Parent blah = FXMLLoader.load(getClass().getResource("view.fxml"));
            Scene scene = new Scene(blah);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
    }
    
    @FXML
    void initialize() {
        assert btnCampain != null : "fx:id=\"btnCampain\" was not injected: check your FXML file 'daw.fxml'.";
        assert btnFreeplay != null : "fx:id=\"btnFreeplay\" was not injected: check your FXML file 'daw.fxml'.";
        assert btnScoreboard != null : "fx:id=\"btnScoreboard\" was not injected: check your FXML file 'daw.fxml'.";

    }
}

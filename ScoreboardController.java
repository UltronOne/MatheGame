import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ScoreboardController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tblScoreboard;

    @FXML
    private TableColumn<?, ?> tblUser;

    @FXML
    private TableColumn<?, ?> tblScore;

    @FXML
    void initialize() {
        assert tblScoreboard != null : "fx:id=\"tblScoreboard\" was not injected: check your FXML file 'Untitled'.";
        assert tblUser != null : "fx:id=\"tblUser\" was not injected: check your FXML file 'Untitled'.";
        assert tblScore != null : "fx:id=\"tblScore\" was not injected: check your FXML file 'Untitled'.";

    }
}

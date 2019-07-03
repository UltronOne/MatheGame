import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import java.awt.Insets; 
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Darstellung als fxml-Datei
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
        Parent root = loader.load();

        // Neu Progress Bar
        ProgressBar progressBar = new ProgressBar();
        ProgressIndicator progressIndicator = new ProgressIndicator();
         
        // Hinzufügen der Progress Bar
        //root.setPadding(new Insets(10));
        //root.getChildren().addAll(progressBar, progressIndicator);
        
        // Fenster erstellen und anzeigen
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
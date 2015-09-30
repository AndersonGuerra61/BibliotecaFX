package biblioteca2011136;

import biblioteca2011136.controllers.AutoresController;
import biblioteca2011136.controllers.RootLayoutController;
import biblioteca2011136.models.Autor;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Nanoha Takamachi
 */
public class MainApp extends Application {
    
    private Stage primaryStage;
    private BorderPane rootLayout;
    public enum CRUDOperation {None, Create, Read, Update, Delete};
    
    public MainApp(){
        
    }
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("CET Kinal");
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("views/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            RootLayoutController controller = loader.getController();
            controller.setMainApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.autoresList = Autor.getAutoresList();
    }

    public void mostrarVistaAutores(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("views/Autores.fxml"));
            AnchorPane autoresPane = (AnchorPane) loader.load();
            AutoresController controller = loader.getController();
            controller.setMainApp(this);
            rootLayout.setCenter(autoresPane);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ObservableList<Autor> getAutoresList() {
        return autoresList;
    }
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

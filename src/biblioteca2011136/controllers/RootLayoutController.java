/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca2011136.controllers;

import biblioteca2011136.MainApp;
import biblioteca2011136.helpers.DBHelper;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;

/**
 *
 * @author angelchanquin
 */
public class RootLayoutController implements Initializable {
    
    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    @FXML
    private void salirDeAplicacion(){
        System.exit(0);
    }
    
    @FXML
    private void mostrarAutoresCRUD(){
        this.mainApp.mostrarVistaAutores();
    }

}

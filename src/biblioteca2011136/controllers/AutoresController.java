/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca2011136.controllers;

import biblioteca2011136.MainApp;
import biblioteca2011136.models.Autor;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author angelchanquin
 */
public class AutoresController implements Initializable {
    
    @FXML
    private TableView<Autor> tbvAutores;
    @FXML
    private TableColumn<Autor, String> tbcIdAutor;
    @FXML
    private TableColumn<Autor, String> tbcNombreAutor;
    
    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        tbvAutores.setItems(mainApp.getAutoresList());
    }

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        tbcIdAutor.setCellValueFactory(new PropertyValueFactory<Autor, String>("Id Carnet"));
        tbcNombreAutor.setCellValueFactory(new PropertyValueFactory<Autor, String>("Nombre Autor"));
        
        tbvAutores.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        
        tbvAutores.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Autor>() {        
            @Override
            public void changed(ObservableValue <? extends Autor> observable,
                Autor oldValue, Autor newValue) {
            }
        });
    }
}

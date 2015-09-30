/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca2011136.models;

import biblioteca2011136.helpers.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author angelchanquin
 */
public class Autor {
    
    private String idAutor;
    private String nombreAutor;

    public Autor(String idAutor, String nombreAutor) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
    }

    public Autor() {
        
    }

    public String getIdAutor() {
        return idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public static ObservableList<Autor> getAutoresList(){
        ObservableList<Autor> autores = FXCollections.observableArrayList();
        
        try{
            Connection con = DBHelper.getConnection();
            String sql = "SELECT * FROM Autor";
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                Autor autor = new Autor();
                
                autor.setIdAutor(rs.getString("idAutor"));
                autor.setNombreAutor(rs.getString("nombreAutor"));
                
                autores.add(autor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return autores;
    }
}

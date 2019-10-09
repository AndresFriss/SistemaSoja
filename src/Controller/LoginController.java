/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Telas.Login;
import Telas.TelaPrincipal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author andres.friss
 */
public class LoginController implements Initializable {

    @FXML private TextField textoUsuario;

    @FXML private PasswordField textoSena;

    @FXML private Button botonEntrar;

    @FXML private Button botonCancelar;

    @FXML
    void cerrar(ActionEvent event) {
        cerrar();
    }

    @FXML
    void logar(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        botonEntrar.setOnMouseClicked((MouseEvent e) -> {
            logar();
        });
        
        botonEntrar.setOnKeyPressed((KeyEvent e) -> {
            if(e.getCode() == KeyCode.ENTER)
            logar();
        });
        
        textoSena.setOnKeyPressed((KeyEvent e) -> {
            if(e.getCode() == KeyCode.ENTER)
            logar();
        });
    }    
    
    private void cerrar(){
        Login.getStage().close();
    }
    
    private void logar(){
        if (textoUsuario.getText().equals("") && textoSena.getText().equals("")){
            TelaPrincipal p = new TelaPrincipal();
            cerrar();
            try {
                p.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Login invalido");
            alert.setContentText("Usuario o seña erroneos!");
            alert.show();
        }
    }
}

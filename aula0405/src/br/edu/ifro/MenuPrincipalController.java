/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 *
 * @author 04223376250
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private TextField txtNumero1, txtNumero2, txtResultado;
    
     private Button bntSoma;
     @FXML
    private Button btnFechar;
     @FXML
    private Label label;
     @FXML
    private Menu Cadastros;
     @FXML
    private MenuItem btnfechar;
    
    @FXML
    private void soma(ActionEvent event) {
      Double num1 = Double.parseDouble(txtNumero1.getText());
     Double num2 = Double.parseDouble(txtNumero1.getText());
     Double resultado = num1+num2;
     
     txtResultado.setText(resultado.toString());
         


    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
       private void abrirCadastroAluno(ActionEvent event) {
    try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar AlunoS");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}
    }
    @FXML
       private void fecharProjeto(ActionEvent event){
            Stage stage = (Stage) btnFechar.getScene().getWindow();
    stage.close();
       }
}

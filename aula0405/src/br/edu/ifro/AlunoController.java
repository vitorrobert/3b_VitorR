/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.modelo.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 04223376250
 */
public class AlunoController implements Initializable {

    @FXML
    private TextField txtNome;

    /**
     * Initializes the controller class.
     */
      
    public void start(Stage stage) throws Exception {
    // inica conexão
  
    //termina conexão
        Parent root = FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
           EntityManagerFactory emf= Persistence.createEntityManagerFactory("aula");
    EntityManager em= emf.createEntityManager();
      Aluno aluno= new Aluno();
    aluno.setNome("one");
    aluno.setCpf("99999");

 
    em.getTransaction().begin();
    em.persist(aluno);
    em.getTransaction().commit();
    }

    @FXML
    private void fechar(ActionEvent event) {
    }
    
}

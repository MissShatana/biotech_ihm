/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_biotech;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Natashaa
 */
public class Projet_biotech extends Application {
    private Connexion_form connexion;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("gestionnaire d'étudiants Gphy");
        Group root,menu;
        root= new Group();
        Scene scene = new Scene(root,1300,700);
        menu = new Group();
        connexion= new Connexion_form(this);
        root.getChildren().add(connexion);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_biotech;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Natashaa
 */
public class Connexion_form extends Parent{
    
    private final TextField identifiant = new TextField();
    private final TextField mdp = new TextField();
    private Button submitButton;
    private GridPane gridPane;
    private Projet_biotech pb;
    
    /**
     * This method builds a form to enter information of a new student
     * @param mypb the main class
     */
    public Connexion_form(Projet_biotech mypb){
        pb=mypb;
        // Instantiate a new Grid Pane
        gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        gridPane.setHgap(50);

        // Set the vertical gap between rows
        gridPane.setVgap(30);

        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(150, 150, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(300,300, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
       
        // Add Header
        Label headerLabel = new Label("Connexion");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add surname Label
        Label idLabel = new Label("Identifiant : ");
        gridPane.add(idLabel, 0,1);

        // Add surname Text Field
        identifiant.setPrefHeight(40);
        gridPane.add(identifiant, 1,1);

        // Add name Label
        Label mdpLabel = new Label("Mot de passe : ");
        gridPane.add(mdpLabel, 0, 2);

        // Add name Text Field
        mdp.setPrefHeight(40);
        gridPane.add(mdp, 1, 2);


        // Add Submit Button
        submitButton = new Button("Valider");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        //EcouteurForm e = new EcouteurForm(this,pb);
        //submitButton.setOnAction(e);

        //Add a background
        Rectangle fond = new Rectangle();
        fond.setHeight(350);
        fond.setWidth(700);
        fond.setFill(Color.BLANCHEDALMOND);
        this.getChildren().add(fond);
        fond.setTranslateX(50);
        fond.setTranslateY(30);
        fond.setStroke(Color.BLACK);

        gridPane.add(submitButton, 2, 3, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));
        this.getChildren().add(gridPane);
    } 
    
    public Button getButton(){
        return submitButton;
    }
    
    public String getIdentifiant(){
        return identifiant.getText();
    }
    
    public String getMdp(){
        return mdp.getText();
    }
    
    public GridPane getPane(){
        return gridPane;
    }
}

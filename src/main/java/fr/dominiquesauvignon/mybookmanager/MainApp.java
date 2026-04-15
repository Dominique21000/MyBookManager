package fr.dominiquesauvignon.mybookmanager;

import java.io.IOException;

import fr.dominiquesauvignon.mybookmanager.model.Livre;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application{

	@Override
    public void start(Stage primaryStage) throws IOException {

		/*
		primaryStage.setTitle("Gestion de Livres");

        // Champs de saisie
        TextField champTitre = new TextField();
        champTitre.setPromptText("Titre du livre");
        
        TextField champAuteur = new TextField();
        champAuteur.setPromptText("Auteur");
        
        TextField champAnnee = new TextField();
        champAnnee.setPromptText("Année de publication");

        // Liste pour afficher les livres
        ListView<Livre> listeLivres = new ListView<>();

        // Bouton d'ajout
        Button btnAjouter = new Button("Ajouter le livre");
        
        btnAjouter.setOnAction(e -> {
            try {
                String titre = champTitre.getText();
                String auteur = champAuteur.getText();
                int annee = Integer.parseInt(champAnnee.getText());

                if (!titre.isEmpty() && !auteur.isEmpty()) {
                    Livre nouveauLivre = new Livre(titre, auteur, annee);
                    listeLivres.getItems().add(nouveauLivre);
                    
                    // Vider les champs
                    champTitre.clear();
                    champAuteur.clear();
                    champAnnee.clear();
                } else {
                    new Alert(Alert.AlertType.WARNING, "Veuillez remplir tous les champs correctement.").show();
                }
            } catch (NumberFormatException ex) {
                new Alert(Alert.AlertType.ERROR, "L'année doit être un nombre.").show();
            }
        });
        */

		/*
        // Mise en page
        VBox root = new VBox(10);
        root.getChildren().addAll(champTitre, champAuteur, champAnnee, btnAjouter, new Label("Liste des livres :"), listeLivres);

		*/
		
		/*
        Scene scene = new Scene(root, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        */
		
		// Chargement du fichier xml
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("My Book Manager");
        primaryStage.setScene(new Scene(root, 500,500));
        primaryStage.show();
        
    }
	
	public static void main(String[] args) {
		launch(args);

	}

}

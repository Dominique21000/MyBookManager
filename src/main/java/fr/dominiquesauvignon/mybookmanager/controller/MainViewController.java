package fr.dominiquesauvignon.mybookmanager.controller;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;
import fr.dominiquesauvignon.mybookmanager.model.Livre;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainViewController implements Initializable{

	// Ces variables sont liées automatiquement grâce à fx:id dans le FXML
    @FXML private TextField champTitre;
    @FXML private TextField champAuteur;
    @FXML private TextField champAnnee;
    @FXML private Button btnAjouter;
    @FXML private ListView<Livre> listeLivres;
  

    @FXML
    private void handleAjouter(ActionEvent event) {
        try {
            String titre = champTitre.getText();
            String auteur = champAuteur.getText();
            String anneeText = champAnnee.getText();

            if (!titre.isEmpty() && !auteur.isEmpty() && !anneeText.isEmpty()) {
                int annee = Integer.parseInt(anneeText);
                Livre nouveauLivre = new Livre(titre, auteur, annee);
                listeLivres.getItems().add(nouveauLivre);
                
                // Vider les champs
                champTitre.clear();
                champAuteur.clear();
                champAnnee.clear();
                champTitre.requestFocus();
            } else {
                new Alert(Alert.AlertType.WARNING, "Veuillez remplir tous les champs.").show();
            }
        } catch (NumberFormatException e) {
            new Alert(Alert.AlertType.ERROR, "L'année doit être un nombre.").show();
        }
    }



	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}	
}

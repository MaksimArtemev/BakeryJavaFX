package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class windowController implements Initializable {
	
	private String[] choices = {"cake", "chicken", "salad", "salmon", "smoothie"};
	
	private Recipes recipes = new Recipes();
	
	
	@FXML
	private ChoiceBox<String> itemPicker;
	
	@FXML
	private Button AddItem;
	
	@FXML
	private Button ShowResults;
	
	@FXML
	private TextField portion;

	@FXML 
	private TextArea resultsBox;
	
	@FXML 
	private Button btnPlay;
	
	@FXML 
	private MediaView mediaView;
	
	private File mediaFile = new File("CakeVideo.mp4");
	private Media media;
	private MediaPlayer mediaPlayer;
	
	//@FXML
	//private ImageView chickenImageView;
	

	
	@FXML
	public void ShowResults(ActionEvent event) {
		resultsBox.setText(recipes.results());
	}
	
	// Event Listener on Button.onTouchPressed

	
	
	@FXML
	public void AddItemMethod(ActionEvent event) {
		try{
			boolean added = recipes.recipeManager(itemPicker.getValue(),Integer.parseInt(portion.getText()));
			if(added)
			{
				portion.setText("Added");
			}
			else
			{
				portion.setText("Error");
			}
		}
		catch(Exception e)
		{
			portion.setText("Error");
		}
	}
	
	
	@FXML
	public void PlayMediaFile(ActionEvent event) {
		this.mediaPlayer.stop();
		this.mediaPlayer.play();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1){
		// TODO Auto-generated method stub

		itemPicker.getItems().addAll(choices);
		
		this.media = new Media(mediaFile.toURI().toString());
		this.mediaPlayer = new MediaPlayer(media);
		this.mediaView.setMediaPlayer(this.mediaPlayer);
		
		
		//Image imageChicken = new Image("chicken.jpg");
		//this.chickenImageView.setImage(imageChicken);
		//Photo by <a href="https://unsplash.com/@tempestdesigner?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Mark DeYoung</a> on <a href="https://unsplash.com/s/photos/food-chicken?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Unsplash</a>
		
 
	}
}
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;
public class OceanExplorer extends Application{
	public static void main(String args[]) {
		launch(args);
		
	}

	@Override
	public void start(Stage oceanStage) throws Exception {
		// TODO Auto-generated method stub
		oceanStage.setTitle("My Island");
		AnchorPane a_pane = new AnchorPane();
		Scene scene = new Scene(a_pane,400,300);
		oceanStage.setScene(scene);
		oceanStage.show();
		
	}

}

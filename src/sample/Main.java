/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * @param primaryStage Primary stage.
     * @throws Exception Exception.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = (Pane)FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();

    }

    /**
     * @author Ahmed Abuwarda, Date: Aug 31,2019.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        launch(args);

    }

}
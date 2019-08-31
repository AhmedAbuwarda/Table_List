/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;

import java.awt.*;

/**
 * @author Ahmed Abuwarda, Date: Aug 31,2019.
 */
public class Controller {

    @FXML
    private TextField text;

    @FXML
    private Button button;

    /**
     * @param event Event.
     */
    @FXML
    void onSubmitClick(ActionEvent event) {

        System.out.println(text.getText());

    }

}
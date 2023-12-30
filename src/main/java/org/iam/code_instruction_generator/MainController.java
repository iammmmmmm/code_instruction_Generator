package org.iam.code_instruction_generator;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.iam.code_instruction_generator.entity.json;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * 主ui控制类
 *
 * @author Iammm
 * @Time 2023/12/30 16:08
 */
public class MainController {

    json json = new json();
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    @FXML // fx:id="CopyButton"
    private Button CopyButton; // Value injected by FXMLLoader
    @FXML // fx:id="ParametersList"
    private TreeView<?> ParametersList; // Value injected by FXMLLoader
    @FXML // fx:id="ResetButton"
    private Button ResetButton; // Value injected by FXMLLoader
    @FXML // fx:id="SearchButton"
    private Button SearchButton; // Value injected by FXMLLoader
    @FXML // fx:id="SearchTextField"
    private TextField SearchTextField; // Value injected by FXMLLoader
    @FXML // fx:id="StageTittle"
    private Label StageTittle; // Value injected by FXMLLoader
    @FXML // fx:id="closeButton"
    private Button closeButton; // Value injected by FXMLLoader
    @FXML // fx:id="codeView"
    private TextArea codeView; // Value injected by FXMLLoader
    @FXML // fx:id="fullScreenButton"
    private Button fullScreenButton; // Value injected by FXMLLoader
    @FXML // fx:id="hideButton"
    private Button hideButton; // Value injected by FXMLLoader
    @FXML // fx:id="iconLable"
    private Label iconLable; // Value injected by FXMLLoader
    @FXML // fx:id="jsonList"
    private TreeView<?> jsonList; // Value injected by FXMLLoader

    @FXML
    void close(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void copy(MouseEvent event) {
        codeView.copy();
    }

    @FXML
    void fullScreen(MouseEvent event) {

    }

    @FXML
    void hideWindow(MouseEvent event) {

    }

    @FXML
    void setItem(MouseEvent event) {
        ParametersList = new TreeView<>();
        for (var a : json.getParameters()) {

        }
    }

    @FXML
    void search(MouseEvent event) {

    }

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert CopyButton != null : "fx:id=\"CopyButton\" was not injected: check your FXML file 'main.fxml'.";
        assert ParametersList != null : "fx:id=\"ParametersList\" was not injected: check your FXML file 'main.fxml'.";
        assert ResetButton != null : "fx:id=\"ResetButton\" was not injected: check your FXML file 'main.fxml'.";
        assert SearchButton != null : "fx:id=\"SearchButton\" was not injected: check your FXML file 'main.fxml'.";
        assert SearchTextField != null : "fx:id=\"SearchTextField\" was not injected: check your FXML file 'main.fxml'.";
        assert StageTittle != null : "fx:id=\"StageTittle\" was not injected: check your FXML file 'main.fxml'.";
        assert closeButton != null : "fx:id=\"closeButton\" was not injected: check your FXML file 'main.fxml'.";
        assert codeView != null : "fx:id=\"codeView\" was not injected: check your FXML file 'main.fxml'.";
        assert fullScreenButton != null : "fx:id=\"fullScreenButton\" was not injected: check your FXML file 'main.fxml'.";
        assert hideButton != null : "fx:id=\"hideButton\" was not injected: check your FXML file 'main.fxml'.";
        assert iconLable != null : "fx:id=\"iconLable\" was not injected: check your FXML file 'main.fxml'.";
        assert jsonList != null : "fx:id=\"jsonList\" was not injected: check your FXML file 'main.fxml'.";

    }
}


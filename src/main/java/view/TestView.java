package view;

import controller.TestController;
import controller.eventhandler.EventTestHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * @author Kevin We. on 01.11.2017.
 * Main Class for the View.
 * Must be given the Stage from the Application class start method .(TestMain)
 */
public class TestView {

    private TestController testController;
    private Button labelChangeButton;
    private Label label;

    //Stage given by the start method.must be allocated inside the constructor.
    private Stage primaryStage;


    //The view is being given the primary stage ( the main window )
    public TestView(TestController testController, Stage primaryStage) {
        this.testController = testController;
        this.primaryStage = primaryStage;
        this.testController.setTestView(this);
        initializeComponents();
        initializePrimaryStage();

        //View makes sure the binding is done by calling the controller and invoke the doBinding Method of the DataBindUtil -
        // (!)after every view element has been instantiated - as the last statement in the view constructor.(view -> model , model -> view )
        this.testController.getDataBindingUtil().doBinding();
    }

    //initialize components of the view
    private void initializeComponents() {
        this.labelChangeButton = new Button("LabelInfoChanger");
        this.labelChangeButton.setOnAction(new EventTestHandler(this.testController));

        this.label = new Label();
        this.label.textProperty().bind(this.getTestController().getTestModel().infoProperty());
    }

    //initialize attributes for the Java FX primary stage
    private void initializePrimaryStage() {
        this.primaryStage.setTitle("TestXy");
        this.primaryStage.setMinWidth(150);
        this.primaryStage.setMinHeight(100);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(this.labelChangeButton,this.label);
        Scene scene = new Scene(vBox,150,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Getter-Setter
    public TestController getTestController() {
        return testController;
    }

    public void setTestController(TestController testController) {
        this.testController = testController;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Button getLabelChangeButton() {
        return labelChangeButton;
    }

    public void setLabelChangeButton(Button labelChangeButton) {
        this.labelChangeButton = labelChangeButton;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

}

import controller.TestController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.TestModel;
import view.TestView;

/**
 * @author Kevin We. on 01.11.2017.
 * Contains the Main method and extends javafx.application.Application.
 */
public class TestMain extends Application{

    //Main Method.Invokes launch(args) to start the FX Application.
    public static void main(String[] args) {
        launch(args);
    }

    //Being invoked by main via 'launch(args);'
    @Override
    public void start(Stage primaryStage) throws Exception {
        TestModel testModel = new TestModel();
        TestController testController = new TestController(testModel);
        TestView testView = new TestView(testController,primaryStage);
    }
}

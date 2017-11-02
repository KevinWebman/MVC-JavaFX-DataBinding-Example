package controller.eventhandler;


import controller.TestController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Kevin We. on 02.11.2017
 * Instance of EventHandler which is comparable with an ActionListener in some kind if you look at swing.
 */
public class EventTestHandler implements EventHandler<ActionEvent> {

    //Instance of the controller to access the data model.
    private TestController testController;

    //Constructor
    public EventTestHandler(TestController testController) {
        this.testController = testController;
    }

    //Method is being invoked when a button, which added this class as EventHandler, is clicked.
    @Override
    public void handle(ActionEvent event) {
        //Check the model info and change it.
        switch (this.testController.getTestModel().getInfo()){
            case "Want sum buk?" :
                this.testController.getTestModel().setInfo("No Thanks.");
                break;
            case "No Thanks." :
                this.testController.getTestModel().setInfo("Want sum buk?");
                break;
            default:
                this.testController.getTestModel().setInfo("Want sum buk?");

        }
    }
}

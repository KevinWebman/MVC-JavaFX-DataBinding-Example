package controller.util;

import controller.TestController;

/**
 * @author Kevin We. on 02.11.2017.
 * Class which contains methods for the active binding of properties| model < - > view |
 */
public class DataBindingUtil {
    private TestController testController;

    //constructor being given the controller(TestController) to be able to access every part of the model / view for the binding process
    public DataBindingUtil(TestController testController) {
        this.testController = testController;
    }

    //Invoke method after an instance of view has been created to initialize the data binding part of the program..
    public void doBinding(){
        //Call methods to initialize explicit data binding
        bindTestViewElements();
        bindExampleXyElements();
    }

    //Bind Elements of the view to the model..In this case the elements of the TestView.
    // To make the code better readable use this naming convention : private void bind[name of View Class]Elements(); (TestView.class -> bindTestViewElements)
    private void bindTestViewElements(){
        //only 1 element here for demonstration purposes
        this.testController.getTestView().getLabel().textProperty().bind(testController.getTestModel().infoProperty());
    }

    //Method being invoked by doBinding.
    private void bindExampleXyElements(){
        //Bindings for the ExampleXy Class properties.
    }
}

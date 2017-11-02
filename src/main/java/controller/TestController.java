package controller;

import controller.util.DataBindingUtil;
import model.TestModel;
import view.TestView;

/**
 * @author Kevin We. on 01.11.2017.
 * Main Controller class.Contains the business logic ,logic containing classes.
 */
public class TestController {
    private TestModel testModel;
    private TestView testView;
    //Util class to initialize the Data Binding
    private DataBindingUtil dataBindingUtil;

    //Constructor
    public TestController(TestModel testModel) {
        this.testModel = testModel;
        this.dataBindingUtil = new DataBindingUtil(this);
    }

    //Getter-Setter
    public TestModel getTestModel() {
        return testModel;
    }

    public void setTestModel(TestModel testModel) {
        this.testModel = testModel;
    }

    public TestView getTestView() {
        return testView;
    }

    public void setTestView(TestView testView) {
        this.testView = testView;
    }

    public DataBindingUtil getDataBindingUtil() {
        return dataBindingUtil;
    }

    public void setDataBindingUtil(DataBindingUtil dataBindingUtil) {
        this.dataBindingUtil = dataBindingUtil;
    }
}

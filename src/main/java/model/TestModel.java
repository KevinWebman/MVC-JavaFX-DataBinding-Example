package model;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author Kevin We. on 01.11.2017.
 * Main Class for the Data Model.Access all object data models from here.This class contains every information storing class in the program.
 */
public class TestModel {
    //Some model information to be displayed through the view.
    private SimpleStringProperty info;

    //The constructor makes sure the properties and class objects are instantiated
    public TestModel() {
        info = new SimpleStringProperty();
        info.set("Want sum buk?");
    }

    //Getter-Setter + property method to make the data binding possible.
    public String getInfo() {
        return info.get();
    }

    public SimpleStringProperty infoProperty() {
        return info;
    }

    public void setInfo(String info) {
        this.info.set(info);
    }
}

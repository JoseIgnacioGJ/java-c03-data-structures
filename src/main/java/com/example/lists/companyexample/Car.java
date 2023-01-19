package main.java.com.example.lists.companyexample;

public class Car {

    private String model;
    private String matricule;
    private String color;

    public Car(){}

    public Car(String model, String matricule, String color) {
        this.model = model;
        this.matricule = matricule;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", matricule='" + matricule + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

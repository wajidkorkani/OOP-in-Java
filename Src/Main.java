class Car { // Car class is being created
    String name;
    int model;

    // Constructor which will ask for values when object will be created
    public Car(String name, int model){
        this.name = name;
        this.model = model;
    }

    // Constructor which will add default values when object will be created
    public Car(){
        this.name = "Ferrari";
        this.model = 2025;
    }

    void check() {
        System.out.println("Name is " + name + " Model is " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car(); // Getting values from default constructor
        carOne.check();
        Car carTwo = new Car(); // Getting values from default constructor
        carTwo.name = "BMW";  // Changing values of default constructor
        carTwo.check();
        Car carThree = new Car("Tesla X", 2025);  // Using constructor which asks for values
        carThree.check();
    }
}

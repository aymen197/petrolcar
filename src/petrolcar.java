class Vehicle {
    String brand = "OPEL";
    int topSpeed = 180;

    public void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}
class EVCar extends Vehicle {
    int batteryCapacity = 75;

    public void showEVDetails() {
        System.out.println("This " + brand + " has a " + batteryCapacity + "kWh battery.");
    }
}
class Main {
    public static void main(String[] args) {
        EVCar myEv = new EVCar();
        myEv.displaySpecs();
        myEv.showEVDetails();
    }
}

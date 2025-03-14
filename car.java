public class Car {
    // Private classes
    private String modelName;
    private boolean isAvailable;

    // Constructor
    public Car(String modelName, boolean isAvailable) {
        this.modelName = modelName;
        this.isAvailable = isAvailable;
    }

    
    public String rentCar() {
        if (isAvailable) {
            isAvailable = false; 
            return "The car " + modelName + " has been rented out.";
        } else {
            return "Ooops, the car " + modelName + " is not available.";
        }
    }

  
    public void returnCar() {
        isAvailable = true; 
        System.out.println("The car " + modelName + " has been returned and is now available.");
    }

    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    
    public String getModelName() {
        return modelName;
    }
}


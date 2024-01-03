class Apple {
    int xPos, yPos;
    float mass, diameter;

    boolean isTouching(Apple other)
    {
        //X and Y differences
        double xDiff = xPos - other.xPos;
        double yDiff = yPos - other.yPos;

        // Distance between the 2 object
        double dist = Math.sqrt(xDiff * xDiff + yDiff * yDiff);

        if(dist < ((diameter / 2) + (other.diameter / 2)))
            return true;
        else    
            return false;
    }

    void printDetails() {
        System.out.println("Mass: " + mass);
        System.out.println("Diameter: " + diameter);
        System.out.printf("Position: {%d, %d}", xPos, yPos);        
    }
}

public class AppleDetails {
    
    //Printing basic details
    public void PrintDetails1(Apple a) {
        System.out.println("Mass: " + a.mass);
        System.out.println("Diameter: " + a.diameter);
        System.out.printf("Position: {%d, %d}", a.xPos, a.yPos);
    }

    //Modifying and prints details
    public void PrintDetails2(Apple a) {
        System.out.println("Mass: " + a.mass);
        System.out.println("Diameter: " + a.diameter);
        System.out.printf("Position: {%d, %d}", a.xPos, a.yPos);

        //Modifying position values
        a.xPos = (int)Math.random() * 10;
        a.yPos = (int)Math.random() * 10;
        System.out.println("Mass: " + a.mass);
        System.out.println("Diameter: " + a.diameter);
        System.out.printf("Position: {%d, %d}");
    }

    //Calling method from Apple class
    public void PrintDetails3(Apple a) {
        a.printDetails();
        //Modifying position values
        a.xPos = (int)Math.random() * 10;
        a.yPos = (int)Math.random() * 10;
        a.printDetails();
    }

    public static void main(String[] args) {
        Apple a1 = new Apple();

        a1.mass = 5.0f;
        a1.diameter = 1.0f;
        a1.xPos = a1.yPos = 0;
    }
}
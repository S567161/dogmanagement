package pen;

public class PenDriver {
    public static void main(String[] args) {
        // Create an instance of the Pen class with specified attributes
        Pen pen = new Pen(50.0, 0.2);

        // Display the values using the print method
        System.out.println("Category: Pen");
        pen.print();

        // Modify the program to enter attributes from variables
        double customLengthofpencil = 60.0;
        double customDiameterofpencil = 0.6;
        double customLengthofbic = 70.0;
        double customDiameterofbic = 0.7;
        double customLengthoffeather = 80.0;
        double customDiameteroffeather = 0.8;
        System.out.println("\nEnter Length for Pencil :"+customLengthofpencil);
        System.out.println("Enter Diameter Pencil :"+customDiameterofpencil);
        System.out.println("\nEnter Length for Bic :"+customLengthofbic);
        System.out.println("Enter Diameter for Bic :"+customDiameterofbic);
        System.out.println("\nEnter Length for Feather :"+customLengthoffeather);
        System.out.println("Enter Diameter for Feather :"+customDiameteroffeather);
        

        // Create instances of derived subclasses
        Pencil pencil = new Pencil(60.0, 0.6);
        Bic bic = new Bic(70.0, 0.7);
        Feather feather = new Feather(80.0, 0.8);

        // Display the attributes and category of each pen
       // System.out.println("\nPencil:");
        System.out.println("\nCategory: " + pencil.getCategory());
        pencil.print();

      //  System.out.println("\nBic:");
        System.out.println("\n\nCategory: " + bic.getCategory());
        bic.print();

       // System.out.println("\nFeather:");
        System.out.println("\n\nCategory: " + feather.getCategory());
        feather.print();
    }
}

class Pencil extends Pen {
    public Pencil(double length, double diameter) {
        super(length, diameter);
    }

    public String getCategory() {
        return "Pencil";
    }
}

class Bic extends Pen {
    public Bic(double length, double diameter) {
        super(length, diameter);
    }

    public String getCategory() {
        return "Bic";
    }
}

class Feather extends Pen {
    public Feather(double length, double diameter) {
        super(length, diameter);
    }

    public String getCategory() {
        return "Feather";
    }
}


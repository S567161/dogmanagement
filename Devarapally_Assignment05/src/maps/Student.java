package maps;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/

public class Student {
    private int sID;
    private String name;
    private String branch;
    private String registeredCourse;
    private String school;
    
    // Constructor to initialize the instance variables
    public Student(int sID, String name, String branch, String registeredCourse, String school) {
        this.sID = sID;
        this.name = name;
        this.branch = branch;
        this.registeredCourse = registeredCourse;
        this.school = school;
    }
    
    // Getter methods for all instance variables
    public int getSID() {
        return sID;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getRegisteredCourse() {
        return registeredCourse;
    }

    public String getSchool() {
        return school;
    }
}


package maps;
/**
*
* @author S567161 Udaykiranreddy Devarapally
*/



import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMap {
    private Map<Integer, Map<String, String>> studentMap;

    public StudentMap() {
        this.studentMap = new LinkedHashMap<>();
    }

    public void insertStudentDetails(Student s) {
        Map<String, String> details = new LinkedHashMap<>();
        details.put("name", s.getName());
        details.put("branch", s.getBranch());
        details.put("courseRegistered", s.getRegisteredCourse());
        details.put("school", s.getSchool());

        studentMap.put(s.getSID(), details);
    }

    public void printStudentDetails() {
        for (Map.Entry<Integer, Map<String, String>> entry : studentMap.entrySet()) {
            System.out.println("*****************");
            System.out.println("Student ID: " + entry.getKey());
            Map<String, String> details = entry.getValue();
            for (Map.Entry<String, String> detail : details.entrySet()) {
                System.out.println(detail.getKey() + ": " + detail.getValue());
            }
        }
    }

    public void updateStudentCourse(int sID, String course) {
        if (studentMap.containsKey(sID)) {
            Map<String, String> details = studentMap.get(sID);
            details.put("courseRegistered", course);
            studentMap.put(sID, details);
        } else {
            System.out.println("Student with ID " + sID + " not found.");
        }
    }

    public void deleteStudent(int sID) {
        if (studentMap.containsKey(sID)) {
            studentMap.remove(sID);
        } else {
            System.out.println("Student with ID " + sID + " not found.");
        }
    }
}


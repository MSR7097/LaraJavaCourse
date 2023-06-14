class Department {
    private String name;
    private String location;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getDepartmentInfo() {
        return name + " Department (" + location + ")";
    }
}

class University {
    private String name;
    private Department department; // Composition

    public University(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("University: " + name);
        System.out.println("Department: " + department.getDepartmentInfo());
    }
}

public class Main5 {
    public static void main(String[] args) {
        Department department = new Department("Computer Science", "Engineering Building");
        University university = new University("ABC University", department);
        university.displayInfo();
    }
}
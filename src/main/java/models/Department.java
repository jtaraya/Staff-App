package models;

public class Department {
    private String name;
    private String description;
    private int employeeCount;
    private int id;
//    private static ArrayList<Department> instances = new ArrayList<>();

    public Department(){}


    public Department(String name) {
        this.name = name;
    }

    public Department(String name, String description) {
        this.name = name;
        this.description= description;
//        this.createdAt = LocalDateTime.now();
    }
    public Department(String name, String description,int employeeCount) {
        this.name = name;
        this.description= description;
        this.employeeCount=employeeCount;
    }

}

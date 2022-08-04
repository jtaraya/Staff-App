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

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setId (int id) {this.id = id;}
    public int getId() {return id;}

    public void setDescription(String description){this.description = description;}
    public String getDescription(){return description;}

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

}

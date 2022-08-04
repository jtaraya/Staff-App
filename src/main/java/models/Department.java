package models;

public class Department {
    private String name;
    private String description;
    private int id;
    private long created;
    private long updated;
    private String deleted;

    public Department(String name, String description){
        this.name = name;
        this.description = description;
    }

}

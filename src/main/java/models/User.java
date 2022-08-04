package models;

public class User {
    private int id;
    private String staffName;
    private String staffPosition;
    private String staffRole;
    private int departmentId;

    public User(){}

    public User(String staffName) {
        this.staffName = staffName;
    }

    public User(String staffName, String staffPosition, String staffRole, int departmentId ) {
        this.staffName = staffName;
        this.staffPosition= staffPosition;
        this.staffRole = staffRole;
    }


    public int getId() {
        return 0;
    }
}

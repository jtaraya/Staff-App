package models;

public class User {
    private int id;
    private String first_name;
    private String last_name;
    private String staff_id;
    private String user_position;
    private String phone_no;
    private String email;
    private String photo;
    private long created;
    private long updated;
    private String deleted;

    public User(String firstName, String lastName, String staffId, String position, String phoneNo, String email, String photo){
        this.first_name = firstName;
        this.last_name = lastName;
        this.staff_id = staffId;
        this.user_position = position;
        this.phone_no = phoneNo;
        this.photo = photo;
    }



}

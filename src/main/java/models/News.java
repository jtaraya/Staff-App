package models;

public class News {
    private int id;
    //    private String generalContent;
    private String content;
    private int departmentId;
//    private LocalDateTime publishedAt;
//    private static ArrayList<News> instances = new ArrayList<>();

    public News(){
        this.id = id;
//        this.generalContent = generalContent;
        this.content = content;
        this.departmentId = departmentId;
//        this.publishedAt = LocalDateTime.now();
    }



    public void setId (int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }

//    public String getGeneralContent() {
//        return generalContent;
//    }
//
//    public void setGeneralContent(String generalContent) {
//        this.generalContent = generalContent;
//    }

    public int getDepartmentId() {

        return departmentId;
    }

    public void setDepartmentId(int departmentId) {

        this.departmentId = departmentId;
    }

//    public LocalDateTime getPublishedAt() {
//        return publishedAt;
//    }

//    public void setPublishedAt(LocalDateTime publishedAt) {
//        this.publishedAt = publishedAt;
//    }
}

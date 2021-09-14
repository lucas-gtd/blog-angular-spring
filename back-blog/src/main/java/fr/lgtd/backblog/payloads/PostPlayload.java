package fr.lgtd.backblog.payloads;

public class PostPlayload {

    private String content;
    private String title;
    private String date;
    private UserPayload user;

    public PostPlayload() {
    }

    public PostPlayload(String content, String title, String date, UserPayload user) {
        this.content = content;
        this.title = title;
        this.date = date;
        this.user = user;
    }

    public UserPayload getUser() {
        return this.user;
    }

    public void setUser(UserPayload user) {
        this.user = user;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}

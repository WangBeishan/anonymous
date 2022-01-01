package ml.sunmonkey.anonymousapi.model;

public class Content {

    private int userId;
    private String content;

    public Content() {
    }

    public Content(int userId, String content) {
        this.userId = userId;
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }
}

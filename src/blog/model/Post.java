package blog.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Post {

    private String title;
    private String text;
    private String category;
    private Date cratedDate;
    private SimpleDateFormat stf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

    public Post(String title, String text, String category, Date cratedDate) {
        this.title = title;
        this.text = text;
        this.category = category;
        this.cratedDate = cratedDate;
    }

    public Post() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCratedDate() {
        return cratedDate;
    }

    public void setCratedDate(Date cratedDate) {
        this.cratedDate = cratedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(title, post.title) &&
                Objects.equals(text, post.text) &&
                Objects.equals(category, post.category) &&
                Objects.equals(cratedDate, post.cratedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text, category, cratedDate);
    }

    @Override
    public String toString() {
       String result = "title: " + title;
       result += "\n category: " + category;
       result += "\n text: " + text;
       result += "\n date: " + stf.format(cratedDate);
       return  result;
    }
}

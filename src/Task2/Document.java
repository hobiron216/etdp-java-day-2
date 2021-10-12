package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Document {
    private String[] authors;
    private Date date;

    public Document(String[] authors, Date date) {
        this.authors = authors;
        this.date = date;
    }

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public void addAuthor(String name) {
        ArrayList<String> listAuthors = new ArrayList<String>(Arrays.asList(this.authors));
        listAuthors.add(name);
        String[] result = new String[listAuthors.size()];
        this.authors = listAuthors.toArray(result);
    }



}

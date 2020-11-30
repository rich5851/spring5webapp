package guru.springframework.spring5webapp.domain;

import java.util.Set;

public class Author {

    private String firstName;
    private String lasName;
    private Set<Book> books;


    public Author() {
    }

    public Author(String firstName, String lasName) {
        this.firstName = firstName;
        this.lasName = lasName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
}

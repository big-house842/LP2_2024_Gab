package ProvaPOO;

import java.util.ArrayList;

public class Librarian extends Book {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<Book> listBooks = new ArrayList<Book>();

    
}

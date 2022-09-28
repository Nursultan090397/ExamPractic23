package libraryProject.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> libraryMembers =  new ArrayList<>();


    public List<Book> getBooks() {
        return books;
    }

    public List<LibraryMember> getLibraryMembers() {
        return libraryMembers;
    }
}
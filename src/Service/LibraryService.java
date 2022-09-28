package Service;

import libraryProject.model.Book;
import libraryProject.model.LibraryMember;

import java.util.List;

public interface LibraryService {
    List<LibraryMember> getLibraryMembers();
    void addLibraryMember(LibraryMember member);

    public LibraryMember findLibraryMemberById(Long id);

    void deleteLibraryMemberByID(Long id);

    void addBookToLibrary(Book book);

    void getLibraryBooks();

    Book findLibraryBookById(Long id);

    void deleteLibraryBookByID(Long id);

    void addBookToMember();

    void removeBookFromReading();
}
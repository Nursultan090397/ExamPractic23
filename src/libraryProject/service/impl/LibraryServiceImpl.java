package libraryProject.service.impl;

import libraryProject.dao.Dao;
import libraryProject.model.Book;
import libraryProject.model.LibraryMember;
import libraryProject.service.LibraryService;

import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {
    private static final Scanner scannerN = new Scanner(System.in);
    private Dao dao;

    public LibraryServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<LibraryMember> getLibraryMembers() {
        return null;
    }

    @Override
    public void addLibraryMember(LibraryMember member) {

    }

    @Override
    public LibraryMember findLibraryMemberById(Long id) {
        return null;
    }

    @Override
    public void deleteLibraryMemberByID(Long id) {

    }

    @Override
    public void addBookToLibrary(Book book) {

    }

    @Override
    public List<Book> getLibraryBooks() {
        return null;
    }

    @Override
    public void deleteLibraryBookByID(Long id) {

    }

    @Override
    public Book findLibraryBookById(Long id) {
        return null;
    }

    @Override
    public void addBookToMember() {

    }

    @Override
    public void removeBookFromReading(){

    }
}
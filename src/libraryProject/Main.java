package libraryProject;

import libraryProject.dao.Dao;
import libraryProject.model.Book;
import libraryProject.model.Library;
import libraryProject.model.LibraryMember;
import libraryProject.service.impl.LibraryServiceImpl;

import java.util.Scanner;

public class Main {
    static Scanner scannerN = new Scanner(System.in);
    static Scanner scannerS = new Scanner(System.in);

    public static void main(String[] args) {
        Dao dao = new Dao(new Library());
        LibraryServiceImpl libraryService = new LibraryServiceImpl(dao);
        while (true) {

            knopkalar();
            System.out.println("Select function: ");
            String word = scannerS.nextLine();
            switch (word) {


                case "1" -> {
                    LibraryMember libraryMember = new LibraryMember();
                    System.out.print("Введите ID нового участника: ");
                    libraryMember.setMemberId(scannerN.nextLong());
                    System.out.print("Введите имя участника: ");
                    libraryMember.setName(scannerS.nextLine());

                    libraryService.addLibraryMember(libraryMember);
                }
                case "2" -> {

                    System.out.println(libraryService.getLibraryMembers());

                }
                case "3" -> {
                   LibraryMember libraryMember = libraryService.findLibraryMemberById(scannerN.nextLong());
                    System.out.println("текущая книга\n");
                   System.out.println(libraryMember.getCurrentlyReading());
                    System.out.println("прочитанные книги\n");
                    System.out.println(libraryMember.getFinishedBooks());

                }
                case "4" -> {
                    System.out.print("Введите ID: ");
                    long membersID = scannerN.nextLong();
                    libraryService.deleteLibraryMemberByID(membersID);
                }
                case "5" -> {
                    Book kitep = new Book();
                    System.out.print("Введите ID книги: ");
                    kitep.setBookId(scannerN.nextLong());
                    System.out.print("Введите title книги:");
                    kitep.setTitle(scannerS.nextLine());
                    libraryService.addBookToLibrary(kitep);
                }
                case "6" -> {
                    libraryService.getLibraryBooks();
                }
                case "7" -> {
                    System.out.println(libraryService.findLibraryBookById(scannerN.nextLong()));
                }
                case "8" -> {
                    System.out.print("Введите ID книги чтобы удалить: ");
                    long bookID = scannerN.nextLong();
                    libraryService.deleteLibraryBookByID(bookID);
                } case "9" -> {
                    libraryService.addBookToMember();
                }
                case "10" -> {
                    libraryService.removeBookFromReading();
                }

            }
            if (word.equals("x")){
                break;
            }


            }
        }


    public static void  knopkalar () {
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Нажмите 1, чтобы добавить нового участника в библиотеку.");
        System.out.println("Нажмите 2, чтобы увидеть всех участников библиотеки.");
        System.out.println("Нажмите 3, чтобы найти участника по ID и увидеть данные участника, читаемые в данное время книг и прочитанных.");
        System.out.println("Нажмите 4, чтобы удалить участника по ID.");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Нажмите 5, чтобы добавить книгу в библиотеку.");
        System.out.println("Нажмите 6, чтобы увидеть все книги в библиотеке.");
        System.out.println("Нажмите 7, чтобы найти книгу по ID.");
        System.out.println("Нажмите 8, чтобы удалить книгу по ID.");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Нажмите 9, чтобы ввести memberId участника и bookId книги, добавить книг,которых читает в данное время");
        System.out.println("Нажмите 10, чтобы ввести memberId участника и bookId книги, добавить в прочитанные");
        System.out.println("Нажмите x, чтобы завершить программу.");
    }
}

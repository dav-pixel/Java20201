package book;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataStorage dataStorage = new DataStorage();

        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD BOOK");
            System.out.println("Please input 2 for SEARCH BOOK BY TITLE");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input book data");
                    System.out.println("Title:");
                    String title = scanner.nextLine();
                    System.out.println("authorName:");
                    String authorName = scanner.nextLine();
                    System.out.println("price:");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("count:");
                    int count = Integer.parseInt(scanner.nextLine());
                    Book book = new Book(title, authorName, price, count);
                    dataStorage.add(book);
                    System.out.println("Book was added");
                    break;
                case "2":
                    System.out.println("Please input title for search");
                    String searchTitle = scanner.nextLine();
                    Book searchedBook = dataStorage.getBookByTitle(searchTitle);
                    if (searchedBook == null) {
                        System.out.println("Book with" + " " + searchTitle + " " + "title does not exists");
                    } else {
                        System.out.println(searchedBook);
                    }
                    break;

                default:
                    System.out.println("wrong command!!");


            }
        }


    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984",352,"George Orwell","2000");
        Book b2 = new Book("Sense and Sensibility",392,"Jane Austen","1811");
        Book b3 = new Book("Schachnovelle",96,"Stefan Zweig","2012");
        Book b4 = new Book("Siddharta",148,"Hermann Hesse","2002");
        Book b5 = new Book("L' Etranger",112, "Albert Camus","1942");
        Book b6 = new Book("Crime and Punishment",501,"Dostoevsky","1886");
        Book b7 = new Book("O Alquimista",184,"Paulo Coelho","1988");
        Book b8 = new Book("Anna Karenina",864,"Tolstoy","1877");
        Book b9 = new Book("Oblomov",632,"Ivan Goncarov","1859");
        Book b10 = new Book("Momo",304,"Michael Ende","1973");
        List<Book> bookList = new ArrayList<>();

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);
        bookList.add(b7);
        bookList.add(b8);
        bookList.add(b9);
        bookList.add(b10);



        Map<String, String> bookTitleToAuthorMap = bookList.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthorName));

        System.out.println("Book titles and Authors => ");
        bookTitleToAuthorMap.forEach((title, author) -> System.out.println(title + " = " + author));


        List<Book> filteredBooks = bookList.stream()
                .filter(book -> book.getNumPage() > 100)
                .collect(Collectors.toList());

        System.out.println("----------------");

        System.out.println("Books with a Page Number of More Than 100 => ");
        filteredBooks.forEach(book -> System.out.println(book.getTitle() + " : " + book.getNumPage()));


    }
}

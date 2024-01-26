import ru.mck.hw12.book.Author;
import ru.mck.hw12.book.Book;

public class Main {
    public static void main(String[] args) {

        Author book1 = new Author("Daniel", "Keyes");
        Author book2 = new Author("Sergey", "Tarmashev");

        Book one = new Book(book1, "Billy Milligan", 1982);
        Book two = new Book(book2, "Drevniy.Katastrofa", 2007);

        two.setPublicationYear(2008);

        System.out.println("Name = " + one.getName() + ", Author = " + book1.getFirstName() + " " + book1.getLastName() + ", Year = " + one.getPublicationYear());
        System.out.println("Name = " + two.getName() + ", Author = " + book2.getFirstName() + " " + book2.getLastName() + ", Year = " + two.getPublicationYear());


    }
}

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'ptang' at '8/4/15 1:34 PM' with Gradle 2.5
 *
 * @author ptang, @date 8/4/15 1:34 PM
 */
public class LibraryTest {
    private Library library;
    private List<Book> listOfBooks;
    @Before
    public void setup(){
        listOfBooks = new ArrayList<>();
        library = new Library(listOfBooks);
    }

    @Test
    public void shouldProduceWelcomeWhenOpen() {
        assertThat(library.open(), is("Welcome to the Library! Biblioteca is available!"));
    }

    @Test
    public void shouldListNothingWhenLibraryCreatedWithNoBooks(){
        assertThat(library.listAllBooks(), is(listOfBooks));
    }

    @Test
    public void shouldListAllBooksWhenLibraryCreatedWithBooks() {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(mock(Book.class));
        listOfBooks.add(mock(Book.class));
        Library library = new Library(listOfBooks);
        assertThat(library.listAllBooks(),is(listOfBooks));
    }
}

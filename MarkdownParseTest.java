import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(1+1, 2);
    }

    @Test
    public void getLinksTestone() throws IOException { 
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://something.com",
             "some-thing.html");
        assertEquals(expected, links);
    }

    @Test
    public void getLinksTesttwo() throws IOException { 
        Path fileName = Path.of( "test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://something.com",
             "some-thing.html");
        assertEquals(expected, links);
    }

    @Test
    public void getLinksTestthree() throws IOException { 
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://something.com",
             "some-thing.html");
        assertEquals(expected, links);
    }
    @Test
    public void getLinksSnippetOne() throws IOException { 
        Path fileName = Path.of("snippet-1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("60%google.com");
        assertEquals(expected, links);
    }

    @Test
    public void getLinksSnippetTwo() throws IOException { 
        Path fileName = Path.of("snippet-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("a.com", "a.com(())", "example.com");
        assertEquals(expected, links);
    }

    @Test
    public void getLinksSnippetThree() throws IOException { 
        Path fileName = Path.of("snippet-3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://www.twitter.com", 
            "https://cse.ucsd.edu/");
        assertEquals(expected, links);
    }
}

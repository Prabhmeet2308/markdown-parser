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
        Path fileName = Path.of(
        "C:/Users/santi/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://something.com",
             "some-thing.html");
        assertEquals(expected, links);
    }

    @Test
    public void getLinksTesttwo() throws IOException { 
        Path fileName = Path.of(
            "C:/Users/santi/Documents/GitHub/markdown-parser/new.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("funny.com", "weird");
        assertEquals(expected, links);
    }

    @Test
    public void getLinksTestthree() throws IOException { 
        Path fileName = Path.of(
        "C:/Users/santi/Documents/GitHub/markdown-parser/something.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("testing.com");
        assertEquals(expected, links);
    }
}

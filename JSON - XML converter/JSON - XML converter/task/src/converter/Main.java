package converter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        var input = Files.readString(Path.of("test.txt"));
        var converter = Converter.Factory.createFor(input);
        converter.logTo(System.out);
        converter.convert(input);
    }
}

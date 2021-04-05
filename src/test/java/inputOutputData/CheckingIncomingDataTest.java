package inputOutputData;

import static org.junit.Assert.assertTrue;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//@RunWith(Runner.class)
public class CheckingIncomingDataTest {

    @Test
    public void checkInputFile() {
        File file = new File("lorem_ipsum.txt");
        assertTrue("input file lorem_ipsum.txt not found", file.exists());
    }

    @Test
    public void checkOutputDirectory() {
        Path path = Paths.get("outputData");
        boolean directory = Files.exists(path);
        if (directory) {
            try {
                FileUtils.forceDelete(new File("outputData"));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

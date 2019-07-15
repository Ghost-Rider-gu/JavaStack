package corp.siendev.java.core.filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileStack {

    private FileStack() {

    }

    public static void fileInfo(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(String.format("File %s not found", file));
        }
    }

    public static File[] getDirectories(String path) {
        return new File(path).listFiles(File::isDirectory);
    }

    public static File[] getFiles(String path) {
        return new File(path).listFiles(File::isFile);
    }

    public static List<String> readFileToList(String filename) throws IOException {
        return Files.readAllLines(new File(filename).toPath());
    }
}

package corp.siendev.java.core.filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStack {

    public void fileInfo(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(String.format("File %s not found", file));
        }
    }
}

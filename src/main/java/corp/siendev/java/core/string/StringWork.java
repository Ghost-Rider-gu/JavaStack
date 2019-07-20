package corp.siendev.java.core.string;

import corp.siendev.java.core.exception.JavaStackException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class StringWork {

    private StringWork() {
    }

    public List<String> splitSentence(String sentence) throws JavaStackException {
        if (Objects.isNull(sentence) || sentence.isEmpty()) {
            throw new JavaStackException("Can't split the sentence. Wrong parameter");
        }

        List<String> tokens = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(sentence);
        while (stringTokenizer.hasMoreTokens()) {
            tokens.add(stringTokenizer.nextToken());
        }
        return tokens;
    }
}

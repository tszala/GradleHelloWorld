import java.util.Collections;
import java.util.List;

public class Leaf implements Tree {
    private final String content;
    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public List<? extends Tree> getChildren() {
        return Collections.emptyList();
    }

    public Leaf(String content) {
        this.content = content;
    }
}

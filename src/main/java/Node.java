import java.util.Collections;
import java.util.List;

public class Node implements Tree {
    private String content;
    private List<Node> children;

    public Node(String content, List<Node> children) {
        this.content = content;
        this.children = children;
    }

    public static final Node leaf(String content) {
        return new Node(content, Collections.emptyList());
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public List<? extends Tree> getChildren() {
        return children;
    }
}

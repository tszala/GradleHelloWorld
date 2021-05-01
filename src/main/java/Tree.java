import java.util.List;

public interface Tree {
    boolean isLeaf();
    String getContent();
    List<? extends Tree> getChildren();
}

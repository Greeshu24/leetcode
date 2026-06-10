import java.util.*;

public class NestedIterator implements Iterator<Integer> {

    private List<Integer> flatList;
    private int ptr;

    public NestedIterator(List<NestedInteger> nestedList) {

        flatList = new ArrayList<>();
        ptr = 0;

        flatten(nestedList);
    }

    private void flatten(List<NestedInteger> nestedList) {

        for (NestedInteger ni : nestedList) {

            if (ni.isInteger()) {
                flatList.add(ni.getInteger());
            } else {
                flatten(ni.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return flatList.get(ptr++);
    }

    @Override
    public boolean hasNext() {
        return ptr < flatList.size();
    }
}
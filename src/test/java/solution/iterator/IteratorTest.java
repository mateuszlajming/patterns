package solution.iterator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    @Test
    public void test() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}

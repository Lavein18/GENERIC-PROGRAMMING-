1)ODD INTEGERS IN AN INTEGER LIST 

import java.util.*;

class OddPredicate implements UnaryPredicate<Integer> {
    public boolean test(Integer i) { return i % 2 != 0; }
}

public class Test {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
}

2)EXCHANGE THE POSITION OF TWO DIFFERENT ELEMENTS IN AN ARRAY 

public final class Algorithm {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

3)MAXIMAL ELEMENT

import java.util.*;

public final class Algorithm {
    public static <T extends Object & Comparable<? super T>>
        T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }
}

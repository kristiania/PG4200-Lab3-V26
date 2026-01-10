package solution;

import assignment.Stacks.ArrayStack;

public class ReversedArray {

    public Integer[] returnInReverse(Integer[] a){
        assignment.Stacks.ArrayStack S = new ArrayStack(a.length);
        Integer[] r = new Integer[a.length];
        for (Integer anA : a) S.push(anA);
        for (int i=0; i < a.length; i++)
            r[i] = (Integer) (S.pop());
        return r;

    }
}

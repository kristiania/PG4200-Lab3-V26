package solution;

/*
 *  
 *  Class to check valid setting of brackets in java code
 *
 */

import assignment.Stacks.ArrayStack;
import assignment.Stacks.Stack;

public class CorrectlySetBrackets {

    public boolean isCorrectExpression(String exp) {
        Stack st = new ArrayStack();
        int i = 0;
        for (char c : exp.toCharArray()) {
            if (c == '[') {
                st.push('[');
            } else if (c == '(') {
                st.push('(');
            } else if (c == '{') {
                st.push('{');
            } else if (c == ']') {
                if (! st.pop().equals('['))
                {
                    IO.println("Wrong bracket at position " + i);
                    return false;
                };
            } else if (c == ')') {
                if (! st.pop().equals('('))
                {
                    IO.println("Wrong bracket at position " + i);
                    return false;
                };
            } else if (c == '}') {
                if (! st.pop().equals('{'))
                {
                    IO.println("Wrong bracket at position " + i);
                    return false;
                };
            }
            i++;
        }
        return true;

    }

}
import java.util.Stack;

public class ValidPranthesis {
    public static void main(String[] args) {
        String s = "({[]})";
        boolean res = validparanthesis(s);
        System.out.println("Given string \""+s+"\" is valid : "+res);
    }

    private static boolean validparanthesis(String s) {
        Stack<Character> st=new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(c==')' && st.peek()!='(' || c=='}' && st.peek()!='{' || c==']' && st.peek()!='['  )
                return false;
                st.pop();
            }
            
        }
        return st.isEmpty();

    }
}

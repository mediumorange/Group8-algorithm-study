import javax.imageio.stream.ImageInputStream;

public class Ex17 {
    public boolean solution(String s) {     //method - boolean data type
        if (s.matches("[0-9]+") && (s.length() == 4 || s.length() == 6)) {
            //regular expression to find if the string is all in numbers
            // && - to make sure both conditions are true
            // || - to make sure either of the conditions are true
            return true;
        }else{
            return false;}
    }

    public static void main(String[] args) {
        Ex17 sol = new Ex17();
        System.out.println(sol.solution("48003829"));
    }
}

public class Ex21_help {
    public String solution(String s) {
        char[] answer= s.toCharArray();     //change String to character array
        int index = 0;                      //to set the position of each letter and keep initializing it-need to know it is different from the actual index i
        for (int i = 0; i < answer.length; i++) {
            if(answer[i]!=' '){     //if the character is not a space
                char a = (index % 2 == 0) ? Character.toUpperCase(answer[i]) :Character.toLowerCase(answer[i]); //tenary operator(short-hand if else statement): checking if the index of each WORD(not the whole statement) is in the odd or even by the remainder of index
                index++;            //after changing the character either an upper or lowercase,add 1 to the index
                answer[i] = a;      //store the character (overwriting/initializing)
            } else {
                    index=0;        //if the answer[i] is space, then initialize the index to 0->so on the next start of the for loop, the index would be 0 and will go through the if statement from there,always making the start index of the word 0
                }
        }
        return new String(answer);  //create an object 'String', answer as a parameter
    }

    public static void main(String[] args) {
        Ex21 sol = new Ex21();
        System.out.print(sol.solution("Hi  my nAme bOb"));
    }
}

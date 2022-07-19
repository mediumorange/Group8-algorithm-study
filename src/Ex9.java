public class Ex9 {
    public String solution(String phone_number){    //method declared-data type String->means the return will be is String
        char[] numbers = phone_number.toCharArray();    //bring as character
        for (int i=0; i<phone_number.length()-4; i++){  //leave the last 4 digits
            numbers[i]='*'; //change the rest to asterisks
        }
        String backtophone=String.valueOf(numbers); //bring the character array back to String - why? because the data type was set as String at the start (this was the problem all along)
        return backtophone; //tried 'return numbers' but didn't work Error msg "char[] cannot be converted to java.lang.String"
        }

    public static void main(String[] args) {    //call the method
    Ex9 sol = new Ex9();    //creat an object
        System.out.println(sol.solution("48465920082"));    //call the method on the object and print out
    }
}

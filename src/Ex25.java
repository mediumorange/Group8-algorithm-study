public class Ex25 {
    public long solution(long n) {  //method - data type long
        double x=Math.sqrt(n);      //.sqrt can only be used with double value-returns a positive square root
        long answer;
        if(x - Math.floor(x)==0){       //.floor can only be used with double value-returns largest integer value that is less than or equal to the argument
                                        //if x is a perfect square, the difference between the floor value of x and x(the square root) should be the same
            answer = (long)((x + 1) * (x + 1));     //because the calculation was in double, change the value back to long type
        } else {
            answer = -1;}
        return answer;          //++could have used Math.pow
                                //++could have used ternary operator:  return (x - Math.floor(x)==0)?(long)((x + 1) * (x + 1)):-1
                                //++ultimately make it a one line: return (Math.pow((int)Math.sqrt(n), 2) == n)?((long) Math.pow(Math.sqrt(n) + 1, 2)):-1;
//                                    ->but how can you have int inside pow?
    }

    public static void main(String[] args) {
        Ex25 sol = new Ex25();
        System.out.println(sol.solution(3));
    }
}
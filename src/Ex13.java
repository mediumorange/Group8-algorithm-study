public class Ex13 {
    public String solution(int a, int b) {  //method, data type String ('FRI') with variables a and b
        int[] daysinmonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};   //assign values of 'total days in each month'
        String[] daysinweek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};   //assign the weekday values - because the given date(1/1, FRI) has a remainder of 1, you put it at index(position,place) 1
        int totaldates = 0;            //set variable for a total dates counted
        for (int i = 0; i < daysinmonth.length; i++) { // The whole for loop PART WAS WRONG(go to Ex13_help)-take the numbers orderly from int[] days in month - why can't I use int i:daysinmonth?
            if (i < 1) {
                totaldates = b;
            } else {
                totaldates = totaldates + daysinmonth[i] + b-1; //-add the total days up to specific date 'b'
            }
        }
        if(a!=1){totaldates +=31;}
        String answer = daysinweek[totaldates % 7]; //take the remainder number of [totaldates % 7(because a week has 7 days)] as an index of daysinweek
        return answer;
    }

    public static void main(String[] args) {
        Ex13 sol=new Ex13();
        System.out.println(sol.solution(5,24));
    }
}
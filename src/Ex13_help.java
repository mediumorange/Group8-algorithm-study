public class Ex13_help {
        public String solution(int a, int b) {
            int[] daysinmonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] daysinweek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
            int totaldates = 0;
            for (int i = 0; i < a; i++) {
                //use a(variable for month) to limit the add of numbers: before-by using i < daysinmonth.length, I was adding all the numbers in the array, making the number of days over 366
                if (i == 0) {       //not i<0, make it clear!!
                    totaldates = b;      // separated January because I can't bring the number of days the same way as I did with the other months ex)for Feb.5->31+5 but for Jan you can't add 31
                } else {
                    totaldates += daysinmonth[i - 1];       //no need to add b because i will always go through i==0 and update totaldates=0 to totaldates=b so when it starts 'else' part, it is adding b(updated totaldates)+daysinmonths[i-1]
                    //have to add daysinmonth[i-1] because you need to add the total dates of the previous month and the dates for this month ex)Feb 13->31+13 not 29+13

                    //can shorten the for loop as follows: for (int i = 0; i < a-1; i++) {
                                        //                totaldates += daysinmonth[i];
                                        //                }
                                        //                totaldates +=b
                }
            }
//            System.out.println(totaldates);
            String answer = daysinweek[totaldates % 7];
            return answer;
        }

        public static void main(String[] args) {
            Ex13_help sol = new Ex13_help();
            System.out.println(sol.solution(5, 24));
        }
    }

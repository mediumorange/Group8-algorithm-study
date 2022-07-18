class number9 {
    public String number9(String phone_number) {
        String answer = "";
        String star = "";
        int starcnt = phone_number.length()-4;
        int cut_length = 4;
        int number = Integer.parseInt(phone_number.substring(phone_number.length() - cut_length));


        for(int i = 0; i < starcnt; i++){
            star += "*";
        }
        answer = star + number ;
        return answer;
    }

    public static void main(String[] args) {
        number9 sol = new number9();
        String phone_number = "027778888";
        System.out.println(sol.number9(phone_number));
    }
}
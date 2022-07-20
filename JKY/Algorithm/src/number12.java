class number12 {
    public long number12(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for(int i=0; i<=count; i++){
            total += price*i;
        }
        if(money-total <= 0){
            answer = total - money;
        }else if(money-total > 0){
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        number12 sol = new number12();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(sol.number12(price,money,count));
    }
}


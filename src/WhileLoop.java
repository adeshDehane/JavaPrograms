public class WhileLoop {
    public static void main(String[] args) {
        int Num=4;
        int lastNum = 20;
        while(Num <= lastNum){
            Num++;
            if(!isEvenNumber(Num)){
                continue;
            }
            System.out.print(" Even Number " + Num);

        }

    }
    public static boolean isEvenNumber(int Num){
        if(Num%2==0){
            return true;
        }return false;


    }
}

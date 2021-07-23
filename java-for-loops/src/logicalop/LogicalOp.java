package logicalop;

public class LogicalOp {

    public void displayTo100(int number){
        if(number> 100){
            System.out.println("The number is bigger than 100");
        }else{
            for(int i=number;i<100;i++){
                System.out.println(i);
            }
        }
    }

    public void displayToMinus100(int number){
        if(number<-100){
            System.out.println("The number is less than -100");
        }else{
            for(int i = number;i>-100;i--){
                System.out.println(i);
            }
        }
    }

    public void displayBetween(int lowerLimit,int upperLimit){
        for(int i = lowerLimit+1; i<upperLimit;i++){
            System.out.println(i);
        }
    }

    public void ex4(int a,int b){
        if(a>b){
            for(int i = b; i<=a;i++){
                System.out.println(i);
            }
        }else{
            for(int i = a; i<=b;i++){
                System.out.println(i);
            }
        }
    }

    public void allEvenTo100(){
        for(int i=0;i<100;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }

    public void allOddTo100(){
        for(int i=0;i<100;i++){
            if(i%2!=0)
                System.out.println(i);
        }
    }

    public int ex7(int number){
        int sum = 0;
        for(int i=number;i<100;i++){
            sum+=i;
        }
        return sum;
    }

    public double media(int number){
        int sum = 0;
        int counter = 0;
        for(int i=number;i<100;i++){
            sum+=i;
            counter++;
        }
        return (double)sum/counter;
    }

    public void ex9(){
        for(int i=0;i<7;i++){
            for(int j=7;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

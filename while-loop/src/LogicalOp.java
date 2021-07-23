public class LogicalOp {

    public void ex1(int number){
        if(number>=100){
            System.out.println("counting to 100 is not possible");
        }else{
            while(number<100){
                System.out.println(number);
                number++;
            }
        }
    }

    public void ex2(int number){
        if(number<=-100){
            System.out.println("counting to -100 is not possible");
        }else{
            while(number>-100){
                System.out.println(number);
                number--;
            }
        }
    }

    public void ex3(int lowerLimit,int upperLimit){
        while(lowerLimit<=upperLimit){
            System.out.println(lowerLimit);
            lowerLimit++;
        }
    }

    public void ex4(int first,int second){
        int lowerLimit,upperLimit;
        if(first<second){
            lowerLimit = first;
            upperLimit = second;
        }else{
            lowerLimit = second;
            upperLimit = first;
        }
       ex3(lowerLimit,upperLimit);
    }

    public void ex5(){
        int i=0;
        while(i<100){
            if(i%2==0)
                System.out.println(i);
            i++;
        }
    }

    public void ex6(){
        int i=0;
        while(i<100){
            if(i%2!=0)
                System.out.println(i);
            i++;
        }
    }

    public void ex7(){
        int i = 111;
        int sum = 0;
        int counter=0;
        while(i<8899){
            sum+=i;
            counter++;
            i++;
        }

        System.out.println("Sum is: "+sum);
        System.out.println((float)sum/counter);
    }

    public float ex8(int first,int second){
        int sum = 0;
        int counter = 0;
        while(first<=second){
            if(first%7==0){
                sum+=first;
                counter++;
            }
            first++;
        }
        if(counter!=0){
            return (float)sum/counter;
        }else{
            System.out.println("There are no numbers divisible to 7");
            return -1;
        }
    }

    public void display20Fibo(){
        int first = 0;
        int second = 1;
        int sum;
        int counter = 2;

        System.out.println(first);
        System.out.println(second);

        while(counter<=20){
            sum = first+second;
            System.out.println(sum);
            counter++;
            first = second;
            second=sum;
        }
    }

    public void CozaLozaWoza(){
        int counter=0;
        for(int i=1;i<=110;i++){
            if(i%3==0 && i%5==0 && i%7==0){
                System.out.print("CozaLozaWoza ");
            }
            else if(i%3==0 && i%5==0)
                System.out.print("CozaLoza ");
            else if(i%3==0 && i%7==0)
                System.out.print("CozaWoza ");
            else if(i%5==0 && i%7==0)
                System.out.print("WozaLoza ");
            else if(i%3==0){
                System.out.print("Coza ");
            }else if(i%5==0)
                System.out.print("Loza ");
            else if(i%7==0)
                System.out.print("Woza ");
            else
                System.out.print(i+" ");

            counter++;
            if(counter==11){
                System.out.println();
                counter=0;
            }


        }
    }
}

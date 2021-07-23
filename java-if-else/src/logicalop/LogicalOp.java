package logicalop;

public class LogicalOp {
    private final String text= "FastTrackIT";
    public int checkBiggerNumber(int first, int second){
        if(first>second)
            return first;
        return second;
    }

    public String compare(String str){
        if(text.equals(str)){
            return "Learning text comparison";
        }
        else
            return "Got to try some more";
    }

    public String compare(String str,int number){
        if(text.equals(str) && number<=3){
            return str+" "+number;
        }
        else if(!text.equals(str) && number>=4){
            return number+" "+str;
        }else{
            return "Got to try some more";
        }
    }

    public String compareNumber(int number){
        if(number>8 || number==6){
            return "The amount of snow this winter was(cm): "+number;
        }else
            return "The forecast snow is(cm): "+number;
    }

    public String compareEx7(int number){
        if(number>3 && number!=4){
            return "The number is greater than 3 and not equal to 4";
        }else if(number==4){
            return "The number is equal to 4 ";
        }else if (number<3){
            return "The number is lower than 3";
        }else{
            return "The number is equal to 3 ";
        }
    }

    public void ex8(int number){
        switch(number){
            case 1:
                System.out.println("The number is: 1!");
                break;
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 5:
                System.out.println("The number is: 5!");
                break;
            case 6:
                System.out.println("The number is: 6!");
                break;
            case 7:
                System.out.println("The number is: 7!");
                break;
            case 8:
                System.out.println("The number is: 8!");
                break;
            case 9:
                System.out.println("The number is: 9!");
                break;
            default:
                System.out.println("The number does not respect the format");
                break;

        }
    }

    public boolean isNumberEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }


    public boolean isEligibleToVote(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }

    public double compareThreeNumbers(double a,double b,double c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else
            return c;
    }

}

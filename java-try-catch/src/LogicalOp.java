public class LogicalOp {

    public void positionArr(int[]arr,int number){
        try{
            System.out.println(arr[number]);
        }catch(Exception e){
            System.out.println("Inside catch, number too large");
        }
    }

    public void wait(int sec){
        try{
            Thread.sleep(sec*1000);
            System.out.println("Message printed after "+sec+"s");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

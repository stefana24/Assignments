package logicalOp;

public class LogicalOp {
    public void writeOnArray(int[]arr){
        if(arr.length>100){
            System.out.println("Not enough space!");
        }else{
            for(int i=0;i<100;i++){
                arr[i] = i+1;
                System.out.println(arr[i]);
            }
        }
    }

    public int[] evenArray(int[]arr){
        int idx = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                arr[idx++] = i;
            }
        }
        return arr;
    }

    public double meanValue(int[]arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return (double)sum/ arr.length;
    }

    public boolean isContaingString(String[] strings, String str){
        boolean isFound = false;
        for(int i=0;i< strings.length;i++){
            if(strings[i].equals(str)){
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public int findPosition(int[]arr,int number){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==number){
                return i+1;
            }
        }
        //does not exist
        return -1;
    }

    public void displayLines(){
       String[]arr = new String[20];
       for(int i=0;i<20;i++){
           if(i%2==0){
               arr[i] = "-";
           }else
               arr[i] = " ";
       }

       for(int i=0;i<10;i++){
           for(int j=0;j< arr.length;j++){
               System.out.print(arr[j]);
           }
           System.out.println();
       }
    }

    public int[] modifiedArr(int[]arr,int number){
        int[] copy = new int[arr.length-1];
        int idx = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=number){
                copy[idx++] = arr[i];
            }
        }

        return copy;
    }

    public int secondMin(int[]arr){
        if(arr.length<2){
            System.out.println("Second min cannot be found!");
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                secMin = min;
                min = arr[i];

            }else if(secMin>arr[i] && arr[i] != min){
                secMin = arr[i];
            }
        }
        return secMin;
    }

    public int[] populateArray(int[] arr,int[]emptyArr){
        for(int i=0;i< arr.length;i++){
            emptyArr[i] = arr[i];
        }
        return emptyArr;

    }
}

public class array {
    // public static int linerSearch(int number[], int key){
    //     for(int i =0;i<number.length;i++){
    //         if(number[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int number[] = {2,5,6,4,8,6,1};
    //     int key = 1;
    //     int index = linerSearch(number, key);
    //     if(index == -1){
    //         System.out.println("Not Found");
    //     }else{
    //         System.out.println("key is at index:"+ index);
    //     }
    // }


    // public static int getLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;

    //     for(int i=0;i<numbers.length;i++){
    //         if(largest<numbers[i]){
    //             largest = numbers[i];
    //         }
    //         if(smallest>numbers[i]){
    //             smallest = numbers[i];
    //         }
            
    //     }
    //     System.out.println("The smallest number is :"+ smallest);
    //     return largest;
        
    // }
    // public static void main(String[] args) {
    //     int numbers[] = {1,2,3,4,5,6,56};
    //     System.out.println("Largest value is:"+getLargest(numbers));
        
    // }

    public static int binarysearch(int number[], int key){
        int start =0, end = number.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(number[mid] == key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 10;


        System.out.println("index for key is :"+ binarysearch(number, key));
    }
}
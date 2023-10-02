public class binarysearch {
    public static void main(String[] args) {
       int [] arr = { 12,34,55,77,78,89};
       int target = 89;
       int ans = searchElement(arr,target);
        System.out.println(ans );
    }

    // return the index if does not return the index return -1
    static int searchElement( int[] arr, int target ){
        int start = 0;
        int end = arr.length-1 ;

        while( start <= end ){
            int mid = start + (end - start) / 2;

            if( target < arr[mid] ){
                end = mid -1 ;
            }else if(target > arr[mid] ) {
                start = mid + 1;
            }
           else {
               return mid ;
            }

        }
        return -1 ;

    }
}

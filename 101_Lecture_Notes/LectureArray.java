/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int[] arr = {5, 6, 4, 2, 7, 5, 1, 9};
        // for(int i = 0; i < arr.length-1; i++)
        //     System.out.print(arr[i] + " ");
        // int dupeCheck = 8;
        // for(int i = 0; i < arr.length-1; i++)
        //     if(arr[i] == arr[i+1])
        //         System.out.println("Consect at " + i + " and " + (i+1));
        
        // int min = arr[0];
        // for(int i = 1; i < arr.length; i++)
        //     if(arr[i] < min)
        //         min = arr[i];
        // System.out.println(min);
        
        for(var el : arr)
            System.out.println(el);
        
	}
}
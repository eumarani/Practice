public class FifthProblem {
    public  static void medianOfarrays(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0,k=0;
        int median=0;
        int[] result=new int[n1+n2];
        int r=result.length;
        while(i<n1 && j<n2) {
            if(arr1[i]<arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;
            } else {
                result[k] = arr2[j];
                j++;
                k++;
            }
}
            while(i<n1){
                result[k]=arr1[i];
                i++;
                k++;

            }
            while(j<n2){
                result[k]=arr2[j];
                j++;
                k++;

            }
            if(r%2==0){
                median=(result[(r-2)/2]+result[r/2])/2;
            }else{
                median=result[r/2];
            }
            System.out.println(median);
        }


    public static void main(String[] args) {
        int[] arr1={2, 3, 5, 6,8,9,10};
        int[] arr2={11, 12, 13,14, 16, 18, 20};
        medianOfarrays(arr1, arr2);


    }
}

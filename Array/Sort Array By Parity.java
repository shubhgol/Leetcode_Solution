class Solution {
    public int[] sortArrayByParity(int[] a) {
        int i=0;
        int j = a.length-1;
            
         while(i<j) {
             if(a[i]%2==0 && a[j]%2!=0){
                 i++;
                 j--;
             }
             else if(a[i]%2!=0 && a[j]%2==0) {
                 int temp = a[i];
                 a[i]=a[j];
                 a[j]=temp;
                 i++;
                 j--;
             }
             else if(a[i]%2==0) {
                 i++;
             }
             else 
                 j--;
         }
        return a;
    }
}
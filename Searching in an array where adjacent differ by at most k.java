class Complete{
    
   
    // Function for finding maximum and value pair
    int search(int arr[], int n, int x, int k){
    
        int idx, i = 0;
        
        while(i < n){
            
            if(arr[i] == x) return i;
            
            int leap = Math.abs(x-arr[i]) / k;
            
            if(leap == 0)   i++ ;
            else    i+=leap;
        }
        
        return -1;
    }   
    
    
}

public class listPrime{

    public static void listPrimeSieve(int arraySize){
        arraySize=arraySize+1;
        int[] A = new int[arraySize];
        int i, j;
        
        for(i=0;i<arraySize;i++){
            A[i]=0;
        }
            
        
        for (i = 2; i < arraySize; i++)
            A[i] = 1;
        
        for (i=2;i*i<=arraySize;i++) {
            for(j=2;j<arraySize;j++){
                
                if(j%i==0&&j!=i){
                    A[j]=0;
                }
                
                }
        }
        
        for (i = 2; i < arraySize; i++)
            if(A[i]==1)
            System.out.print(i + " ");
        
        
    }

    public static void listPrime (int n){
        System.out.println("2");
        for(int i=3;i<=n;i++){
            int count = 0;
            for(int m=2;m<i;m++){
                if(i%m==0){
                    break;
                }
                else count++;
                if(count==i-2){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main (String[] args){
        int n = Integer.parseInt(args[0]);
        listPrimeSieve(n);
        listPrime(n);

    }
}
public class listPrime{

    public static void listPrimeSieve(int arraySize){
        arraySize=arraySize+1;
        boolean[] A = new boolean[arraySize];
        int i, j;
        
        for (i = 2; i < arraySize; i++)
            A[i] = true;
        
        for (i=2;i<arraySize;i++) {
            if(A[i]==false) continue;
            for(j=2;i*j<arraySize;j++){
                
                A[i*j] = false;
                
            }
        }
        int count = 1;
        for (i = 2; i < arraySize; i++){
            if(A[i]){
                System.out.print(i + " ");
                count++;
            }
            if(count==11) {
                System.out.println("");
                count = 1;
            }
        }
        
    }

    public static void listPrimeSieve_back (int arraySize){
        arraySize=arraySize+1;
        boolean[] A = new boolean[arraySize];
        int i, j;

        for (i=2;i<arraySize;i++) {
            if(A[i]==false) continue;
            for(j=2;i*j<arraySize;j++){
                
                A[i*j] = true;
                
            }
        }
        int count = 1;
        for (i = 2; i < arraySize; i++){
            if(!A[i]){
                System.out.print(i + " ");
                count++;
            }
            if(count==11) {
                System.out.println("");
                count = 1;
            }
        }
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
        //listPrime(n);
        //listPrimeSieve_back(n);
    }
}
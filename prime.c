#include <stdio.h>
#include <stdlib.h>


int main() {
    int arraySize;
    scanf("%d",&arraySize);
    arraySize=arraySize+1;
    int A[arraySize];
    int i, j;
    
    for(i=0;i<=arraySize;i++){
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
    
    for (i = 2; i <= arraySize; i++)
        if(A[i]==1)
        printf("%d ",i);
    
    printf("\n");
    
    return 0;
}
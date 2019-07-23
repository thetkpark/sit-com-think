#include <stdio.h>
main () {
    int n,i;
    scanf("%d", &n);
    int a[n];
    int max=-99999999,min=99999999;
    for(i=0;i<n;i++){
        int temp;
        scanf("%d", &temp);
        if(temp >= max) max = temp;
        if(temp <= min) min = temp;
    }

    printf("Max = %d\n", max);
    printf("Min = %d", min);
}
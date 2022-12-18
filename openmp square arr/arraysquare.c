#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

#define N 5

int A[N];
int B[N];

int main() 
{
    int i,j,a;

    omp_set_num_threads(omp_get_num_procs());
    printf("Enter the elements of array (5) : ");
    for (i= 0; i< N; i++)
    {
    	scanf("%d",&a);
    	A[i] = a;
    }

    #pragma omp parallel for private(i) shared(A,B)
    for (i = 0; i < N; ++i) {
	B[i]=A[i]*A[i];
    }


    for (i= 0; i< N; i++)
            printf("%d\t",B[i]);
}
 

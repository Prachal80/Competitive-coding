#include <stdio.h>
#include <string.h>


int main() {
  
  int N;
  int i, n, k;
  printf("Type n: ");
  scanf("%d", &n);
  
   
  char str[n];

  for(k = 0 ; k < n; k++){
  	scanf("%s",str[k]);

  }

 

  for(k =0 ; k < n; k++){
	 char a = str[k];	  	
  	 N = strlen(a);

  	for (i = N / 2 - 1; i >= 0; i--) {
    printf("%c", str[i]);
  	}

  	for (i = N - 1; i > N / 2 - 1; i--) {
    printf("%c", str[i]);
  	}

  printf("\n");
  }
  
}
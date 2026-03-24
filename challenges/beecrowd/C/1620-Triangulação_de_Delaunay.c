#include <stdio.h>

int main() {
    double L;
    do {
        scanf("%lf", &L);
        if (L == 0) break;
        double l = L + (L - 3);
        double x = (l - L) / L;
        printf("%.6f\n", x);
    } while (1);

    return 0;
} 

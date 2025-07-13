#include <stdio.h>
#include <string.h>

int main(void) {
    char str[12][100];
    for (int i = 0; i < 12; i++) {
        scanf("%s", &str[i]);
    }
    int count = 0;
    for (int i = 0; i < 12; i++) {
        int length = strlen(str[i]);
        if (length == i + 1) {
            count++;
        }
    }
    printf("%d\n", count);
    return 0;
}
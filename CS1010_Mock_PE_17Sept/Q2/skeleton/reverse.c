// CS1010 AY2014/5 Semester 1
// Mock PE
// Name: 
// Matriculation number: 
// Discussion group: 
// Description:

#include <stdio.h>
#define MAX 20

void scanArray(int [], int);

int main(void) {
	int arr1[MAX];
	int size1;

	printf("Enter size of 1st array: ");
	scanf("%d", &size1);
	scanArray(arr1, size1);

	// printf() statement provided for your use
	/*
	printf("They are reverse of each other.\n");
	printf("They are not reverse of each other.\n");
	printf("The difference in averages = ");
	*/

	return 0;
}

// Read data into array arr
void scanArray(int arr[], int size) {
	int i;

	printf("Enter element(s): ");
	for (i=0; i<size; i++)
		scanf("%d", &arr[i]);
}


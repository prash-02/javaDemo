#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_CONTACTS 100
#define NAME_LENGTH 50
#define PHONE_LENGTH 15

typedef struct {
    char name[NAME_LENGTH];
    char phone[PHONE_LENGTH];
} Contact;

Contact phonebook[MAX_CONTACTS];
int contactCount = 0;

void addContact() {
    if (contactCount >= MAX_CONTACTS) {
        printf("Phonebook is full!\n");
        return;
    }
    
    Contact newContact;
    printf("Enter name: ");
    getchar(); // clear newline from previous input
    fgets(newContact.name, NAME_LENGTH, stdin);
    newContact.name[strcspn(newContact.name, "\n")] = 0; // Remove newline

    printf("Enter phone number: ");
    fgets(newContact.phone, PHONE_LENGTH, stdin);
    newContact.phone[strcspn(newContact.phone, "\n")] = 0; // Remove newline

    phonebook[contactCount++] = newContact;
    printf("Contact added successfully!\n");
}

void displayContacts() {
    if (contactCount == 0) {
        printf("No contacts in the phonebook.\n");
        return;
    }

    printf("\nPhonebook Contacts:\n");
    for (int i = 0; i < contactCount; i++) {
        printf("%d. Name: %s, Phone: %s\n", i + 1, phonebook[i].name, phonebook[i].phone);
    }
}

void searchContact() {
    char searchName[NAME_LENGTH];
    printf("Enter name to search: ");
    getchar(); // clear newline from previous input
    fgets(searchName, NAME_LENGTH, stdin);
    searchName[strcspn(searchName, "\n")] = 0; // Remove newline

    int found = 0;
    for (int i = 0; i < contactCount; i++) {
        if (strcasecmp(phonebook[i].name, searchName) == 0) {
            printf("Found: Name: %s, Phone: %s\n", phonebook[i].name, phonebook[i].phone);
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Contact not found.\n");
    }
}

void menu() {
    int choice;
    do {
        printf("\nPhonebook Menu:\n");
        printf("1. Add Contact\n");
        printf("2. Display Contacts\n");
        printf("3. Search Contact\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addContact();
                break;
            case 2:
                displayContacts();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 4);
}

int main() {
    menu();
    return 0;
}

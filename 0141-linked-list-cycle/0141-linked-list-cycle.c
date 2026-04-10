// /**
//  * Definition for singly-linked list.
//  * struct ListNode {
//  *     int val;
//  *     struct ListNode *next;
//  * };
//  */
// bool hasCycle(struct ListNode *head) {
//     if(head==NULL||head->next==NULL){
//         return false;
//     }
//     struct ListNode *temp=head,*after=head->next;
//     while(temp!=after){
//         if(after->next==NULL||after==NULL){
//             return false;
//         }
        
       
//         temp=temp->next;
//         after=after->next->next;
//     }
//     return true;
// }
bool hasCycle(struct ListNode *head) {
    if (head == NULL || head->next == NULL) {
        return false;
    }

    struct ListNode *slow = head;
    struct ListNode *fast = head->next;

    while (slow != fast) {
        if (fast == NULL || fast->next == NULL) {
            return false;
        }
        slow = slow->next;
        fast = fast->next->next;
    }

    return true;
}

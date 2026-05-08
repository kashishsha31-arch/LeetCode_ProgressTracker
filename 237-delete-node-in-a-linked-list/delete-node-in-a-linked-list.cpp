/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* node) {
        swap(node->val,node->next->val);
        ListNode* temp=node->next;
        node->next=node->next->next;//here we are letting our currr node point to the other node which is 1 ahead of the node to be deleted 
        delete temp;
    }
};
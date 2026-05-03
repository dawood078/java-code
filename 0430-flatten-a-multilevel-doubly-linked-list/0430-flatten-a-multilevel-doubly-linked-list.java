class Solution {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    private Node dfs(Node node) {
        Node curr = node;
        Node last = null;

        while (curr != null) {
            Node next = curr.next;

            // if child exists
            if (curr.child != null) {
                Node childHead = curr.child;
                Node childTail = dfs(childHead);

                // connect current -> child
                curr.next = childHead;
                childHead.prev = curr;

                // connect child tail -> next
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                // remove child pointer
                curr.child = null;

                last = childTail;
            } else {
                last = curr;
            }

            curr = next;
        }

        return last;
    }
}
class LRUCache {

    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;

    // Dummy head and tail
    private Node head, tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    // Remove node from list
    private void remove(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Insert node right after head
    private void insert(Node node) {

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {

        if (!map.containsKey(key))
            return -1;

        Node node = map.get(key);

        // Move to front (most recently used)
        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        // If key already exists
        if (map.containsKey(key)) {

            Node oldNode = map.get(key);

            remove(oldNode);
        }

        Node newNode = new Node(key, value);

        map.put(key, newNode);

        insert(newNode);

        // Remove LRU node if capacity exceeded
        if (map.size() > capacity) {

            Node lru = tail.prev;

            remove(lru);

            map.remove(lru.key);
        }
    }
}
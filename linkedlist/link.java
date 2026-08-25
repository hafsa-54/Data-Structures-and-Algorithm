class StringNode {
    String data;
    StringNode next;

    StringNode(String data) {
        this.data = data;
        this.next = null;
    }

    // Inserts a string into its correct position in ascending order
    public StringNode insert(StringNode start, String value) {
        StringNode newNode = new StringNode(value);

        // Case 1: Insert into empty list or before the start (if smaller than start)
        if (start == null || value.compareTo(start.data) < 0) {
            newNode.next = start;
            start = newNode;
            return start;
        }

        // Case 2: Traverse to find the correct insertion position
        StringNode current = start;
        while (current.next != null && current.next.data.compareTo(value) < 0) {
            current = current.next;
        }

        // Insert new node after current
        newNode.next = current.next;
        current.next = newNode;
        return start;
    }

    // Prints all elements in the list
    public void display(StringNode start) {
        StringNode current = start;
        while (current != null) {
            System.out.print("\"" + current.data + "\" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StringNode list = new StringNode("Grapes"); // Initialize with null to represent an empty list
        list = list.insert(list, "Kiwi");
        list = list.insert(list, "Orange");
        list = list.insert(list, "Apple");
        list = list.insert(list, "Banana");
        list = list.insert(list, "Mango");
        list.display(list); // Output: "Apple" -> "Banana" -> "Mango" -> "Orange" -> null
    }
}
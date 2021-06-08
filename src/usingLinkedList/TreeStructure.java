package usingLinkedList;

class TreeStructure {

    Node root;
    boolean flag;

    public void insertRoot(int data){
        if(root == null)
            root = new Node(data);
        else
            System.out.println("Root already exist");
    }

    public void insertNode(Node root, int data){
        if(root == null)
            insertRoot(data);
        else if(root.data > data)
            if(root.left != null)
                insertNode(root.left, data);
            else
                root.left = new Node(data);
        else
            if(root.right != null)
                insertNode(root.right, data);
            else
                root.right = new Node(data);
    }

    public boolean searchInTree(Node root, int data){

        if(root.data == data)
            flag = true;
        else if(root.data < data)
            if(root.right != null)
                searchInTree(root.right, data);
            else
                flag = false;
        else
            if(root.left != null)
                searchInTree(root.left, data);
            else
                flag = false;
        return flag;
    }

    public void minValue(Node root){
        if(root == null)
            System.out.println("No min nad maximum");
        else if(root.left == null)
            System.out.println("Minimum value : " + root.data);
        else
            minValue(root.left);
    }

    public Node maxValue(Node root){
        if(root == null)
            System.out.println("No maximum");
        else if(root.right == null)
            System.out.println("Maximum value : " + root.data);
        else
            maxValue(root.right);
        return root;
    }

    /**
     *
     *  For inOrder Traversal order is L -> D -> R
     */

    public void inOrderTraversal(Node root){
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data + "  ");
        inOrderTraversal(root.right);
        System.out.println();
    }

    /**
     * For preOrder traversal order is D -> L -> R
     */

    public void preOrderTraversal(Node root){
        if(root == null)
            return;
        System.out.print(root.data + "  ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    /**
     * For post order traversal order is L -> R -> D
     */

    public void postOrderTraversal(Node root){
        if(root == null)
            return;
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.println(root.data);
    }

    public void deleteNode(int data, Node root){
        Node parent = null;
        Node current = root;

        while (current != null && current.data != data){
            parent = current;
            if(current.data > data)
                current = current.left;
            else
                current = current.right;
        }

        if(current. right == null && current.left == null)
            current = null;
        else if(current.right != null && current.left == null)
            parent.right = current.right;
        else if(current.right == null && current.left != null)
            parent.left = current.left;
        else if(current.left != null && current.right != null){
            Node successor = maxValue(current);
            successor.right = current.right;
            successor.left = current.left;
            parent.right = successor;

            return;

        }

    }

}
class TreeStructure{

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
}
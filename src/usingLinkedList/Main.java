package usingLinkedList;/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 22-03-2021
 *   Time: 11:42
 *   File: usingLinkedList.Main.java
 */

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
//        TreeStructure t1 = new TreeStructure();
//        t1.insertRoot(20);
//        t1.insertNode(t1.root, 30);
//        t1.insertNode(t1.root, 40);
//        t1.insertNode(t1.root, 10);
//
//        boolean result = t1.searchInTree(t1.root, 40);
//        System.out.println(result);
//        t1.deleteNode(30, t1.root);
//        System.out.println(t1.searchInTree(t1.root, 30));
//        t1.preOrderTraversal(t1.root);


        TreeStructure t2 = new TreeStructure();
        t2.insertRoot(15);
        t2.insertNode(t2.root, 10);
        t2.insertNode(t2.root, 20);
        t2.insertNode(t2.root, 8);
        t2.insertNode(t2.root, 12);
        t2.insertNode(t2.root, 18);
        t2.insertNode(t2.root, 30);
        t2.insertNode(t2.root, 16);
        t2.insertNode(t2.root, 19);

        System.out.println(t2.searchInTree(t2.root, 16));
        t2.preOrderTraversal(t2.root);
        t2.deleteNode(16, t2.root);
        System.out.println(t2.searchInTree(t2.root, 16));
        t2.preOrderTraversal(t2.root);
        }

}


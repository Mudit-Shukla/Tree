package usingLinkedList;/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 22-03-2021
 *   Time: 11:31
 *   File: usingLinkedList.Node.java
 */

public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

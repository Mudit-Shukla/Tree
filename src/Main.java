/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 22-03-2021
 *   Time: 11:42
 *   File: Main.java
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeStructure t1 = new TreeStructure();
        t1.insertRoot(20);
        t1.insertNode(t1.root, 30);
        t1.insertNode(t1.root, 40);
        t1.insertNode(t1.root, 10);

        boolean result = t1.searchInTree(t1.root, 50);
        System.out.println(result);
        }


    }


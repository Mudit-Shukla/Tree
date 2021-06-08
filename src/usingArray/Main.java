/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 27-03-2021
 *   Time: 21:21
 *   File: Main.java
 */

package usingArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of approximate number of elements");
        int numberOfElements = sc.nextByte();
        final int POSITION = 1;
        TreeUsingArrayImplementation tree = new TreeUsingArrayImplementation(numberOfElements*numberOfElements);
        tree.insertElement(POSITION,20);
        tree.insertElement(POSITION,30);
        tree.insertElement(POSITION,5);
        tree.insertElement(POSITION,8);
        tree.insertElement(POSITION,12);
        System.out.println(tree.searchElement(80));

        System.out.println(tree.returnLength());
    }
}

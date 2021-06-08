package usingArray;/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 26-03-2021
 *   Time: 22:26
 *   File: usingArray.TreeUsingArrayImplementation.java
 */


public class TreeUsingArrayImplementation {

    int [] arr;
    int rootPosition = 1;
    public TreeUsingArrayImplementation(int size){
        arr = new int[size];
    }

    public void insertElement(int position, int data){
        if(arr[position] == 0 && arr[0] == 0)
            arr[position] = data;
        else if(arr[position] < data)
            if(arr[position*2] == 0){
                arr[position*2] = data;
                System.out.println("value inserted");
            }
            else
                insertElement(position*2, data);
        else
            if(arr[position*2 + 1] == 0){
                arr[position*2 + 1] = data;
                System.out.println("value inserted");
            }
            else
                insertElement(position*2 + 1, data);
    }

    public boolean searchElement(int data) {
        if (arr[rootPosition] == data)
            return true;
        int position = rootPosition;
        boolean flag = true;
        while (position < arr.length) {
            if (arr[position] > data) {
                if (arr[position * 2 + 1] == data)
                    return flag;
                else if (arr[position * 2 + 1] == 0)
                    return false;
                else
                    position = position*2 + 1;
            } else if (arr[position] < data) {
                if (arr[position * 2] == data)
                    return true;
                else if (arr[position * 2] == 0)
                    return false;
                else
                    position = position * 2;
            } else if (arr[position] == data)
                return true;
        }
        return false;
    }

    public int returnLength(){
        return arr.length;
    }

}

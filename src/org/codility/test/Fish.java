package org.codility.test;


import java.util.Stack;

/**
 * User: Nipuni Perera
 *
 */
public class Fish {

    private int size;
    private int direction;
    public static void main(String [] args) {
        int[] A = new int[5];
        A[0] = 4;
        A[1] = 3;
        A[2] = 2;
        A[3] = 1;
        A[4] = 5;

        int[] B = new int[5];
        B[0] = 1;
        B[1] = 0;
        B[2] = 1;
        B[3] = 1;
        B[4] = 1;
        System.out.println(solution(A,B));
    }

    public static int solution(int[] A, int[] B) {
        Stack<Fish> fishStack = new Stack<>();
        fishStack.push(new Fish(A[0],B[0]));
        for(int index=1; index<A.length; index++) {
             Fish peekFish = fishStack.peek();
            if(peekFish.getDirection()==1 && B[index]==0){
                if(peekFish.getSize()>A[index]){
                    //peek eats new fish
                    //do nothing
                } else {
                    //new fish eats peek
                    fishStack.pop();
                    fishStack.push(new Fish(A[index], B[index]));
                }
            } else {
                fishStack.push(new Fish(A[index], B[index]));
            }
        }
        return fishStack.size();
    }

    public Fish(int size, int direction) {
        this.setSize(size);
        this.setDirection(direction);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}



package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyStack<String> stack=new MyStack<>();
        int m=sc.nextInt();
        while (m>0){
             String n=sc.next();
             stack.push(n);
             m--;
        }
        int j=sc.nextInt();
        while(j>0) {
            System.out.print(stack.pop()+" ");
            j--;
        }
        System.out.println("");
        System.out.println(stack.top());
    }
}
class MyStack<T>{
    private Object[] a;
    private int i;
    MyStack(){
        a=new Object[100];
    }
    public void push(T n){
            a[i++] = n;
    }
    public T pop() {
        T n=top();
        if (i > 0) {
            a[i-1]=null;
            i--;
        }
        return n;
    }
    public T top(){
        T n=null;
        if(i>0){
            n=(T)a[i-1];
        }
        return n;
    }
}
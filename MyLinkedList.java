package com.lzz.algorithm;

public class MyLinkedList<T> {
    private class Node<T>{
        Node next;
        T value;

        public Node(T value) {
            this.value = value;
        }
    }

    Node<T> head;
    Node<T> currNode;
    MyLinkedList(T node){
        head = new Node<>(node);
        currNode = head;
    }

    void add(T node){
        currNode.next = new Node(node);
        currNode = currNode.next;
    }

    void remove(T node){
        
    }
}

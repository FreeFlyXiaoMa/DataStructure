package com.example.myjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

class Node<E> {
    E item;
    Node<E> next;
    //构造函数
    Node(E element){
        this.item=element;
        this.next=null;
    }






    public void main(String[] args){
        //头节点、尾节点
        Node<E> head=null;
        Node<E> tail=null;
        //创建一个新的节点 并让head指向此节点
        head=new Node("nodedata1");

        //让尾节点指向此节点
        tail=head;

        //创建新节点 同时和最后一个节点连接起来
        tail.next=new Node("node1data2");

        //尾节点指向新的节点
        tail=tail.next;

    }

}
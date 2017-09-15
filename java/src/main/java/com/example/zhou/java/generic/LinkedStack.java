package com.example.zhou.java.generic;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/16  17:16
 * @Desc : 内部链式储存机制
 */

public class LinkedStack<T>
{
    private Node<T> node = new Node<>();

    /**
     * 入栈
     *
     * @param item
     */
    public void push(T item)
    {
        node = new Node<>(item, node);
    }


    /**
     *
     * @return
     */
    public T getPop()
    {
        T result = node.item;
        if (!node.end())
        {
            node = node.next;

            return result;
        }
        return null;
    }

    public static void main(String[] args)
    {
        LinkedStack<String> lss = new LinkedStack<>();
        String testStr = "Phasers on stun";

        for (String s : testStr.split(""))
        {
            lss.push(s);

        }

        String s;

        while ((s = lss.getPop()) != null)
        {
            System.out.println("s===================>" + s);

        }

    }


    private static class Node<U>
    {
        U item;
        Node<U> next;

        public Node()
        {
            item = null;
            next = null;
        }

        public Node(U item, Node<U> next)
        {
            this.item = item;
            this.next = next;
        }


        private boolean end()
        {
            return item == null && next == null;
        }

    }

}

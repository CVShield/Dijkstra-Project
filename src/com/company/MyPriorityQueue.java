package com.company;
import java.util.PriorityQueue;
import java.util.*;
//Group: Will, Joe, and Cole.
public class MyPriorityQueue {
    PriorityQueue<IndexCard> entries = new PriorityQueue<>();

    void test(){
        System.out.println(entries.poll().getCardName());
    }

    public MyPriorityQueue() {
    }

    public void addToPriorityQueue(IndexCard card) { //You don't need to touch this method
        entries.add(card);
    }

    public IndexCard poll(){
        // System.out.println("printing priority queue");
        //showPriorityQueue();
        return entries.poll();
    }

    public void showPriorityQueue() { //It dont work, me no know why. ok.
        PriorityQueue<IndexCard> temp = new PriorityQueue<>();
        for(IndexCard s : entries){
            temp.add(s);
        }
        while(temp.size()!=0){
            if(temp.peek().getPreviousPath() != null){
                System.out.println(temp.peek().getCardName() + " : "+ temp.peek().getDistanceValue()+ " : "+ temp.peek().getPreviousPath().getCardName());
            }
            else{
                System.out.println(temp.peek().getCardName() + " : "+ temp.peek().getDistanceValue()+ " : null");
            }
            temp.poll();
        }
        System.out.println("Print FINNISHED(you know like finnish. The nationality)");

    }


    boolean contains(String str){
        for(IndexCard s : entries){
            if(s.getCardName().equals(str))
                return true;
        }
        return false;
    }

    int size(){
        return entries.size();
    }

    IndexCard peekCard(){
        return entries.peek();
    }



    public void updateHeadValue(int valueToAdd) { //Should add provided value to first object in PriorityQueue: did I do this right?
        boolean first = true;
        PriorityQueue<IndexCard> temp = new PriorityQueue<>();
        for(IndexCard s : entries){
            if(first){
                s.addToDistance(valueToAdd);
                first = false;
            }
            temp.add(s);
        }
        entries = temp;
    }
}


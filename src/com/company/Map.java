
    package com.company;
    import java.util.*;
//The lifes work of Wilhelm Von Schaffgotsch King of Prussia, Sir Leo of the Italics, as well as Fried Iced Tea

    public class Map {
        int size = 6;
        Node head;
        Node currPos;
        int distance = 0;
        Node a = new Node("A");
        Node b = new Node("B");
        Node d = new Node("D");
        Node c = new Node("C");
        Node e = new Node("E");
        Node f = new Node("F");
        ArrayList <String> names = new ArrayList<>();





        Map(){
            ArrayList<Node> nexta = new ArrayList<Node>();
            ArrayList<Node> nextb = new ArrayList<Node>();
            ArrayList<Node> nextc = new ArrayList<Node>();
            ArrayList<Node> nextd = new ArrayList<Node>();
            ArrayList<Node> nexte = new ArrayList<Node>();
            ArrayList<Node> nextf = new ArrayList<Node>();
            nexta.add(f);
            nexta.add(c);
            nexta.add(b);
            nexta.add(d);
            ArrayList<Integer> disa = new ArrayList<Integer>();
            ArrayList<Integer> disb = new ArrayList<Integer>();
            ArrayList<Integer> disc = new ArrayList<Integer>();
            ArrayList<Integer> disd = new ArrayList<Integer>();
            ArrayList<Integer> dise = new ArrayList<Integer>();
            ArrayList<Integer> disf = new ArrayList<Integer>();
            disa.add(2);
            disa.add(7);
            disa.add(8);
            disa.add(3);
            a.construct(nexta, disa);//node a :(
            nextb.add(a);
            nextb.add(e);
            disb.add(8);
            disb.add(3);
            b.construct(nextb,disb);//node b
            nextc.add(f);
            nextc.add(a);
            nextc.add(e);
            disc.add(4);
            disc.add(5);
            disc.add(1);
            c.construct(nextc, disc);//node c
//I hate this.
            nextd.add(a);
            disd.add(3);
            d.construct(nextd, disd);//node D
            nexte.add(c);
            nexte.add(b);
            dise.add(1);
            dise.add(3);
            e.construct(nexte, dise);//node e
            nextf.add(a);
            nextf.add(c);
            disf.add(4);
            disf.add(4);
            f.construct(nextf, disf);//node f AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAh
            head = a;
            currPos = a;

        }//do not open (is big)


        ArrayList<String> getNames(){return names;}

        void printMap(){
            currPos.currPos();
        }

        void trav(int index){
            int smallest = -999999999;
            int i = 1;
            for(int x = 0; x <= currPos.getDis().size(); x++){
                if(currPos.getDis().get(x) < smallest){
                    smallest = currPos.getDis().get(x);
                    i = x;
                }
            }

        }

        ArrayList<Integer> connectionsDis(){
            return currPos.getDis();
        }
        ArrayList<String> connectionsName(){
            ArrayList<String> temp = new ArrayList<String>();
            for(int x = 0; x < currPos.getNext().size(); x++){
                temp.add(currPos.getNext().get(x).getName());
            }
            return temp;
        }
        String nameOfCurrPosio(){
            return currPos.getName();
        }

        void updatePos(String str){
            if (str.equals("A")){
                currPos = a;
            }
            else if (str.equals("B")){
                currPos = b;
            }
            else if (str.equals("C")){
                currPos = c;

            }
            else if (str.equals("D")){
                currPos = d;

            }
            else if (str.equals("F")) {
                currPos = f;
            }
            else if (str.equals("E")){//for F
                currPos = e;
            }
        }


        class Node{
            ArrayList<Node> next;
            ArrayList<Integer> size;
            String name = "";
            Node(String x) {
                name = x;
            }
            String getName(){
                return name;
            }
            ArrayList<Node> getNext(){
                return next;
            }
            ArrayList<Integer> getDis(){
                return size;
            }

            void construct(ArrayList<Node> sad, ArrayList<Integer> endMii){
                next = sad;
                size = endMii;
            }

            void currPos(){
                ArrayList<Node> next = currPos.getNext();
                ArrayList<Integer> dis = currPos.getDis();
                System.out.println("Please choose one(Use Int)");
                System.out.println("Current Position: "+ name);
                for(int x = 0; x < next.size(); x++){
                    System.out.println(x+ ") " + next.get(x).getName() + ": "+ dis.get(x));
                }
            }

        }
    }









































































































































































































































































































//https://youtu.be/dQw4w9WgXcQ





























































































































































































































































































































































































































































































































































































/*
____
|  |
|  |
|  |
|  |
|  |________
|___________|
 */


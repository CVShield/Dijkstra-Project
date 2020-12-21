package com.company;
import java.util.*;
public class Dijkstra {
    MyPriorityQueue pQueue = new MyPriorityQueue();
    Map map = new Map();
    String destination = "F";
    IndexCard indexCarda = new IndexCard("A", 0);
    IndexCard indexCardb = new IndexCard("B");
    IndexCard indexCardc = new IndexCard("C");
    IndexCard indexCardd = new IndexCard("D");
    IndexCard indexCarde = new IndexCard("E");
    IndexCard indexCardf = new IndexCard("F");
    //Group: Will, Joe, and Cole.
    Dijkstra() {
        pQueue.addToPriorityQueue(indexCarda);
        pQueue.addToPriorityQueue(indexCardb);
        pQueue.addToPriorityQueue(indexCardc);
        pQueue.addToPriorityQueue(indexCardd);
        pQueue.addToPriorityQueue(indexCarde);
        pQueue.addToPriorityQueue(indexCardf);
    }

    IndexCard findIndex(String str){
        if (str.equals("A")){
            return indexCarda;
        }
        else if (str.equals("B")){
            return indexCardb;
        }
        else if (str.equals("C")){
            return indexCardc;

        }
        else if (str.equals("D")){
            return indexCardd;

        }
        else if (str.equals("E")){
            return indexCarde;
        }
        else//for F
            return indexCardf;
    }

//Group: Will, Joe, and Cole.

    void findShortestPath(String start, String End) {
        map.updatePos(start);
        while (pQueue.size() != 1) {
            IndexCard curr = pQueue.poll();
            IndexCard temp = new IndexCard("TEMP");
            ArrayList<Integer> dis = map.connectionsDis();
            ArrayList<String> name = map.connectionsName();

            System.out.println("Current Node: "+curr.getCardName());
            System.out.println("Neighbor nodes available to examine");
            for(int x = 0; x < name.size(); x++){
                System.out.print(name.get(x)+", ");
            }
            System.out.println("");


            for (int x = 0; x < dis.size(); x++) {//finds which(cant spell) card

                if(curr.getCardName().equals("E")){
                    System.out.println("EEEEEEE");

                }
                else{
                    if(pQueue.contains(name.get(x))) {
                        temp = findIndex(name.get(x));
                        //System.out.println("Temp has been set to " + temp.cardName);
                    }



                    if(temp.getDistanceValue() != null){//this dont work :( : does not add to the distance value.
                        if(temp.getDistanceValue() > curr.getDistanceValue()+dis.get(x)) {//Check how dis. val. works. might not work.
                            temp.setDistanceValue(curr.getDistanceValue() + dis.get(x));
                            temp.setPreviousPath(curr);
                        }
                    }
                    else{
                        temp.setDistanceValue(curr.getDistanceValue() + dis.get(x));
                        temp.setPreviousPath(curr);
                    }
                }
            }//end of for loop:)
            pQueue.showPriorityQueue();
            map.updatePos(pQueue.peekCard().getCardName());
        }//end of WHILE LOOP
        IndexCard bck = findIndex(End);
        System.out.println(bck.getCardName());
        while(bck.getPreviousPath() != null){
            System.out.println(bck.getPreviousPath().getCardName());
            bck = bck.getPreviousPath();
        }


    }

    void test(){
        pQueue.showPriorityQueue();
    }


}
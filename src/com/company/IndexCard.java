package com.company;

public class IndexCard implements Comparable{
    String cardName;
    Integer distanceValue;
    IndexCard previousPath;

    public IndexCard(String cardName) {
        this.cardName = cardName;
        distanceValue = 999999999;
        previousPath = null;
    }

    public IndexCard(String cardName, Integer defaultValue) {
        this.cardName = cardName;
        distanceValue = defaultValue;
        previousPath = null;
    }

    void setCardName(String str){
        cardName = str;
    }

    void setPreviousPath(IndexCard prev){
        previousPath = prev;
    }

    void setDistanceValue(int dis){
        distanceValue = dis;
    }

    public Integer getDistanceValue() {
        return distanceValue;
    }

    public void addToDistance(Integer value) {
        distanceValue += value;
    }

    String getCardName(){
        return cardName;
    }

    IndexCard getPreviousPath(){
        return previousPath;
    }

    @Override
    public String toString(){
        return cardName + " : " + distanceValue + " : " + previousPath;
    }

    @Override
    public int compareTo(Object indexCard2){
        Integer valOfIndexCard1 = this.distanceValue;
        Integer valOfIndexCard2 = ((IndexCard)indexCard2).getDistanceValue();
        Integer valOfComparison = valOfIndexCard1.compareTo(valOfIndexCard2);
        if(valOfComparison < 0){
            // System.out.println("Index2 is greater");
            return -1;
        }
        else if(valOfComparison > 0) {
            // System.out.println("Index1 is greater");
            return 1;
        }
        else{
            return 0;
        }
    }

}
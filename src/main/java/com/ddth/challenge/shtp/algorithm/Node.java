package com.ddth.challenge.shtp.algorithm;

/*create class Node for tree datastructure reference graph*/
public class Node {
    private String name;
    private Node nodeLeft;
    private Node nodeRight;
    private int costLeft;
    private int costRight;
    private int distanceLeft;
    private int distanceRight;
    
    /*create method set for each Node*/
    public void  setNodeLeft(Node left){
        this.nodeLeft=left;
    }
    /*create method set for each Node*/
    public void setNodeRight(Node right){
        this.nodeRight=right;
    }
    
    /*create method setCostLeft*/
    public void setCostLeft(int value){
        this.costLeft=value;
    }
    
    /*create method setCostRight*/
    public void setCostRight(int value){
        this.costRight=value;
    }
    
    /*create method setDistanceLeft*/
    public void setDistanceLeft(int value){
        this.distanceLeft=value;
    } 
    
    /*create method setDistanceRight*/
    public void setDistanceRigth(int value){
        this.distanceRight=value;
    }
    
    /*create method setName*/
    public void setName(String name){
        this.name=name;
    }
    
    /*create method GetNodeLeft*/
    public Node  GetNodeLeft(){
        return nodeLeft;
    }
    
    /*create method GetNodeRight*/
    public Node GetNodeRight(){
        return nodeLeft;
    }
    /*create method GetCostLeft*/
    public int GetCostLeft(){
        return costLeft;
    }
    
    /*create method GetCostRight*/
    public int GetCostRight(){
        return costRight;
    }
    
    /*create method GetDistanceLeft*/
    public int GetDistanceLeft(){
        return distanceLeft;
    }   
    /*create method GetDistanceRigth*/
    public int GetDistanceRigth(){
        return distanceRight;
    }
    /*create method GetName*/
    public String GetName(){
        return name;
    }
}
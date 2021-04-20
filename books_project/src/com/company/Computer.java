package com.company;

public class Computer {
    protected int word_size;
    protected int memory_size;
    protected int storage_size;
    protected String speed;
    Computer(){
        System.out.println();
    }
    Computer(int word_size,int memory_size,int storage_size,String speed){
        this.word_size=word_size;
        this.memory_size=memory_size;
        this.storage_size=storage_size;
        this.speed=speed;

    }
    void display(){
        System.out.println("the word size is "+word_size );
        System.out.println("the memory size is "+memory_size);
        System.out.println("the storage size is "+storage_size);
        System.out.println("the speed is "+speed);
    }    
}
class laptop extends Computer{
    protected int objects_length;
    protected int object_width;
    protected int object_height;
    protected double object_weight;
    laptop(){
        
    }
        
    
    laptop(int objects_length,int object_width,int object_height,double object_weight ){
        this.objects_length=objects_length;
        this.object_width=object_width;
        this.object_height=object_height;
        this.object_weight=object_weight;
    }
    void display(){
        super.display();
        System.out.println("the object length is "+objects_length);
        System.out.println("the object width is "+object_width);
        System.out.println("the object height is "+object_height);
        System.out.println("the object weight is "+object_width);
    }
    
}

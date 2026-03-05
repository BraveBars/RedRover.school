package com.hw9.task1;

//Write a class Block that creates a block (Duh..)
//
//Requirements
//The constructor should take an array as an argument, this will contain
//3 integers of the form [width, length, height] from which the Block should be created.
//
//Define these methods:
//`getWidth()` return the width of the `Block`
//`getLength()` return the length of the `Block`
//`getHeight()` return the height of the `Block`
//`getVolume()` return the volume of the `Block`
//`getSurfaceArea()` return the surface area of the `Block`
public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int[] dimensions) {
        this.width = dimensions[0];
        this.length = dimensions[1];
        this.height = dimensions[2];
    }

    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
    public int getHeight(){
        return height;
    }
    public int getVolume(){
        return width * length * height;
    }
    public int getSurfaceArea(){
        return 2 * (width * length + width * height + length * height);
    }

    public static void main(String[] args) {
        int[] data = {2,3,4};
        Block block = new Block(data);
        System.out.println(block.getWidth());
        System.out.println(block.getLength());
        System.out.println(block.getHeight());
        System.out.println(block.getVolume());
        System.out.println(block.getSurfaceArea());
    }
}

package com.company.Lab1;

/**
 * The class which represent a fibonacci number
 *
 */
public class Fibonacci{

    /**
     *  Instance private values to check all fibonacci number values
     */
    private int index;
    private int value;

    /**
     * Constructs a new {@code Fibonacci} that equals to first number values
     */
    public Fibonacci(){
        index = 1;
        value = 1;
    }

    /**
     * Constructs a new {@code Fibonacci} that equals to values user enter
     *
     * @param  index An index that shows which fibonacci number is
     * @param  value A value of fibonacci number
     */
    public Fibonacci(int index, int value){
        this.index = index;
        this.value = value;
    }

    /**
     * Getter of private field Index
     * @return значення index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Setter of field Index
     * @param index An index that shows which fibonacci number is
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Getter of private field Value
     * @return значення Value
     */
    public int getValue() {
        return value;
    }

    /**
     * Setter of field Value
     * @param value A value of fibonacci number
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Method that checks if fibonacci number is square
     *
     * @return true or false
     */
    public boolean isSquare(){
        return Math.sqrt(this.value) % 1 == 0;
    }
}

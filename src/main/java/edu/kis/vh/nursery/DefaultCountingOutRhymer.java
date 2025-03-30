package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY = -1;
    public static final int FULL = 11;
    public static final int DEF = -1;

    private int[] numbers = new int[CAPACITY];
    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEF;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEF;
        return numbers[total--];
    }
}
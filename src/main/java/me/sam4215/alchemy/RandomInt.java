package me.sam4215.alchemy;

import java.util.Random;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY CARBON STUDIOS.
 * <p/>
 * FILE CREATED ON 5/19/2015 at 6:33 PM
 */
public class RandomInt {
    public int getRandomNumber(int lowBound, int highBound) {
        int temp = 0;
        if(lowBound > highBound){
            temp = lowBound;
            lowBound = highBound;
            highBound = temp;
        }
        Random rand = new Random();
        for(int i = 1; i > 0; i++) {
            temp = rand.nextInt() % highBound + 1;
            while (temp < lowBound | temp > highBound) {
                temp = rand.nextInt() % highBound + 1;
            }
        }
        return temp;
    }
}

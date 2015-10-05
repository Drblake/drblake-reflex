package cs.ualberta.ca.drblake_reflex;

import java.util.ArrayList;
/**
 * Created by Dylan on 2015-10-04.
 */
public class Statistics {
    public Statistics(ArrayList stat) {
        this.stat = stat;
    }

    protected ArrayList stat;


    private double Mean(int new_Size) {
        int total = 0;
        double sum = 0.00;
        for (int i = 1; i < new_Size; i++) {
            total++;
            sum+= (double) stat.get(i);
        }
        return ((sum)/(double) total);

    }

    private double Max(int new_Size) {
        double max = 0.00;
        for (int i = 1; i < new_Size; i++) {
            if ((double) stat.get(i) > max) {
                max = (double) stat.get(i);
            }
        }
        return max;
    }

    private double Min(int new_Size) {
        double min = 0.00;
        for (int i = 1; i < new_Size; i++) {
            if ((double) stat.get(i) < min) {
                min = (double) stat.get(i);
            }
        }
        return min;
    }

    private double Median(int new_Size) {
        double max = 0.00;
        for (int i = 1; i < new_Size; i++) {
            if ((double) stat.get(i) > max) {
                max = (double) stat.get(i);
            }
        }
        return max;
    }
}

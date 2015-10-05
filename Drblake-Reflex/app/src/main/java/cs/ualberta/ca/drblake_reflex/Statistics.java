/*This file is part of Drblake-reflex.

    Drblake-reflex is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Drblake-reflex is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Drblake-reflex.  If not, see <http://www.gnu.org/licenses/>.*/
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

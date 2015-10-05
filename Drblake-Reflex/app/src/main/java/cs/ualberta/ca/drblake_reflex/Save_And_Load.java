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
public class Save_And_Load {
    public void saveWinner(String winner,int gameMode){
        if (gameMode == 2){
            //Store in list 2
        }
        if (gameMode == 3){
            //Store in list 3
        }
        if (gameMode == 4){
            //Store in list 4
        }

    }
    public void saveReaction(long reactionTime){
        //store in list 1
    }
    public ArrayList loadReaction(){
        //return arraylist of reaction times
        ArrayList a = new ArrayList();
        return a;
    }
    public ArrayList loadWinner(int gameMode){
        //return arraylist related to gamemode
        ArrayList a = new ArrayList();
        return a;
    }
}

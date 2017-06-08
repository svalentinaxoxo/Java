/***********************************************************************************
*ShelbyLaquitaraChapter9.java
*Shelby Laquitara
*
*This program reads input for occupied hotel rooms and using the Java API, sorts
the rooms, then searches for a particular room to see if it is occupied or not.
***********************************************************************************/

import java.util.*;

import java.io.*;



class ShelbyLaquitaraChapter9 {



// precondition: array rooms[] is sorted

public static boolean BinarySearch(Integer[] rooms,int room) {

int lo = 0;

int hi = rooms.length - 1;

while (lo <= hi) {

int mid = lo + (hi - lo) / 2;

if (room< rooms[mid]) hi = mid - 1;

else if (room> rooms[mid]) lo = mid + 1;

else return true;

}

return false;

}



public static void main(String[] args) throws IOException

{

Scanner s=new Scanner(System.in);

ArrayList<Integer> rooms= new ArrayList<Integer>();

int room=0;



System.out.println("Please enter an occupied hotel room number, -1 to quit");

while(room != -1)

{

room = s.nextInt();

rooms.add(room);

}

System.out.print("Please enter a room to search for: ");

room = s.nextInt();

//sort array using java api

Collections.sort(rooms);



if( BinarySearch(rooms.toArray(new Integer[0]),room) )

System.out.println("This room is 'Occupied' ");

else

System.out.println("This room is 'Unoccupied' ");



}// end main

}// end class ShelbyLaquitaraChapter9
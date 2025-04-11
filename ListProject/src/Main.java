//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
//        List person = new ArrayList();
//        System.out.println(person.size());
//        person.add("raju");
//        person.add(12);
//        person.add(true)

        // CURD Operation
        List<Player>  playerlist= new ArrayList();
        playerlist.add(new Player(1,"Hema",200));
        playerlist.add(new Player(2,"MS Dhoni",8000));
        playerlist.add(new Player(3,"Virat",9000));

        Player p1 = new Player(5,"tanu",5000);
   

       playerlist.add(p1);
        System.out.println("the details are "+ playerlist);



        // remove all
        boolean present = playerlist.contains(p1);
         System.out.println("the details of conatins are:"+present);

        // remove the element using player id
        playerlist.remove(playerlist.get(1).Playerid);


                System.out.println("after removing"+ playerlist);
        System.out.println("The filter is : ");
        // filter a element from list
        playerlist.removeIf(r -> r.Playername== p1.Playername);
        // print list
        for (Player i :playerlist) {
            System.out.println(i);
        }


    }
}
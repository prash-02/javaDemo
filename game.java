import java.util.*;
class Gausser {
    int gaussNum;

    int GaussingNumber()

    {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Kindely Gauss number");
            gaussNum = scan.nextInt();
        }
        return gaussNum;
    }
}

class Player {
    int gaussNum;

    int GaussingNumber() {
       
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Kindely Gauss number");
            gaussNum = scan.nextInt();
        }
        return gaussNum;
    }
}

class Umpire {
    int numFromGausser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void CollectNumFromGausser() {
        Gausser g = new Gausser();
        numFromGausser = g.GaussingNumber();
    }

    void CollectNumFromPlyaers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.GaussingNumber();
        numFromPlayer2 = p2.GaussingNumber();
        numFromPlayer3 = p3.GaussingNumber();
    }

    void compare() {
        if (numFromGausser == numFromPlayer1) {
            System.out.println("Playyer1 Won");
        } else if (numFromGausser == numFromPlayer2) {
            System.out.println("Player2 win");
        } else if (numFromGausser == numFromPlayer3) {
            System.out.println("Player3 win");
        } else {
            System.out.println("No One Won");
        }
    }
}

public class game {
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u = new Umpire();
        u.CollectNumFromGausser();
        u.CollectNumFromPlyaers();
        u.compare();

    }

}

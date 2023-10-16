// class 2: LogicKnowledge

public class LogicKnowledge {

    // Question 3: greenTicket Method
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    // Question 4: makeChocolate Method
    public static int makeChocolate(int small, int large, int goal) {
        int maxLarge = goal / 5;
        if (maxLarge <= large) {
            goal -= maxLarge * 5;
        } else {
            goal -= large * 5;
        }

        if (goal <= small) {
            return goal;
        }
        return -1;
    }

    public static void main(String[] args) {
        // test of greenTicket method
        System.out.println(greenTicket(1, 2, 3));    // 0
        System.out.println(greenTicket(2, 2, 2));    // 20
        System.out.println(greenTicket(1, 1, 2));    // 10

        // test of makeChocolate method
        System.out.println(makeChocolate(4, 1, 9));   // 4
        System.out.println(makeChocolate(4, 1, 10));  // -1
        System.out.println(makeChocolate(4, 1, 7));   // 2
        System.out.println(makeChocolate(4, 2, 7));   // 2
    }
}

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
        int totalLarge = 5 * large;
        if (totalLarge > goal) {
            totalLarge = (goal / 5) * 5;
        }

        if (totalLarge + small >= goal) {
            return goal - totalLarge;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(greenTicket(1, 2, 3));
        System.out.println(greenTicket(2, 2, 2));
        System.out.println(greenTicket(1, 1, 2));

        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
        System.out.println(makeChocolate(4, 2, 7));
    }
}

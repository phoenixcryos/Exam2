public class StringKnowledge {

    // question 1 : endOther method
    public static boolean endOther(String a, String b) {
        //convert strings to lower case
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        //string check to make sure they don't contain each other
        return lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA);
    }


    //question 2: findRepeats method
    public static boolean findRepeats(String toTest) {
        for (int i = 0; i < toTest.length() - 1; i++) {
            for (int j = i + 2; j <= toTest.length(); j++) {
                String sub = toTest.substring(i, j);
                if (toTest.indexOf(sub, i + 1) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //test for endOther method
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
        System.out.println(endOther("abc", "xyz"));

        //test for findRepeats method
        System.out.println(findRepeats("abba"));
        System.out.println(findRepeats("abaaba"));
        System.out.println(findRepeats("I love hams in the desert. Just love eating a ham."));
    }
}

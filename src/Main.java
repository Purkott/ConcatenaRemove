public class Main {
    public static void main(String[] args) {
        ConcatenaRemove cr = new ConcatenaRemove();
        System.out.println("s = blablablabla \nt = blablabcde \nk = 8 \n ");
        System.out.println(cr.ConcatERemove("blablablabla", "blablabcde", 8));

        System.out.println("s = aba \nt = aba \nk = 7 \n ");
        System.out.println(cr.ConcatERemove("aba", "aba", 7));

        System.out.println("s = ashley \nt = ash \nk = 2 \n ");
        System.out.println(cr.ConcatERemove("ashley", "ash", 2));

        System.out.println("s = 1abc \nt = ash \nk = 4 \n ");
        System.out.println(cr.ConcatERemove("1abc", "ash", 4));

        System.out.println("s = Sabc \nt = ash \nk = 4 \n ");
        System.out.println(cr.ConcatERemove("1abc", "ash", 4));

        System.out.println("s = 1abc \nt = ash \nk = 101 \n ");
        System.out.println(cr.ConcatERemove("1abc", "ash", 101));
    }
}

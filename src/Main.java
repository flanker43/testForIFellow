public class Main {

    public static void main(String[] args) {
        BracketsCounter bc = new BracketsCounter();
        System.out.println("Обычная реализация");
        System.out.println(bc.count("(()"));
        System.out.println(bc.count(")()())"));
        System.out.println(bc.count(")(()())"));
        System.out.println(bc.count(")("));
        System.out.println("-------------------------------");
        System.out.println("Реализация с помощью стрима");
        System.out.println(bc.countWithStreams("(()"));
        System.out.println(bc.countWithStreams(")()())"));
        System.out.println(bc.countWithStreams(")(()())"));
        System.out.println(bc.countWithStreams(")("));
    }
}

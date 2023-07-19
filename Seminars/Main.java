package Seminars;

public class Main {
    public static void main(String[] args) {
        Animal barsic = new Animal("Барсик", "Алексей", "простуда", false);

        System.out.println(barsic.isVactinated());
        barsic.setIsVactinated(true);
        System.out.println(barsic.isVactinated());
        System.out.println(barsic.getType());

    }
}

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 85;
        double height = 1.77;
        int index = (int) service.calculate(85,1.77);
        System.out.println("Твой индекс массы тела: " + index);
    }
}

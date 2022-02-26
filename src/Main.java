public class Main {
    public static void main(String[] args) {
        ImtService service;
        service = new ImtService();
        double imt = service.calculate(75, 1.72);
        System.out.println("Индекс массы тела равен: " + imt + " (кг/м2)");
    }
}
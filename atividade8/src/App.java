import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float sal;
        float horas;
        System.out.printf("Quanto você ganha por hora: ");
        sal = ler.nextFloat();
        System.out.printf("Quantas horas você trabalha por mês: ");
        horas = ler.nextFloat();
        System.out.println("O seu sálario nesse mês foi: " + (sal*horas));
    }
}

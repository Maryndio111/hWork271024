import java.awt.geom.Arc2D;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> produkts = new ArrayList<>();
        produkts.add(new Product("Товар 1", 100.0, 10.7, 10));
        produkts.add(new Product("Товар 2", 450.0, 8.9, 9));
        produkts.add(new Product("Товар 3", 200.0, 4.5, 3));
        produkts.add(new Product("Товар 4", 700.0, 5.2, 8));
        produkts.add(new Product("Товар 5", 90.0, 6.1, 18));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Способ сортировки товара: ");
        System.out.println("1 - Цена по возрастанию");
        System.out.println("2 - Цена по убыванию");
        System.out.println("3 - По рейтингу");
        System.out.println("4 - Количество на складе");

        int choice = scanner.nextInt();
        if (choice == 1) {
            Collections.sort(produkts, new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {

                    return Double.compare(p1.getPrice(), p2.getPrice());
                }
            });
        }else if (choice==2){
            Collections.sort(produkts, new Comparator<Product>() {
                @Override
                public int compare(Product p3, Product p4) {

                    return Double.compare(p3.getPrice(), p4.getPrice());
                }
            });
        } else if (choice == 3) {
            Collections.sort(produkts, new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {
                    return Double.compare(p1.getRating(), p2.getRating());
                }
            });
        } else if (choice == 4) {
            Collections.sort(produkts, new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {

                    return Double.compare(p1.getQuantity(), p2.getQuantity());
                }
            });
        }else{
            System.out.println("ОШИБКА! Сделайте другой выбор товара!");
            scanner.close();
            return;

        }
        System.out.println("Cписок выбранных товаров:  ");
        for (Product product : produkts){
            System.out.println(product);
        }
        scanner.close();

    }
    }







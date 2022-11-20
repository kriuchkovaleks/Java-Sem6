
import java.util.*;
import java.util.logging.Logger;

import javax.print.DocFlavor.STRING;

public class Task1 {
    public static void main(String[] args) {
        Logger lg = Logger.getAnonymousLogger();

        Laptop laptop1 = new Laptop(0, 256, 8, 15, "macOS", "white", "Aple");
        Laptop laptop2 = new Laptop(0, 256, 8, 15, "macOS", "white", "Aple");
        Laptop laptop3 = new Laptop(0, 1, 1, 1, "1", "1", "1");
        Laptop laptop4 = new Laptop(0, 256, 8, 15, "macOS", "white", "Aple");
        Laptop laptop5 = new Laptop(0, 512, 16, 15, "Windows", "silver", "Honor");
        Laptop laptop6 = new Laptop(0, 256, 4, 15, "Windows", "black", "Asus");

        laptop1.setId(1);
        laptop2.setId(2);
        laptop3.setId(3);
        laptop4.setId(4);
        laptop5.setId(5);
        laptop6.setId(6);

        HashSet<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);

        lg.info(laptops.toString());
        System.out.println("Введите запрос:");
        HashMap<String, String> userRequest = userRequest();
        filter(laptops, userRequest);

    }

    public static HashMap<String, String> userRequest() {
        HashMap<String, String> userRequest = new HashMap<>();
        Scanner userInput = new Scanner(System.in, "Cp866");
        System.out.println("Введите объем HDD");
        userRequest.put("Объем HDD:", userInput.nextLine());
        System.out.println("Введите объем RAM");
        userRequest.put("Объем RAM:", userInput.nextLine());
        System.out.println("Введите диагональ дисплея");
        userRequest.put("Диагональ дисплея:", userInput.nextLine());
        System.out.println("Введите тип ОС");
        userRequest.put("Тип ОС:", userInput.nextLine());
        System.out.println("Введите цвет");
        userRequest.put("Цвет", userInput.nextLine());
        System.out.println("Введите производителя");
        userRequest.put("Производитель", userInput.nextLine());
        // userInput.close();
        return userRequest;

    }

    public static void filter(HashSet<Laptop> laptops, HashMap<String, String> userRequest) {
        int count = 0;
        for (Laptop item : laptops) {
            if (item.getID() > 0) {
                if (userRequest.get("Объем HDD:").equals(item.getHdd_volume())) {
                    System.out.println(item);
                    if (userRequest.get("Объем RAM:").equals(item.getRam_volume())) {
                        if (userRequest.get("Диагональ дисплея:").equals(item.getDisplay_size())) {
                            if (userRequest.get("Тип ОС:").equals(item.getOs_type())) {
                                if (userRequest.get("Цвет").equals(item.getColor())) {
                                    if (userRequest.get("Производитель").equals(item.getBrand())) {
                                        System.out.println(item);
                                        count = count + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        if (count == 0) {
            System.out.println("По Вашему запросу ничего не найдено");
        }

    }

}

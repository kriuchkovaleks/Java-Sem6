
/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ

2 - Объем ЖД

3 - Операционная система

4 - Цвет …

3.1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
4. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

public class Laptop {
    private int id;
    private int hdd_volume;
    private int ram_volume;
    private int display_size;
    private String os_type;
    private String color;
    private String brand;

    public Laptop(int id, int hdd_volume, int ram_volume, int display_size, String os_type, String color,
            String brand) {
        // this.id = id;
        this.hdd_volume = hdd_volume;
        this.ram_volume = ram_volume;
        this.display_size = display_size;
        this.os_type = os_type;
        this.color = color;
        this.brand = brand;
    }

    public int getID() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDisplay_size() {
        return display_size;
    }

    public void setDisplay_size(int display_size) {
        this.display_size = display_size;
    }

    public int getHdd_volume() {
        return hdd_volume;
    }

    public void setHdd_volume(int hdd_volume) {
        this.hdd_volume = hdd_volume;
    }

    public String getOs_type() {
        return os_type;
    }

    public void setOs_type(String os_type) {
        this.os_type = os_type;
    }

    public int getRam_volume() {
        return ram_volume;
    }

    public void setRam_volume(int ram_volume) {
        this.ram_volume = ram_volume;
    }

    @Override
    public String toString() {
        return "{id=" + id + ",  brand=" + brand + ", color=" + color + ", display_size=" + display_size
                + ", hdd_volume="
                + hdd_volume + ",  ram_volume=" + ram_volume + ",  os_type=" + os_type + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (display_size != other.display_size)
            return false;
        if (hdd_volume != other.hdd_volume)
            return false;
        if (os_type == null) {
            if (other.os_type != null)
                return false;
        } else if (!os_type.equals(other.os_type))
            return false;
        if (ram_volume != other.ram_volume)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + display_size * hdd_volume;
        return result;
    }
}

public class Department {
    
    protected int id;
    protected String name;
    protected float price;
    protected int year;

    public Department(int id, String name, float price, int year) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + ", price=" + price + ", year=" + year + "]";
    }

}

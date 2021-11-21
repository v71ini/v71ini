- 👋 Hi, I’m @v71ini
- 👀 I’m interested in ...
- 🌱 I’m currently learning ...
- 💞️ I’m looking to collaborate on ...
- 📫 How to reach me ...

<!---
v71ini/v71ini is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
public class Book {
    String name;
    String author;
    int price;

    public int getPrice(int price) {
        return price;
    }

    public int getQtyInStock(int qtyInstock) {
        return qtyInStock;
    }

    int qtyInStock;

    public String getName(String name) {
        return name;
    }
    public String getAuthor(String author) {
        return author;}

    public Book(String name, String author, int price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }


    }
class test1{
    public static void main(String[] args) {
        Book obj=new Book("absx","fhdr",23,5);
        System.out.println( obj.getName("abxs"));
        System.out.println(obj.getAuthor("vbfhg"));
        System.out.println(obj.getPrice(500));
        System.out.println(obj.getQtyInStock(23));



    }
    }

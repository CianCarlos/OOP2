package Lab3;

/**
 * Created by CianC on 13/10/2017.
 */
public class Book {
    public String title;
    public float price;
    public String ISBN;
    public int pages;

    public Book(String title2) {
        this("Title", (float) 0.00, "No ISBN", 0);
    }

    public Book(String title, float price, String ISBN, int pages){
        this.title = title;
        this.price = price;
        this.ISBN = ISBN;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getISBN() {
        if(ISBN.length()>10){
            return "Invalid ISBN";
        } else {
            return ISBN;
        }
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public String toString(){
        return null;
    }
}

package com.company;

public class ChildrenBook extends Book{
    private int age;
    public ChildrenBook(){
        super();
        this.age=0;
    }
    public ChildrenBook(String title, Author author, BookType type, int available, double price,  int age){
        super(title, author, type, available, price);
        this.age=age;
    }
    @Override
    public double getPrice(){
        double newPrice=super.getOriginalPrice()*0.3;
        System.out.println("Книгата" + toString()+ " е намалена с 70% и е на цена " + newPrice);
        return newPrice;
    }
    public String toString2(){
        return "ChildrenBook{"+
                "age " + age+
                "}";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.readingbooks.springboot.readingbooks.entity;


import javax.persistence.*;
@Entity
@Table(name = "order")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(name = "customer_num", nullable = false)
    private int Cid;
    @Column(name = "book_num")
    private int Bid;
    @Column(name = "book_name")
    private String bookname;
   /* @OneToMany(targetEntity = Books.class,cascade = CascadeType.ALL)
    @OneToMany(targetEntity = Customer.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "AD",referencedColumnName = "id")
    private List<Books> books;
    private List<Customer> customers;
*/
    public Order() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public int getBid() {
        return Bid;
    }

    public void setBid(int bid) {
        Bid = bid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}

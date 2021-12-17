package com.readingbooks.springboot.readingbooks.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")

public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(name = "bookname", nullable = false)
    private String bookname;
    @Column(name = "book_num")
    private int Bid;

    public Books() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBid() {
        return Bid;
    }

    public void setBid(int bid) {
        Bid = bid;
    }
}

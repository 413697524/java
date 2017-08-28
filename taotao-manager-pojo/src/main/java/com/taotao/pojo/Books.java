package com.taotao.pojo;

import java.util.Date;

public class Books {
    private Short bookId;

    private String bookName;

    private String bookPic;

    private String bookAuthor;

    private String bookPub;

    private String bookSort;

    private String bookOwner;

    private String bookBorrower;

    private Date bookBorrowerTime;

    public Short getBookId() {
        return bookId;
    }

    public void setBookId(Short bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookPic() {
        return bookPic;
    }

    public void setBookPic(String bookPic) {
        this.bookPic = bookPic == null ? null : bookPic.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getBookPub() {
        return bookPub;
    }

    public void setBookPub(String bookPub) {
        this.bookPub = bookPub == null ? null : bookPub.trim();
    }

    public String getBookSort() {
        return bookSort;
    }

    public void setBookSort(String bookSort) {
        this.bookSort = bookSort == null ? null : bookSort.trim();
    }

    public String getBookOwner() {
        return bookOwner;
    }

    public void setBookOwner(String bookOwner) {
        this.bookOwner = bookOwner == null ? null : bookOwner.trim();
    }

    public String getBookBorrower() {
        return bookBorrower;
    }

    public void setBookBorrower(String bookBorrower) {
        this.bookBorrower = bookBorrower == null ? null : bookBorrower.trim();
    }

    public Date getBookBorrowerTime() {
        return bookBorrowerTime;
    }

    public void setBookBorrowerTime(Date bookBorrowerTime) {
        this.bookBorrowerTime = bookBorrowerTime;
    }
}
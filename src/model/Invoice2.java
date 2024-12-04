package model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Invoice2 {

    private int invoiceId;
    private String stdName;
    private String subject;
    private String date;
    private double price;

        public Invoice2(int invId, String stdName, String subj, String date, double price) {
        this.invoiceId = invId;
        this.stdName = stdName;
        this.subject = subj;
        this.date = date;
        this.price = price;
    }

    /**
     * @return the invoiceId
     */
    public int getInvoiceId() {
        return invoiceId;
    }

    /**
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * @return the stdName
     */
    public String getStdName() {
        return stdName;
    }

    /**
     * @param stdName the stdName to set
     */
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

   

  

}

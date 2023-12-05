package org.example;

public class Invoice {
   private InvoiceItem firstItem;
   private InvoiceItem secondItem;
   private InvoiceItem thirdItem;

   public Invoice(InvoiceItem firstItem, InvoiceItem secondItem, InvoiceItem thirdItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
    }

    public InvoiceItem getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(InvoiceItem firstItem) {
        this.firstItem = firstItem;
    }

    public InvoiceItem getSecondItem() {
        return secondItem;
    }

    public void setSecondItem(InvoiceItem secondItem) {
        this.secondItem = secondItem;
    }

    public InvoiceItem getThirdItem() {
        return thirdItem;
    }

    public void setThirdItem(InvoiceItem thirdItem) {
        this.thirdItem = thirdItem;
    }

    public double getInvoiceTotal(){
        return firstItem.getItemTotal() + secondItem.getItemTotal() + thirdItem.getItemTotal();
    }
}

package org.example;

public class InvoiceTester {
    public static void main(String[] args) {
//        var firstItem = new InvoiceItem(new Product(4068,"Onion",0.46),2);
//        var secondItem = new InvoiceItem(new Product(2302,"Banana",0.99),23);
//        var thirdItem = new InvoiceItem(new Product(10233,"Pear",1.35), 3);

        Invoice invoice = new Invoice(new InvoiceItem(new Product(4068,"Onion",0.46),2),
                                      new InvoiceItem(new Product(2302,"Banana",0.99),23),
                                      new InvoiceItem(new Product(10233,"Pear",1.35), 3)
                                     );
        System.out.printf("Item: %s\n\tID: %d\n\tUnit price: $%.2f\n\tQuantity: %d\n\tSubtotal: $%.2f\n\n",invoice.getFirstItem().getProduct().getDescription(),invoice.getFirstItem().getProduct().getId(),
                invoice.getFirstItem().getProduct().getPrice(),invoice.getFirstItem().getQuantity(),invoice.getFirstItem().getItemTotal());
        System.out.printf("Item: %s\n\tID: %d\n\tUnit price: $%.2f\n\tQuantity: %d\n\tSubtotal: $%.2f\n\n",invoice.getSecondItem().getProduct().getDescription(),invoice.getSecondItem().getProduct().getId(),
                invoice.getSecondItem().getProduct().getPrice(),invoice.getSecondItem().getQuantity(),invoice.getSecondItem().getItemTotal());
        System.out.printf("Item: %s\n\tID: %d\n\tUnit price: $%.2f\n\tQuantity: %d\n\tSubtotal: $%.2f\n\n",invoice.getThirdItem().getProduct().getDescription(),invoice.getThirdItem().getProduct().getId(),
                invoice.getThirdItem().getProduct().getPrice(),invoice.getThirdItem().getQuantity(),invoice.getThirdItem().getItemTotal());
        System.out.printf("Invoice Total: $%.2f",invoice.getInvoiceTotal());
    }
}

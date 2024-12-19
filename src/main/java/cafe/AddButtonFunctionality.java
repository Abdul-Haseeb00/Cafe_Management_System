package cafe;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

class AddButtonFunctionality {

    static double total = 0.0;
    private static int receiptHeaderCount = 0;

    public static void addButtonAction(JSpinner spinner, JTextArea receiptArea, JLabel itemLabel, int pricePerUnit) {
        int quantity = (Integer) spinner.getValue();
        if (quantity <= 0 || pricePerUnit <= 0) {
            System.out.println("Invalid quantity or price per unit.");
            return;
        }

        if (receiptHeaderCount == 0) {
            addReceiptHeader(receiptArea);
        }

        double price = quantity * pricePerUnit;
        total += price;
        receiptHeaderCount++;

        String formattedLine = String.format(
            "%-3d. %-15d X %-25s %10.2f\n", 
            receiptHeaderCount, quantity, itemLabel.getText(), price
        );
        receiptArea.append(formattedLine);
        spinner.setValue(0); // Reset spinner
    }

    private static void addReceiptHeader(JTextArea receiptArea) {
        receiptArea.append(
            "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n" +
            "                                      Cafe Vista\n" +
            "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
        );
    }

    public static double getTotal() {
        return total;
    }


    public static void reset() {
         total = 0.0;
        receiptHeaderCount = 0;
    }
}

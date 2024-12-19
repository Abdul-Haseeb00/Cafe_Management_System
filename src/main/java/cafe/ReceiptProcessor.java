package cafe;

import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ReceiptProcessor {

    public void processReceipt(
            JTextArea receiptArea, JTextField taxField, JTextField totalField,
            JTextField serviceChargesField, int orderId
    ) {
        if (receiptArea.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No items selected. Please add items first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double total = AddButtonFunctionality.getTotal();
        double tax = calculateGST(total);
        double serviceCharges = calculateServiceCharges(total);
        double finalTotal = total + tax + serviceCharges;

        taxField.setText(String.format("%.2f", tax));
        serviceChargesField.setText(String.format("%.2f", serviceCharges));
        totalField.setText(String.format("%.2f", finalTotal));

        receiptArea.append(
                "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "GST (11%):\t\t" + taxField.getText() + "\n"
                + "Service Charges (5%):\t" + serviceChargesField.getText() + "\n"
                + "Total:\t\t" + totalField.getText() + "\n"
                + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "                                     Thank You\n"
                + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
        );

        try {
            receiptArea.print();
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Error while printing receipt.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        Save_Data_to_Database.saveOrderToDatabase(finalTotal);
        AddButtonFunctionality.reset();
    }

    private double calculateGST(double total) {
        return total * 0.11;
    }

    private double calculateServiceCharges(double total) {
        return total * 0.05;
    }

}

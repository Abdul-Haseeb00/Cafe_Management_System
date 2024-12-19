package cafe;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ReceiptCalculator {

    public static void calculateAndDisplayReceipt(
            double total, JTextField taxField, JTextField serviceChargesField, JTextField totalField, JTextArea receiptArea, int orderid) {
        if (total == 0.0) {
            JOptionPane.showMessageDialog(null, "Please add items to calculate total.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double tax = calculateGST(total);
        double serviceCharges = calculateServiceCharges(total);
        double finalTotal = total + tax + serviceCharges;

        taxField.setText(String.format("%.2f", tax));
        serviceChargesField.setText(String.format("%.2f", serviceCharges));
        totalField.setText(String.format("%.2f", finalTotal));

        receiptArea.append("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "GST (11%):\t\t" + taxField.getText() + "\n"
                + "Service Charges (5%):\t" + serviceChargesField.getText() + "\n"
                + "Total:\t\t" + totalField.getText() + "\n"
                + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
        );
    }

    private static double calculateGST(double total) {
        return total * 0.11;
    }

    private static double calculateServiceCharges(double total) {
        return total * 0.05;
    }
}

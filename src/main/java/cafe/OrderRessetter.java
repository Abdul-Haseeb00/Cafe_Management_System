package cafe;

import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class OrderRessetter {

    public static void resetOrder(
        JSpinner[] spinners, JTextArea receiptArea, JTextField taxField, 
        JTextField totalField, JTextField serviceChargesField
    ) {
        for (JSpinner spinner : spinners) {
            spinner.setValue(0);
        }
        receiptArea.setText("");
        taxField.setText("0.0");
        totalField.setText("0.0");
        serviceChargesField.setText("0.0");
        AddButtonFunctionality.reset();
    }
}

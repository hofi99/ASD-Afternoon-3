package at.tugraz.asdafternoon3.ui;

import at.tugraz.asdafternoon3.FlatApplication;
import at.tugraz.asdafternoon3.data.Flat;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlatOverview {
    private JPanel contentPane;
    private JPanel main;
    private JPanel BasicOverview;
    private JPanel Navigation;
    private JButton roomMateButton;
    private JButton shoppingListButton;
    private JButton cleaningScheduleButton;
    private JButton financeFurnitureAndEquipmentButton;
    private JButton financeFlatButton;
    private JTextArea taName;
    private JTextArea taSize;
    private JTextArea taAddress;
    private JButton selectFlatButton;

    public FlatOverview(Flat flat) {
        setFlatInformation(flat);

        roomMateButton.addActionListener(e ->
                FlatApplication.get().setContentPane(new RoommateOverview(flat).getContentPane()));
        selectFlatButton.addActionListener(e ->
                FlatApplication.get().setContentPane(new FlatList(flat).getContentPane()));


        cleaningScheduleButton.addActionListener(e ->
                FlatApplication.get().setContentPane(new CleaningScheduleUI(flat).getContentPane()));

    }

    public JPanel getContentPane() {
        return contentPane;
    }

    public void setFlatInformation(Flat flat) {
        taName.setText(flat.getName());
        taAddress.setText(flat.getAddress());
        taSize.setText(flat.getSize().toString());
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));
        main = new JPanel();
        main.setLayout(new BorderLayout(0, 0));
        contentPane.add(main, BorderLayout.CENTER);
        BasicOverview = new JPanel();
        BasicOverview.setLayout(new GridLayoutManager(9, 4, new Insets(0, 0, 0, 0), -1, -1));
        BasicOverview.setBackground(new Color(-14078925));
        main.add(BasicOverview, BorderLayout.NORTH);
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-4145152));
        label1.setText("Name:");
        BasicOverview.add(label1, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(68, 18), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setForeground(new Color(-4145152));
        label2.setText("Size:");
        BasicOverview.add(label2, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(68, 18), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setForeground(new Color(-4145152));
        label3.setText("Address:");
        BasicOverview.add(label3, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(68, 18), null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setBackground(new Color(-14078925));
        Font label4Font = this.$$$getFont$$$(null, -1, 28, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-4145152));
        label4.setText("Flat");
        BasicOverview.add(label4, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        BasicOverview.add(spacer1, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 35), new Dimension(358, 35), new Dimension(-1, 35), 35, false));
        final Spacer spacer2 = new Spacer();
        BasicOverview.add(spacer2, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 10), new Dimension(358, 10), new Dimension(-1, 10), 10, false));
        final Spacer spacer3 = new Spacer();
        BasicOverview.add(spacer3, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 10), new Dimension(358, 10), new Dimension(-1, 10), 10, false));
        taName = new JTextArea();
        taName.setEnabled(false);
        taName.setText("");
        BasicOverview.add(taName, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(358, 50), null, 0, false));
        taSize = new JTextArea();
        taSize.setEnabled(false);
        BasicOverview.add(taSize, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(358, 50), null, 0, false));
        taAddress = new JTextArea();
        taAddress.setEnabled(false);
        BasicOverview.add(taAddress, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(358, 50), null, 0, false));
        final Spacer spacer4 = new Spacer();
        BasicOverview.add(spacer4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 20, false));
        final Spacer spacer5 = new Spacer();
        BasicOverview.add(spacer5, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 20, false));
        final Spacer spacer6 = new Spacer();
        BasicOverview.add(spacer6, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 5, false));
        final JLabel label5 = new JLabel();
        label5.setText("test");
        BasicOverview.add(label5, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        Navigation = new JPanel();
        Navigation.setLayout(new GridLayoutManager(11, 4, new Insets(0, 0, 0, 0), -1, -1));
        Navigation.setBackground(new Color(-14078925));
        main.add(Navigation, BorderLayout.CENTER);
        shoppingListButton = new JButton();
        shoppingListButton.setBackground(new Color(-12816512));
        shoppingListButton.setForeground(new Color(-1));
        shoppingListButton.setText("Shopping list");
        Navigation.add(shoppingListButton, new GridConstraints(3, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cleaningScheduleButton = new JButton();
        cleaningScheduleButton.setBackground(new Color(-12816512));
        cleaningScheduleButton.setForeground(new Color(-1));
        cleaningScheduleButton.setText("Cleaning schedule");
        Navigation.add(cleaningScheduleButton, new GridConstraints(5, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        financeFurnitureAndEquipmentButton = new JButton();
        financeFurnitureAndEquipmentButton.setBackground(new Color(-12816512));
        financeFurnitureAndEquipmentButton.setForeground(new Color(-1));
        financeFurnitureAndEquipmentButton.setText("Finance furniture and equipment");
        Navigation.add(financeFurnitureAndEquipmentButton, new GridConstraints(7, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        financeFlatButton = new JButton();
        financeFlatButton.setBackground(new Color(-12816512));
        financeFlatButton.setForeground(new Color(-1));
        financeFlatButton.setText("Finance flat");
        Navigation.add(financeFlatButton, new GridConstraints(9, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        roomMateButton = new JButton();
        roomMateButton.setBackground(new Color(-12816512));
        roomMateButton.setForeground(new Color(-1));
        roomMateButton.setText("Roommates");
        Navigation.add(roomMateButton, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer7 = new Spacer();
        Navigation.add(spacer7, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 5, false));
        final Spacer spacer8 = new Spacer();
        Navigation.add(spacer8, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 5, false));
        final Spacer spacer9 = new Spacer();
        Navigation.add(spacer9, new GridConstraints(0, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 35), new Dimension(-1, 35), new Dimension(-1, 35), 35, false));
        final Spacer spacer10 = new Spacer();
        Navigation.add(spacer10, new GridConstraints(10, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 35), new Dimension(-1, 35), new Dimension(-1, 35), 35, false));
        final Spacer spacer11 = new Spacer();
        Navigation.add(spacer11, new GridConstraints(8, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 20), new Dimension(-1, 20), new Dimension(-1, 20), 20, false));
        final Spacer spacer12 = new Spacer();
        Navigation.add(spacer12, new GridConstraints(6, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 20), new Dimension(-1, 20), new Dimension(-1, 20), 20, false));
        final Spacer spacer13 = new Spacer();
        Navigation.add(spacer13, new GridConstraints(4, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 20), new Dimension(-1, 20), new Dimension(-1, 20), 20, false));
        final Spacer spacer14 = new Spacer();
        Navigation.add(spacer14, new GridConstraints(2, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 20), new Dimension(-1, 20), new Dimension(-1, 20), 20, false));
        selectFlatButton = new JButton();
        selectFlatButton.setText("Select flat");
        Navigation.add(selectFlatButton, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }

}

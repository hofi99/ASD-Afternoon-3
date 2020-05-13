package at.tugraz.asdafternoon3.ui;

import at.tugraz.asdafternoon3.FlatApplication;
import at.tugraz.asdafternoon3.data.Flat;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CleaningScheduleUI {
    private JPanel contentPane;
    private JPanel mainPenal;
    private JPanel headerPain;
    private JButton btBack;
    private JTable tCleaningSchedule;
    private JTextField tfName;
    private JTextField tfStart;
    private JTextField tfMarkable;
    private JTextField tfRoommate;
    private JButton btEdit;
    private JButton btAdd;
    private JButton btDelete;
    private JComboBox cbIntervall;
    private JButton exportButton;
    private Flat currentFlat;


    public CleaningScheduleUI(Flat flat) {

        currentFlat = flat;

        try {
            //TODO check how i get data
            //CleaningScheduleTableModel model = new CleaningScheduleTableModel(DatabaseConnection.getInstance().createDao(CleaningScheduleDAO.class, flat).getAll());
            //tCleaningSchedule.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }

        btEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CleaningScheduleDialog dialog = new CleaningScheduleDialog();
                dialog.setSize(300, 300);
                dialog.setVisible(true);
            }
        });
        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //addCleaningScheduleEntry();
            }
        });
        btDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //deleteCleaningScheduleEntry();
            }
        });

        btBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FlatApplication.get().setContentPane(new FlatOverview(currentFlat).getContentPane());
            }
        });
        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FlatApplication.get().setContentPane(new CleaningScheduleExportView(currentFlat).getContentPane());
            }
        });
    }

    public JPanel getContentPane() {
        return contentPane;
    }
/*
    void addCleaningScheduleEntry() {

        try {
            CleaningScheduleEntry newCleaningEntry = new CleaningScheduleEntry(...);
            CleaningScheduleDAO creator = DatabaseConnection.getInstance().createDao(CleaningScheduleDAO.class);

            if (!creator.validate(newCleaningEntry)) {
                JOptionPane.showMessageDialog(contentPane, "Cleaning task data is not valid");
            } else {
                newCleaningEntry = creator.create(newCleaningEntry);
                ((CleaningScheduleTableModel) tCleaningSchedule.getModel()).addCleaningEntry(newCleaningEntry);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(contentPane, "Could not create cleaning task");
        }
    }

    void deleteCleaningScheduleEntry() {}

        try {
            int selectedRow = tCleaningSchedule.getSelectedRow();
            CleaningScheduleEntry selectedCleaningEntry = ((CleaningScheduleTableModel) tCleaningSchedule.getModel()).getElement(selectedRow);

            CleaningScheduleDAO creator = DatabaseConnection.getInstance().createDao(CleaningScheduleDAO.class);
            creator.delete(selectedCleaningEntry);
            ((CleaningScheduleTableModel) tCleaningSchedule.getModel()).removeFlat(selectedRow);
            ((CleaningScheduleTableModel) tCleaningSchedule.getModel()).fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(contentPane, "Could not delete Cleaning task " + e.getMessage());
        }
    }

    void editCleaningScheduleEntry() {

    }*/

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
        contentPane.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPenal = new JPanel();
        mainPenal.setLayout(new BorderLayout(0, 0));
        contentPane.add(mainPenal, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        tCleaningSchedule = new JTable();
        mainPenal.add(tCleaningSchedule, BorderLayout.CENTER);
        headerPain = new JPanel();
        headerPain.setLayout(new BorderLayout(0, 0));
        contentPane.add(headerPain, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btBack = new JButton();
        btBack.setText("Back");
        headerPain.add(btBack, BorderLayout.WEST);
        final JLabel label1 = new JLabel();
        label1.setText("Cleaning schedule");
        headerPain.add(label1, BorderLayout.CENTER);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(5, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Name");
        panel2.add(label2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        tfName = new JTextField();
        panel2.add(tfName, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        tfStart = new JTextField();
        panel2.add(tfStart, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Intervall");
        panel2.add(label3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Start");
        panel2.add(label4, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Status");
        panel2.add(label5, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        tfMarkable = new JTextField();
        panel2.add(tfMarkable, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Person");
        panel2.add(label6, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        tfRoommate = new JTextField();
        panel2.add(tfRoommate, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        cbIntervall = new JComboBox();
        panel2.add(cbIntervall, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btEdit = new JButton();
        btEdit.setText("Edit");
        panel3.add(btEdit, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        btAdd = new JButton();
        btAdd.setText("Add");
        panel3.add(btAdd, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        btDelete = new JButton();
        btDelete.setText("Delete");
        panel3.add(btDelete, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        exportButton = new JButton();
        exportButton.setText("Export");
        panel3.add(exportButton, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }

}
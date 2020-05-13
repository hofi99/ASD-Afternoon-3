package at.tugraz.asdafternoon3.ui;

import at.tugraz.asdafternoon3.FlatApplication;
import at.tugraz.asdafternoon3.data.CleaningSchedule;
import at.tugraz.asdafternoon3.data.Flat;
import at.tugraz.asdafternoon3.data.Roommate;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CleaningScheduleUI {
    private JPanel contentPane;
    private JPanel mainPenal;
    private JPanel headerPain;
    private JButton btBack;
    private JTable tCleaningSchedule;
    private JButton btEdit;
    private JButton btAdd;
    private JButton btDelete;
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
                //TODO: take original data
                LocalDate currentDate = LocalDate.now();
                LocalTime currentTime = LocalTime.now();
                LocalDateTime currentDateAndTime = LocalDateTime.of(currentDate, currentTime);
                Flat testflat = new Flat("ChaosWG", 22, "Ragnitzstraße 102");
                Roommate testmate = new Roommate("Mark Weizenberg", 23, testflat);
                CleaningSchedule cleaning_schedule = new CleaningSchedule("Partykeller", currentDateAndTime, testmate);

                CleaningScheduleDialog dialog = new CleaningScheduleDialog(cleaning_schedule, true);
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
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btEdit = new JButton();
        btEdit.setText("Edit");
        panel2.add(btEdit, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        btAdd = new JButton();
        btAdd.setText("Add");
        panel2.add(btAdd, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        btDelete = new JButton();
        btDelete.setText("Delete");
        panel2.add(btDelete, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }

}

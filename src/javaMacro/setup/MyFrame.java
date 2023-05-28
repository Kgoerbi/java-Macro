package javaMacro.setup;

import javaMacro.macros.skyblock.Skyblock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class MyFrame extends JFrame implements ActionListener {
    String[] templates = {"Wheat", "Carrots", "Potato", "Cocoa Beans", "Melon", "Pumpkin", "Cactus", "Netherwards", "Sugar Cane"};
    public boolean stopRequested = false;
    Skyblock crops = new Skyblock();


    JComboBox cbChooseTemplate;
    JLabel lNumberOfRows;
    JLabel lNumberOfFields;
    JLabel lTimeRowForwards;
    JLabel lTimeRowBackwards;
    JLabel lRecommendedSpeed;
    JTextField tfNumberOfRows;
    JTextField tfNumberOfFields;
    JTextField tfTimeRowForwards;
    JTextField tfTimeRowBackwards;
    JButton bStart;
    JButton bStop;

    public MyFrame(String title) {
        this.setTitle(title);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 800);
        this.getContentPane().setBackground(Color.lightGray);

        //CHOOSE TEMPLATES COMBO-BOX
        cbChooseTemplate = new JComboBox(templates);
        cbChooseTemplate.addActionListener(this);
        this.add(cbChooseTemplate);
        cbChooseTemplate.setBounds(200, 50, 200, 70);

        //NUMBER OF ROWS- LABEL
        lNumberOfRows = new JLabel();
        lNumberOfRows.setText("Number of Rows:");
        lNumberOfRows.setBounds(125, 130, 200, 30);
        this.add(lNumberOfRows);

        //NUMBER OF FIELDS- LABEL
        lNumberOfFields = new JLabel();
        lNumberOfFields.setText("Number of Fields:");
        lNumberOfFields.setBounds(125, 180, 200, 30);
        this.add(lNumberOfFields);

        //TIME PER ROW FORWARD- LABEL
        lTimeRowForwards = new JLabel();
        lTimeRowForwards.setBounds(125, 230, 250, 30);
        this.add(lTimeRowForwards);

        //TIME PER ROW BACKWARDS- LABEL
        lTimeRowBackwards = new JLabel();
        lTimeRowBackwards.setBounds(125, 280, 250, 30);
        this.add(lTimeRowBackwards);

        //RECOMMENDED SPEED- LABEL
        lRecommendedSpeed = new JLabel();
        lRecommendedSpeed.setBounds(125, 320, 200, 30);
        this.add(lRecommendedSpeed);

        //NUMBER OF ROWS- TEXTFIELD
        tfNumberOfRows = new JTextField();
        tfNumberOfRows.addActionListener(this);
        tfNumberOfRows.setBounds(375, 130, 100, 30);
        this.add(tfNumberOfRows);

        //NUMBER OF FIELDS- TEXTFIELD
        tfNumberOfFields = new JTextField();
        tfNumberOfFields.addActionListener(this);
        tfNumberOfFields.setBounds(375, 180, 100, 30);
        this.add(tfNumberOfFields);

        //TIME PER ROW FORWARD- TEXTFIELD
        tfTimeRowForwards = new JTextField();
        tfTimeRowForwards.addActionListener(this);
        tfTimeRowForwards.setBounds(375, 230, 100, 30);
        this.add(tfTimeRowForwards);

        //TIME PER ROW BACKWARDS- TEXTFIELD
        tfTimeRowBackwards = new JTextField();
        tfTimeRowBackwards.addActionListener(this);
        tfTimeRowBackwards.setBounds(375, 280, 100, 30);
        this.add(tfTimeRowBackwards);

        //START-BUTTON
        bStart = new JButton("Start");
        bStart.addActionListener(this);
        bStart.setBounds(75, 400, 200, 70);
        this.add(bStart);

        //START-BUTTON
        bStop = new JButton("Stop");
        bStop.addActionListener(this);
        bStop.setBounds(325, 400, 200, 70);
        this.add(bStop);

        //fixed start screen
        lTimeRowForwards.setText("Time per row(in sec):");
        lTimeRowForwards.setVisible(true);
        lTimeRowBackwards.setVisible(false);
        tfTimeRowBackwards.setVisible(false);
        lRecommendedSpeed.setText("Recommend Speed: 115");
        lRecommendedSpeed.setVisible(true);

        this.setLayout(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == cbChooseTemplate) {
            checkForTemplate();
        } else if (event.getSource() == bStart && !stopRequested) {
            System.out.println("test1");

            executeTemplate();

            System.out.println("test5");
        }
        if (event.getSource() == bStop) {
            crops.stop();
        }
    }

    public void checkForTemplate() {
        if (cbChooseTemplate.getSelectedItem() == templates[0]                  //Crops
                || cbChooseTemplate.getSelectedItem() == templates[1]
                || cbChooseTemplate.getSelectedItem() == templates[2]) {
            lTimeRowForwards.setText("Time per row(in sec):");
            lTimeRowForwards.setVisible(true);
            lTimeRowBackwards.setVisible(false);
            tfTimeRowBackwards.setVisible(false);
            lRecommendedSpeed.setText("Recommend Speed: 115");
            lRecommendedSpeed.setVisible(true);
        } else if (cbChooseTemplate.getSelectedItem() == templates[3]) {          //Cocoa Beans
            lTimeRowForwards.setText("Time per row forwards(in sec):");
            lTimeRowForwards.setVisible(true);
            lTimeRowBackwards.setText("Time per row backwards(in sec):");
            lTimeRowBackwards.setVisible(true);
            tfTimeRowBackwards.setVisible(true);
        } else if (cbChooseTemplate.getSelectedItem() == templates[4]             //Melon
                || cbChooseTemplate.getSelectedItem() == templates[5]) {        //Pumpkin
            lTimeRowForwards.setText("Time per row forwards(in sec):");
            lTimeRowForwards.setVisible(true);
            lTimeRowBackwards.setText("Time per row backwards(in sec):");
            lTimeRowBackwards.setVisible(true);
            tfTimeRowBackwards.setVisible(true);
        } else if (cbChooseTemplate.getSelectedItem() == templates[6]) {          //Cactus
            lTimeRowForwards.setText("Time per row forwards(in sec):");
            lTimeRowForwards.setVisible(true);
            lTimeRowBackwards.setText("Time per row backwards(in sec):");
            lTimeRowBackwards.setVisible(true);
            tfTimeRowBackwards.setVisible(true);
        } else if (cbChooseTemplate.getSelectedItem() == templates[7]) {          //Netherward
            lTimeRowForwards.setText("Time per row forwards(in sec):");
            lTimeRowForwards.setVisible(true);
            lTimeRowBackwards.setText("Time per row backwards(in sec):");
            lTimeRowBackwards.setVisible(true);
            tfTimeRowBackwards.setVisible(true);
        } else if (cbChooseTemplate.getSelectedItem() == templates[8]) {          //Sugar Cane
            lTimeRowForwards.setText("Time per row forwards(in sec):");
            lTimeRowForwards.setVisible(true);
            lTimeRowBackwards.setText("Time per row backwards(in sec):");
            lTimeRowBackwards.setVisible(true);
            tfTimeRowBackwards.setVisible(true);
        }
    }

    public void executeTemplate() {
        String textFieldValue1 = tfNumberOfRows.getText();
        textFieldValue1 = textFieldValue1.replaceAll("[^0-9]", "");
        int numberRows = parseInt(textFieldValue1);

        String textFieldValue2 = tfNumberOfFields.getText();
        textFieldValue2 = textFieldValue1.replaceAll("[^0-9]", "");
        int numberFields = parseInt(textFieldValue2);

        String textFieldValue3 = tfTimeRowForwards.getText();
        textFieldValue3 = textFieldValue3.replaceAll("[^0-9]", "");
        int timeForwards = parseInt(textFieldValue3);
        timeForwards *= 1000;
        /*
        String textFieldValue4 = tfTimeRowBackwards.getText();
        textFieldValue4 = textFieldValue4.replaceAll("[^0-9]", "");
        int timeBackwards = Integer.parseInt(textFieldValue4);
        timeBackwards *= 1000;
         */
        System.out.println("test2");


        try {
            if (!stopRequested && cbChooseTemplate.getSelectedItem() == templates[0]                  //Crops
                    || cbChooseTemplate.getSelectedItem() == templates[1]
                    || cbChooseTemplate.getSelectedItem() == templates[2]
                    || cbChooseTemplate.getSelectedItem() == templates[7]) {
                System.out.println("test3");
                //Skyblock.farmCrops(numberRows, numberFields, timeForwards);

                crops.rowsPerField = numberRows;
                crops.fields = numberFields;
                crops.timeRow = timeForwards;
                crops.start();

                System.out.println("test7");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
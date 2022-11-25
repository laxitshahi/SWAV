package project.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.*;
import javax.swing.border.Border;


public class MainUI extends JFrame implements ActionListener {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    private static final MainUI mainUI = new MainUI();

    //All Options
    String[] countries = {"-Select Country-", "GLOBAL", "USA", "CANADA", "BRAZIL", "GERMANY", "SPAIN", "FRANCE"};
    String[] analysisType = {"-Selct Analysis-", "AC02GDPRatio", "AForestAgricultureAreaComp", "AForestAreaAvg", "AHealthAccessMortRateComp" };
    JComboBox<String> selectCountry = new JComboBox<>(countries);
    JComboBox<String> selectAnalysis = new JComboBox<>(analysisType);
    final static int CURRENT_YEAR = 2022;
    JComboBox<String> startYear = new JComboBox<>();
    JComboBox<String> endYear = new JComboBox<>();


    JRadioButton piRadio = new JRadioButton("Pi");
    JRadioButton lineRadio = new JRadioButton("Line");
    JRadioButton barRadio = new JRadioButton("Bar");

    JButton submit = new JButton();
    JButton reset = new JButton() ;


    private MainUI() {
        //Add Years to Start and End Years
        startYear.addItem("-Select Year-");
        endYear.addItem("-Select Year-");
        for (Integer year = 1980; year <= CURRENT_YEAR; ++year) {
            startYear.addItem(String.valueOf(year));
            endYear.addItem(String.valueOf(year));
        }

        //Frame settings
        ImageIcon image = new ImageIcon("./project/src/main/resources/swav.png");
        Border border = BorderFactory.createLineBorder(Color.black,3);

        /*
         * Left Panel Container
         */
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(0x1D1D77));
        leftPanel.setBounds(0,0,400,dimension.height);
        leftPanel.setLayout(new GridLayout(10,4));
        leftPanel.setBorder(border);
        add(leftPanel);

        /*
        * @Country Select
        */
        JLabel country = new JLabel("Select Country:");
        country.setForeground(Color.white);
        leftPanel.add(country);
        //Combobox settings
        selectCountry.setSelectedIndex(0);
        selectCountry.addActionListener(this);
        leftPanel.add(selectCountry);
        selectCountry.setBounds(10,0,10,10);

        /*
         * @Analysis Select
         */
        JLabel analysis = new JLabel("Select Analysis:");
        analysis.setForeground(Color.white);
        leftPanel.add(analysis);
        //Combobox settings
        selectAnalysis.setSelectedIndex(0);
        selectAnalysis.addActionListener(this);
        leftPanel.add(selectAnalysis);

        /*
         * @Date Select
         */
        //Start
        JLabel startDateLabel= new JLabel("Select Start Year:");
        startDateLabel.setForeground(Color.white);
        leftPanel.add(startDateLabel);
        //Textbox settings
        leftPanel.add(startYear);

        //End
        JLabel endDateLabel = new JLabel("Select End Year:");
        endDateLabel.setForeground(Color.white);
        leftPanel.add(endDateLabel);
        //Textbox settings
        leftPanel.add(endYear);

        /*
         * @Views
         */
        JLabel viewType = new JLabel("Select Chart Types:");
        viewType.setForeground(Color.white);
        leftPanel.add(viewType);
        //radiobutton settings
        //Flowbox for radio buttons
        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(new Color(0x1D1D77));
        radioPanel.setBounds(0,0,400,200);
        radioPanel.setLayout(new GridLayout());

        piRadio.setForeground(Color.white);
        lineRadio.setForeground(Color.white);
        barRadio.setForeground(Color.white);
        radioPanel.add(piRadio);
        radioPanel.add(barRadio);
        radioPanel.add(lineRadio);
        leftPanel.add(radioPanel);


        /*
         * @Submit and Reset Buttons
         */
        submit.setText("SUMBIT");
        leftPanel.add(submit);
        submit.addActionListener(this);

        reset.setText("RESET");
        leftPanel.add(reset);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); //absolute positioning
        setSize(dimension);
        setVisible(true);
    }


    public static MainUI getInstance() {
        return mainUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Handle Country
        if (e.getSource() == selectCountry){
            JComboBox cb = (JComboBox)e.getSource();
            String selection = (String)cb.getSelectedItem();
            System.out.println(selection);
        }

        //Handle Analysis
        if (e.getSource() == selectAnalysis){
            JComboBox cb = (JComboBox)e.getSource();
            String selection = (String)cb.getSelectedItem();
            System.out.println(selection);
        }

        //Handle StartDate
        if(e.getSource() == submit){
            //Get Values of all inputs
            String currCountry = Objects.requireNonNull(selectCountry.getSelectedItem()).toString();
            String currAnalysis = Objects.requireNonNull(selectAnalysis.getSelectedItem()).toString();
            String start =  Objects.requireNonNull(startYear.getSelectedItem()).toString();
            String end =  Objects.requireNonNull(endYear.getSelectedItem()).toString();
            boolean isPi = piRadio.isSelected();
            boolean isBar = barRadio.isSelected();
            boolean isLine= lineRadio.isSelected();

            System.out.println("Submitted");
            System.out.println("Selected Country: " + currCountry);
            System.out.println("Selected Analysis: " + currAnalysis);
            System.out.println("Start Year: " + start);
            System.out.println("End Year: " + end);
            System.out.println("Pi is Selected: " + isPi);
            System.out.println("Bar is Selected: " + isBar);
            System.out.println("Line is Selected: " + isLine);
        }

        //Reset all options on click
        if(e.getSource() == reset){
            selectCountry.setSelectedItem(countries[0]);
            selectAnalysis.setSelectedItem(analysisType[0]);
            startYear.setSelectedItem("-Select Year-");
            endYear.setSelectedItem("-Select Year-");
            piRadio.setSelected(false);
            barRadio.setSelected(false);
            lineRadio.setSelected(false);
        }

    }
}
//        JLabel welcomeNote = new JLabel("Welcome to SWAV!"); //You can directly initialize
//        welcomeNote.setIcon(image);
//        welcomeNote.setHorizontalTextPosition(JLabel.CENTER);
//        welcomeNote.setVerticalTextPosition(JLabel.TOP);
//        add(welcomeNote);
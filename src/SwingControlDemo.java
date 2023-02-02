import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo implements ActionListener {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta;
    private int WIDTH=800;
    private int HEIGHT=700;
    // second frame
    private JFrame secondFrame;
    private JLabel topLabel;
    private JMenuBar menus;
    private JPanel pan;
    private JMenu study, code, other;
    private JMenuItem chomp, swing;
    private JTextArea typebox;
    private int W=500;
    private int H=300;
    // problem a
    private JFrame problemA;
    private int Wa=500;
    private int Ha=300;
    // problem b
    private JFrame problemB;
    private int Wb=500;
    private int Hb=300;
    //problem c
    private JFrame problemC;
    private int Wc=500;
    private int Hc=300;
    //problem d
    private JFrame problemD;
    private int Wd=500;
    private int Hd=300;
    //problem e
    private JFrame problemE;
    private int We=500;
    private int He=300;


    public SwingControlDemo() {
      //  prepareGUI();
      // prepareGUI2();
      //prepareGUI3();
      //prepareGUI4();
      prepareGUI5();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
     //   swingControlDemo.showEventDemo();
        //swingControlDemo.showEventDemo2();
       // swingControlDemo.showEventDemo3();
        //swingControlDemo.showEventDemo4();
        swingControlDemo.showEventDemo5();
    }
    private void prepareGUI5(){
            problemE=new JFrame("problem E");
            problemE.setSize(We,He);
            problemE.setLayout(new GridLayout(1,2));
            problemE.setVisible(true);
    }
    private void showEventDemo5(){
        JPanel eLeft = new JPanel();
        eLeft.setLayout(new GridLayout(3,3));
        JPanel eRight = new JPanel();
        eRight.setLayout(new GridLayout(2,1));
        JLabel eZero= new JLabel("zero");
        JLabel eZeroA= new JLabel("zero");
        JLabel eZeroB= new JLabel("zero");
        JLabel eZeroC= new JLabel("zero");
        JLabel eZeroD= new JLabel("zero");
        JButton eOne= new JButton("one");
        JButton eTwo= new JButton("two");
        JButton eThree= new JButton("three");
        JButton eFour= new JButton("four");
        JButton eTopRight=new JButton("top right");
        eLeft.add(eOne);
        eLeft.add(eZeroA);
        eLeft.add(eTwo);
        eLeft.add(eZeroB);
        eLeft.add(eThree);
        eLeft.add(eZeroC);
        eLeft.add(eFour);
        eLeft.add(eZeroD);
        eRight.add(eTopRight);
        eRight.add(eOne);
        problemE.add(eLeft);
        problemE.add(eRight);
        problemE.setVisible(true);
    }
    private void prepareGUI4(){
        problemD=new JFrame("problem D");
        problemD.setSize(Wd,Hd);
        problemD.setLayout(new GridLayout(3,3));
        problemD.setVisible(true);
    }
    private void showEventDemo4(){
     JButton oneDButton= new JButton("one");
        JButton twoDButton= new JButton("two");
        JButton threeDButton= new JButton("three");
        JButton fourDButton= new JButton("four");
        JPanel centerD= new JPanel();
        centerD.setLayout(new BorderLayout());
        JLabel oneDlabel= new JLabel("label 1");
       JButton sevenCDButton= new JButton("SEVEN");
        JButton eightCDButton= new JButton("EIGHT");
        centerD.add(oneDlabel, BorderLayout.WEST);
        centerD.add(sevenCDButton, BorderLayout.SOUTH);
        centerD.add(eightCDButton, BorderLayout.EAST);
        JButton fiveDButton= new JButton("five");
        JButton sixDButton= new JButton("six");
        JButton sevenDButton= new JButton("seven");
        JButton eightDButton= new JButton("eight");

        problemD.add(oneDButton);
        problemD.add(twoDButton);
        problemD.add(threeDButton);
        problemD.add(fourDButton);
        problemD.add(centerD);
        problemD.add(fiveDButton);
        problemD.add(sixDButton);
        problemD.add(sevenDButton);
        problemD.add(eightDButton);
        problemD.setVisible(true);
    }
    private void prepareGUI3(){
// put grid on panel and panel in center
        problemC=new JFrame("problem C");
        problemC.setSize(Wc,Hc);
        problemC.setLayout(new BorderLayout());
        problemC.setVisible(true);
    }
    private void showEventDemo3(){
        JPanel centerC = new JPanel();
        centerC.setLayout(new GridLayout(2,3));
        JButton oneCButton = new JButton("1");
        JButton twoCButton = new JButton("2");
        JButton threeCButton = new JButton("3");
        JButton fourCButton = new JButton("4");
        JButton fiveCButton = new JButton("5");
        JLabel oneCLabel = new JLabel("label 1");
        JLabel twoCLabel = new JLabel("label 2");

        centerC.add(oneCButton);
        centerC.add(oneCLabel);
        centerC.add(twoCButton);
        centerC.add(twoCLabel);
        centerC.add(threeCButton);
        problemC.add(fourCButton,BorderLayout.NORTH);
        problemC.add(fiveCButton,BorderLayout.SOUTH);
        problemC.add(centerC, BorderLayout.CENTER);
        problemC.setVisible(true);

    }

    private void prepareGUI2(){
        problemB=new JFrame("problem B");
        problemB.setSize(Wa,Ha);
        problemB.setLayout(new BorderLayout());
        problemB.setVisible(true);
    }
    private void showEventDemo2() {
        JButton oneBButton = new JButton("1");
        JButton twoBButton = new JButton("2");
        JButton threeBButton = new JButton("3");
        JButton fourBButton = new JButton("4");
        JButton fiveBButton = new JButton("5");

        problemB.add(oneBButton, BorderLayout.NORTH);
        problemB.add(twoBButton, BorderLayout.EAST);
        problemB.add(threeBButton, BorderLayout.SOUTH);
        problemB.add(fourBButton, BorderLayout.WEST);
        problemB.add(fiveBButton, BorderLayout.CENTER);
        problemB.setVisible(true);

    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3, 1));
//2nd
        secondFrame=new JFrame("SWING trial");
        secondFrame.setSize(W,H);
        secondFrame.setLayout(new FlowLayout());
//problem a
        problemA=new JFrame("problem A");
        problemA.setSize(Wa,Ha);
        problemA.setLayout(new GridLayout(2, 3));

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
//2nd
        chomp = new JMenuItem("chomp");
        swing = new JMenuItem("swing");

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
//2nd
    menus= new JMenuBar();
    study = new JMenu("Study");
    code = new JMenu("Code");
    other = new JMenu("Other");


        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        mainFrame.add(mb);
        mainFrame.add(ta);
        mainFrame.setJMenuBar(mb);
//2nd
    typebox = new JTextArea("poej");
    typebox.setBounds(50,5,10,10);
    secondFrame.add(menus);
    secondFrame.add(typebox);
    secondFrame.setJMenuBar(menus);

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

       // mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
 //2nd
        pan= new JPanel();
        pan.setLayout(new FlowLayout());
       // secondFrame.add(pan);
        secondFrame.setVisible(true);
    }

    private void showEventDemo() {
        headerLabel.setText("Control in action: Button");

        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
        // problem a
        JButton oneAButton = new JButton("1");
        JButton twoAButton = new JButton("2");
        JButton threeAButton = new JButton("3");
        JButton fourAButton = new JButton("4");
        JButton fiveAButton = new JButton("5");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);
        // problem a
        problemA.add(oneAButton);
        problemA.add(twoAButton);
        problemA.add(threeAButton);
        problemA.add(fourAButton);
        problemA.add(fiveAButton);

        mainFrame.setVisible(true);
        secondFrame.setVisible(true);
        problemA.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}
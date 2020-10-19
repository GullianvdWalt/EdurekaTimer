import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
  Gullian Van Der Walt - H5G8YT7X3
  Pearson Pretoria
  BSC IT Level 3 2020
  ITJA321 - Take Home Assessment Question 3

 */

public class EdurekaTimerMain extends JFrame implements ActionListener {

  // Create GUI Components
  private JLabel label;
  private JButton startBtn;
  private JButton stopBtn;
  private JTextField txtField;
  private JFrame frame;


  public EdurekaTimerMain() throws HeadlessException {

    // Initialize GUI Components
    label = new JLabel("Time (in seconds)");
    startBtn = new JButton("Start Time");
    stopBtn = new JButton("Stop Time");
    txtField = new JTextField();
    // Make text field uneditable
    txtField.setEditable(false);

    // Add Components to frame
    add(label);
    add(txtField);
    add(startBtn);
    add(stopBtn);

    // Create Layout
    GridLayout gridLayout = new GridLayout(2,0);

    this.setLayout(gridLayout);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setSize(500,250);
    this.setTitle("Edureka Timer");

  }

  public static void main(String[] args){




  }



  @Override
  public void actionPerformed(ActionEvent e) {

  }
}

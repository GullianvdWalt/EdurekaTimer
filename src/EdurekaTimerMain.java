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
  public static JLabel label;
  public static JButton startBtn;
  public static JButton stopBtn;
  public static JTextField txtField;
  public static JPanel panel1;
  public static JPanel panel2;

  public static Thread thread;

  public boolean suspended = true;

  public int i = 0;

  public EdurekaTimerMain() throws HeadlessException {

    // Initialize GUI Components
    label = new JLabel("Time (in seconds)");
    startBtn = new JButton("Start Time");
    stopBtn = new JButton("Stop Time");
    txtField = new JTextField();
    panel1 = new JPanel();
    panel2 = new JPanel();
    // Make text field uneditable
    txtField.setEditable(false);
    txtField.setColumns(15);

    startBtn.addActionListener(this);
    stopBtn.addActionListener(this);

    // Set Layouts for panels
    panel1.setLayout(new FlowLayout());
    panel2.setLayout(new FlowLayout());

    // Add components to panels
    panel1.add(label);
    panel1.add(txtField);
    panel2.add(startBtn);
    panel2.add(stopBtn);
    // Set JFrame layout
    this.setLayout(new GridLayout(2,1));

    //this.setLayout(gridLayout);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setSize(500,150);
    this.setTitle("Edureka Timer");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Add panels to frame
    this.add(panel1);
    this.add(panel2);

  }




  public static void main(String[] args){
    EdurekaTimerMain edurekaTimerMain = new EdurekaTimerMain();

  }

  public void suspend(){
    suspended = true;

  }


  @Override
  public void actionPerformed(ActionEvent e) {

    // Start Button
    if(e.getSource() == startBtn){
      thread = new Thread(new Runnable() {
        @Override
        public void run() {
          while (true){
            try{
              Thread.sleep(1000);
              txtField.setText(String.valueOf(i));
              i++;
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
          }
        }
      });
      thread.start();

    }

    // Stop Button
    if(e.getSource() == stopBtn){
      thread.suspend();

    }
  }

}

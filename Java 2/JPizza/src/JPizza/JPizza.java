package JPizza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener
{
  FlowLayout flow = new FlowLayout();
  JLabel companyName = new JLabel("Pizza Chunk");
  JComboBox sizeBox = new JComboBox();
  JLabel sizeList = new JLabel("Size");
  JComboBox toppingBox = new JComboBox();
  JLabel toppingList = new JLabel("Topping");
  JTextField totPrice = new JTextField(10);
  int totalPrice = 0;
  int sizeNum, toppingNum;
  int sPrice, tPrice, sumPrice;
  int[] sizePrice = {0,7,9,11,14};
  int[] toppingPrice = {0,0,1,1,1,1};
  String output;

  public JPizza()
  {
    super("Pizza Chunk");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pane = new JPanel();
    pane.setLayout(flow);
    sizeBox.addItem("None");
    sizeBox.addItem("Small");
    sizeBox.addItem("Medium");
    sizeBox.addItem("Large");
    sizeBox.addItem("Extra large");
    toppingBox.addItem("None");
    toppingBox.addItem("Cheese");
    toppingBox.addItem("Sausage");
    toppingBox.addItem("Pepperoni");
    toppingBox.addItem("Meatball");
    toppingBox.addItem("Pineapple");
    pane.add(sizeList);
    pane.add(sizeBox);
    sizeBox.addItemListener(this);
    pane.add(toppingList);
	pane.add(toppingBox);
    toppingBox.addItemListener(this);
    pane.add(companyName);
	pane.add(totPrice);
    setContentPane(pane);

  }
  public static void main(String[] arguments)
  {
    JPizza pframe = new JPizza();
  	pframe.setSize(250,200);
    pframe.setVisible(true);
  }

  public void itemStateChanged(ItemEvent list)
  {
      Object source = list.getSource();
      if (source == sizeBox)
      {
	   sizeNum = sizeBox.getSelectedIndex();
       sPrice = sizePrice[sizeNum];
       sumPrice = sPrice + tPrice;
       output = "Price $" + sumPrice;
       totPrice.setText(output);
	  }
	  else if (source == toppingBox)
	  {
	    toppingNum = toppingBox.getSelectedIndex();
	    tPrice = toppingPrice[toppingNum];
	    sumPrice = sPrice + tPrice;
	    output = "Price $" + sumPrice;
	    totPrice.setText(output);
	  }
  }
}
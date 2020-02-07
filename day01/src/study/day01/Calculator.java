package study.day01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	// 声明一个文本栏控件，用于显示计算结果
	private JTextField txtResult;
	private JPanel p;
	// 定义一个字符串数组，将计算器中按钮的文字都放在该数组中
	private String name[] = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2",
			"3", "*", "0", ".", "=", "/" ,"<_","C","%"," "};
	// 声明一个按钮数组，该数组的长度以字符串数组的长度为准
	private JButton button[] = new JButton[name.length];
	// 定义一个存放计算结果的变量，初始为0
	private double result = 0;
	// 存放最后一个操作符，初始为“=”
	private String lastCommand = "=";
	// 标识是否是开始
	private boolean start = true;

	public Calculator() {
		super("计算器");
		// 实例化文本栏控件
		txtResult = new JTextField(20);
		// 设置文本框不是焦点状态
		txtResult.setFocusable(false);
		// 将文本栏控件放置在窗体框架的上方（北部）
		this.add(txtResult, BorderLayout.NORTH);
		// 实例化面板对象，同时设置此面板布局为5行4列的网格布局
		p = new JPanel(new GridLayout(5, 4));
		// 循环实例化按钮对象数组
		// 实例化按钮监听对象
		ButtonAction ba = new ButtonAction();
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(name[i]);
			// 注册监听
			button[i].addActionListener(ba);
			p.add(button[i]);
		}

		this.add(p, BorderLayout.CENTER);
		// 设定窗口大小
		this.setSize(600, 600);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	// 计算
	public void calculate(double x) {
		if (lastCommand.equals("+"))
			result += x;
		else if (lastCommand.equals("-"))
			result -= x;
		else if (lastCommand.equals("*"))
			result *= x;
		else if (lastCommand.equals("/"))
			result /= x;
		else if (lastCommand.equals("="))
			result = x;
		else if (lastCommand.equals("%"))
			result %=x; 
		// 将结果显示在文本栏
		txtResult.setText("" + result);
	}

	// 点击按钮监听
	private class ButtonAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String input = e.getActionCommand();
			// 点击操作符号按钮
			if (input.equals("+") || input.equals("-") || input.equals("*")
					|| input.equals("/") || input.equals("=")|| input.equals("%")) {
				if (start) {
					if (input.equals("-")) {
						txtResult.setText(input);
						start = false;
					} else
						lastCommand = input;
				} else {
					calculate(Double.parseDouble(txtResult.getText()));
					lastCommand = input;
					start = true;
				}
			} 
			else if(input.equals("<_")) {
				txtResult.setText(txtResult.getText().substring(0,txtResult.getText().length()-1));
			}
			else if(input.equals("C")) {
				txtResult.setText("");
			}
			else {
				if (start) {
					txtResult.setText("");
					start = false;
				}
				txtResult.setText(txtResult.getText() + input);
			}
		}
	}

	

	public static void main(String[] args) {
		new Calculator();
	}
}

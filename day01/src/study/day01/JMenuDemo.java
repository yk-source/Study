package study.day01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JMenuDemo extends JFrame {
	private JPanel p;//声明面板
	private JMenuBar menuBar;//声明菜单栏
	private JMenu menuFile;//声明菜单
	private JMenuItem New,Save,Exit;//声明菜单项
	private JScrollPane sp;//声明文本域的滚动面板
	private JTextArea txtContent;//声明文本域
	public JMenuDemo() {
		super("记事本");
		p = new JPanel();
		menuBar = new JMenuBar();//创建菜单栏对象
		this.setJMenuBar(menuBar);//将菜单栏设置到窗体中
		menuFile = new JMenu("文件");//创建菜单
		txtContent = new JTextArea(20, 10);//创建文本域
		sp = new JScrollPane(txtContent);//创建加载文本域的滚动面板
		menuBar.add(menuFile);//将菜单添加到菜单栏
		//创建菜单选项
		New = new JMenuItem("打开");
		Save = new JMenuItem("保存");
		Exit = new JMenuItem("退出");
		//将菜单选项添加到菜单中
		menuFile.add(New);
		menuFile.add(Save);
		menuFile.add(Exit);
		//注册监听
		New.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtContent.setText("");
			}
		});
		this.add(p);
		this.add(sp);
		this.setSize(800, 500);
		this.setLocation(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//打开文件
	private void openFile() {
		//实例化一个文件对话框对象
		JFileChooser fc = new JFileChooser();
		//显示文件打开对话框
		int rVal = fc.showOpenDialog(this);
		//如果单击确定（Yes/No）
		if (rVal == JFileChooser.APPROVE_OPTION) {
			//获取文件对话框用户选中的文件名
			String fileName = fc.getSelectedFile().getName();
			//获取文件对话框用户选中的文件所在的路径
			String path = fc.getCurrentDirectory().toString();
			try {
				//创建一个文件输入流，用于读文件
				FileReader fread = new FileReader(path + "/" + fileName);
				//创建一个缓冲流
				BufferedReader bread = new BufferedReader(fread);
				//从文件中读一行信息
				String line = bread.readLine();
				//循环读文件中的内容，并显示到文本域中
				while (line != null) {
					txtContent.append(line + "\n");
					line = bread.readLine();
				}
				bread.close();
				fread.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//保存文件
	private void saveFile() {
		JFileChooser fc = new JFileChooser();
		int rVal = fc.showSaveDialog(this);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			String fileName = fc.getSelectedFile().getName();
			String path = fc.getCurrentDirectory().toString();
			try {
				//创建一个文件输出流，用于写文件
				FileWriter fwriter = new FileWriter(path + "/" + fileName);
				//将文本域中的信息写入文件中
				fwriter.write(txtContent.getText());
				fwriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new JMenuDemo();
	}
}

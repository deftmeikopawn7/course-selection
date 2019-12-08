
package com.pag_1;  
import java.io.*;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.FlowLayout;
public class MainUI extends JFrame implements ActionListener {  
	public static void main(String[] args) {  		 
        new MainUI();  
}
    //�������   
    JButton jb1,jb2,jb3=null;  
    JRadioButton jrb1,jrb2=null;  
    JPanel jp1,jp2,jp3,jp4=null;  
    JTextField jtf=null;  
    JLabel jlb1,jlb2,jlb3=null;  
    JPasswordField jpf=null;  
    ButtonGroup bg=null;  
	StringBuffer id = new StringBuffer();
	StringBuffer pa = new StringBuffer();

  
    public MainUI()  
    {  
         //�������  
        jb1=new JButton("��¼");  
        jb2=new JButton("����"); 
        jb3=new JButton("�˳�");
 
        //���ü���  
        jb1.addActionListener(this);  
        jb2.addActionListener(this);  
        jb3.addActionListener(this);  
 
        jrb1=new JRadioButton("��ʦ");  
        jrb2=new JRadioButton("ѧ��");  
        bg=new ButtonGroup();  
        bg.add(jrb1);  
        bg.add(jrb2);  
        jrb2.setSelected(true);  //��ʼҳ��Ĭ��ѡ��Ȩ��Ϊ ѧ��
 
        jp1=new JPanel();  
        jp2=new JPanel();  
        jp3=new JPanel();  
        jp4=new JPanel();    
        add(jp1);
        add(jp2);
        add(jp3);
        add(jp4);
 
        jlb1=new JLabel("�û�����");  
        jlb2=new JLabel("��    �룺");  
        jlb3=new JLabel("Ȩ    �ޣ�");  
 
        jtf=new JTextField(10);  
        jpf=new JPasswordField(10);  
        //���뵽JPanel��  
        jp1.add(jlb1);  
        jp1.add(jtf);  
 
        jp2.add(jlb2);  
        jp2.add(jpf);  
 
        jp3.add(jlb3);      //��ӱ�ǩ
        jp3.add(jrb1);  
        jp3.add(jrb2);  
 
        jp4.add(jb1);       //��Ӱ�ť
        jp4.add(jb2);  
        jp4.add(jb3);
 
        //����JFrame��  
        this.add(jp1);  
        this.add(jp2);  
        this.add(jp3);  
        this.add(jp4);  
 
        this.setLayout(new GridLayout(4,1));            //ѡ��GridLayout���ֹ�����        
        this.setTitle("��¼����");          
        this.setSize(600,400);         
        this.setLocation(400, 200);           
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //���õ��رմ���ʱ����֤JVMҲ�˳� 
        setVisible(true);  

    }  
 
    public void actionPerformed(ActionEvent e) {            //�¼��ж� 
        if(e.getActionCommand()=="��¼")  
        {  
            //���ѡ�н�ʦ��¼  
            if(jrb1.isSelected())  
            {  
                  tealogin();                               //���ӵ���ʦ�ķ��� ҳ��
            }else if(jrb2.isSelected()) //ѧ���ڵ�¼ϵͳ  
            {  
                  stulogin();                               //���ӵ�ѧ���ķ��� ҳ��
            }  
 
        }else if(e.getActionCommand()=="����")  
        {  
        		
                  clear();  
        }      
        else if(e.getActionCommand()=="�˳�") {
        		  dispose();
        }
    }  
 
    
     //ѧ����¼�жϷ���  
    public void stulogin()  
    {   	

    	try {
			FileReader reader = new FileReader("C:\\Users\\����\\Desktop\\StuInformation.txt");
			BufferedReader br = new BufferedReader(reader);
			String str = " ";		
			while ((str  = br.readLine()) != null) {
				String[] strinfor =str.split(" ");
	            if(strinfor[0].equals(jtf.getText())){
	                if(strinfor[1].equals(jpf.getText())){
			        JOptionPane.showMessageDialog(null,"��¼�ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);                           
		            StdUI ui=new StdUI();	
		            id.append(strinfor[0]);
		            pa.append(strinfor[1]);
		            break;
		            }					
				}else if(jtf.getText().isEmpty()&&jpf.getText().isEmpty())  
	        {  
	            JOptionPane.showMessageDialog(null,"�������û��������룡","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
	            break;
	          
	        	}else if(jtf.getText().isEmpty())  
	        {  
	            JOptionPane.showMessageDialog(null,"�������û�����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
	            break;
	            
	        	}else if(jpf.getText().isEmpty())  
	        {  
	            JOptionPane.showMessageDialog(null,"���������룡","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
	            break;
	        	}else
	        {  
	            JOptionPane.showMessageDialog(null,"�û��������������\n����������","��ʾ��Ϣ",JOptionPane.ERROR_MESSAGE);          
	            clear();
	            break;
	        } 
			}
			br.close();	
			reader.close();
			}catch(IOException e){
    		System.out.println(e);
    	}
    	
    }  
    //��ʦ��¼�жϷ���  
    public void tealogin()  
    {  
    	try {
    		FileReader reader = new FileReader("C:\\Users\\����\\Desktop\\TeaInformation.txt");
			BufferedReader br = new BufferedReader(reader);
			String str = " ";
			while ((str  = br.readLine()) != null) {
				String[] strinfor =str.split(" ");
	            if(strinfor[0].equals(jtf.getText())){
	                if(strinfor[1].equals(jpf.getText())){
			        JOptionPane.showMessageDialog(null,"��¼�ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);                 
		            clear();                        
        		    TerUI ui=new TerUI(); 
    	            break;
	                }
	                }if(jtf.getText().isEmpty()&&jpf.getText().isEmpty())  
        	{  
        		JOptionPane.showMessageDialog(null,"�������û��������룡","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
	            break;

        	}else if(jtf.getText().isEmpty())  
        	{  
        		JOptionPane.showMessageDialog(null,"�������û�����","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
	            break;

        	}else if(jpf.getText().isEmpty())  
        	{  
        		JOptionPane.showMessageDialog(null,"���������룡","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
	            break;

        	}else  
        	{  
        		JOptionPane.showMessageDialog(null,"�û��������������\n����������","��ʾ��Ϣ",JOptionPane.ERROR_MESSAGE);         		
        		clear();  //��������  
	            break;

        	}  
			}
        	reader.close();
        	br.close();
    	}catch(IOException e) {
    		System.out.println(e);
    	}
    }
    //����ı���������  
    public  void clear()  
    {  
        jtf.setText("");  
        jpf.setText("");

    }  

 
} 
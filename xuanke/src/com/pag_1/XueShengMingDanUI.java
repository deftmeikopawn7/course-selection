package com.pag_1;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
 
public class XueShengMingDanUI extends JFrame  
{  
 
    public XueShengMingDanUI()  
    {  
        intiComponent();  
    }  
 
     //��ʼ��������� 
    private void intiComponent()  
    {  
        // ����JTable������   
        String[] columnNames =  
        { "ѧ��","����",  "רҵ", "�༶"};  
        Object[][] obj=new Object[7][7];  
        for (int i=0;i<7;i++)  
        {  
            for(int j=0;j<7;j++)  
            {  
                switch (j)  
                {  
                case 0:  
                    obj[0][0] = "       2018311000";
                    obj[0][1] = "             ����"; 
                    obj[0][2] = "     ��Ϣ����ѧԺ"; 
                    obj[0][3] = "                    2";    
                    break;  
                case 1:  
                    obj[1][0] = "       2018310981";
                    obj[1][1] = "           ���ӿ�"; 
                    obj[1][2] = "     ��Ϣ����ѧԺ"; 
                    obj[1][3] = "                    2"; 
                    break;  
                case 2:  
                    obj[2][0] = "       2018310984";
                    obj[2][1] = "			��Ӣ��"; 
                    obj[2][2] = "     ��Ϣ����ѧԺ"; 
                    obj[2][3] = "                    2"; 
                    break;  
                case 3:  
                    obj[3][0] = "       2018310985";
                    obj[3][1] = "            ����"; 
                    obj[3][2] = "    ��Ϣ����ѧԺ"; 
                    obj[3][3] = "                    2";                  
                    break;  
                case 4:  
                    obj[4][0] = "       2018310982";
                    obj[4][1] = "            ����"; 
                    obj[4][2] = "    ͨ�Ź���ѧԺ"; 
                    obj[4][3] = "                    2"; 
                    break;  
                case 5:  
                    obj[5][0] = "       2018310986";
                    obj[5][1] = "            ����"; 
                    obj[5][2] = "    ͨ�Ź���ѧԺ"; 
                    obj[5][3] = "             2"; 
                    break;  
                case 6:  
                    obj[6][0] = "       2018310987";
                    obj[6][1] = "            ��"; 
                    obj[6][2] = "    ͨ�Ź���ѧԺ"; 
                    obj[6][3] = "                    2";                 
                    break;  
 
                }  
            }  
        }  
 
        JTable table=new JTable(obj, columnNames);  //JTable������һ�ֹ��췽�� 
        TableColumn column=null;                    //����JTable����Ĭ�ϵĿ�Ⱥ͸߶� 
        int colunms = table.getColumnCount();  
        for(int i=0;i<colunms;i++)  
        {  
            column = table.getColumnModel().getColumn(i);  
            column.setPreferredWidth(100);           //��ÿһ�е�Ĭ�Ͽ������Ϊ100
        }   
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //����JTable�Զ������б��״̬���˴�����Ϊ�ر�                 
        JScrollPane scroll = new JScrollPane(table);  //��JScrollPaneװ��JTable������������Χ���оͿ���ͨ�����������鿴 
        scroll.setSize(300, 50);         
 
        add(scroll); 
 
        this.setLocation(450, 200); 
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.pack();  
        
        try {        		                
        	FileWriter f= new FileWriter("C:\\Users\\����\\Desktop\\Tea_XueShengMingDan_infor_done.txt") ;	// ����File����

                for (int i = 0; i < columnNames.length; i++) {
                	for (int k=0;i<6;i++)  
                    {  
                        for(int j=0;j<3;j++)  
                        {  
                    f.write(columnNames[i] + "\n" + obj[k][j]);
                  }
    	     	 // ��4�����ر������
    	     	
            } 
                }f.close() ;
            }catch (IOException e1) {
                e1.printStackTrace();
            }
    }  
 
    public static void main(String[] args)  
    {  
        new XueShengMingDanUI();  
    }  
}  

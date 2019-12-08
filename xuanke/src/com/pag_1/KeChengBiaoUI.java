package com.pag_1;
 
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
 
public class KeChengBiaoUI extends JFrame  
{  
 
    public KeChengBiaoUI()  
    {  
        intiComponent();  
    }  
 
    private void intiComponent()  
    {        
        String[] columnNames =  
        { "�ν���","����һ", "���ڶ�", "������", "������", "������", "������","������" };  
 
        Object[][] obj=new Object[8][8];  
        for (int i=0;i<8;i++)  
        {  
            for(int j=0;j<8;j++)  
            {  
                switch (j)  
                {  
                case 0:  
                    obj[0][0] = "��һ�ڿ�";
                    obj[0][1] = "�ߵ���ѧ"; 
                    obj[0][2] = "��ѧ����"; 
                    obj[0][3] = "��·��ģ����Ӽ���"; 
                    obj[0][4] = "���Դ���"; 
                    obj[0][5] = " "; 
                    obj[0][6] = "Ӣ���д��"; 
                    obj[0][7] = " "; 
                    break;  
                case 1:  
                    obj[1][0] = "�ڶ��ڿ�";
                    obj[1][1] = "�ߵ���ѧ"; 
                    obj[1][2] = "Ӣ������˵"; 
                    obj[1][3] = "��ѧ����"; 
                    obj[1][4] = "Ӣ���д��"; 
                    obj[1][5] = " "; 
                    obj[1][6] = "���Դ���"; 
                    obj[1][7] = " ";  
                    break;  
                case 2:  
                    obj[2][0] = "�����ڿ�";
                    obj[2][1] = "java"; 
                    obj[2][2] = " "; 
                    obj[2][3] = " "; 
                    obj[2][4] = "��ѧ����ʵ��"; 
                    obj[2][5] = "���Դ���"; 
                    obj[2][6] = "Ӣ���д��"; 
                    obj[2][7] = " ";   
                    break;  
                case 3:  
                    obj[3][0] = "���Ľڿ�";
                    obj[3][1] = "java"; 
                    obj[3][2] = " "; 
                    obj[3][3] = " "; 
                    obj[3][4] = " "; 
                    obj[3][5] = "Ӣ������˵"; 
                    obj[3][6] = "�ߵ���ѧ"; 
                    obj[3][7] = "��ѧ����";   
                    break;  
                case 4:  
                    obj[4][0] = "����ڿ�";
                    obj[4][1] = "java"; 
                    obj[4][2] = " "; 
                    obj[4][3] = " "; 
                    obj[4][4] = " "; 
                    obj[4][5] = " "; 
                    obj[4][6] = " "; 
                    obj[4][7] = " ";  
                    break;  
                case 5:  
                    obj[5][0] = "�����ڿ�";
                    obj[5][1] = "java"; 
                    obj[5][2] = " "; 
                    obj[5][3] = " "; 
                    obj[5][4] = " "; 
                    obj[5][5] = " "; 
                    obj[5][6] = " "; 
                    obj[5][7] = " ";   
                    break;  
                case 6:  
                    obj[6][0] = "���߽ڿ�";
                    obj[6][1] = "java"; 
                    obj[6][2] = " "; 
                    obj[6][3] = " "; 
                    obj[6][4] = " "; 
                    obj[6][5] = " "; 
                    obj[6][6] = " "; 
                    obj[6][7] = " ";   
                    break;  
                case 7:  
                    obj[7][0] = "���߽ڿ�";
                    obj[7][1] = ""; 
                    obj[7][2] = " "; 
                    obj[7][3] = " "; 
                    obj[7][4] = " "; 
                    obj[7][5] = " "; 
                    obj[7][6] = " "; 
                    obj[7][7] = " ";   
                    break;  
                case 8:  
                    obj[8][0] = "�ڰ˽ڿ�";
                    obj[8][1] = " "; 
                    obj[8][2] = " "; 
                    obj[8][3] = " "; 
                    obj[8][4] = " "; 
                    obj[8][5] = " "; 
                    obj[8][6] = " "; 
                    obj[8][7] = " ";   
                    break;  
                }  
            }  
        }  
 
        JTable table=new JTable(obj, columnNames);        
        TableColumn column=null;  
        int colunms = table.getColumnCount();  
        for(int i=0;i<colunms;i++)  
        {  
            column = table.getColumnModel().getColumn(i);             
            column.setPreferredWidth(100);  
        }        
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);      
        JScrollPane scroll = new JScrollPane(table);  
        scroll.setSize(300, 50);  
 
        add(scroll); 
 
        this.setLocation(450, 200); 
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.pack();
        
        try {        		                
        	FileWriter f= new FileWriter("C:\\Users\\����\\Desktop\\Stu_KeChengBiao_infor_done.txt") ;	// ����File����

                for (int i = 0; i < columnNames.length; i++) {
                	for (int k=0;i<8;i++)  
                    {  
                        for(int j=0;j<8;j++)  
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
        new KeChengBiaoUI();  
    }  
}  

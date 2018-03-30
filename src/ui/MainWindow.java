package ui;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class MainWindow {

    
    public static void main(String[] args) {
        
        Login login = new Login();
        login.setExtendedState(login.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setVisible(true);
       
        /*
        JFrame form1 = new JFrame();
        JTable table = new JTable();
        
        Object [] columns = {"name","id","age"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setRowHeight(30);
        
        JTextField name = new JTextField();
        JTextField id = new JTextField();
        JTextField age = new JTextField();
        
        name.setBounds(25,200,100,25);
        id.setBounds(25,230,100,25);
        age.setBounds(25,260,100,25);

        JButton btnadd = new JButton("add"); 
        JButton btndelete = new JButton("delete");
        JButton btnupdate = new JButton("update");
        
        btnadd.setBounds(150, 200, 100, 25);
        btndelete.setBounds(150, 230, 100, 25);
        btnupdate.setBounds(150, 260, 100, 25);
        Object [] row =new Object[4];
        
        btnadd.addActionListener(new ActionListener (){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                
            }
 
    });
        
        
        
        JScrollPane pane = new JScrollPane(table);

        form1.add(name);
        form1.add(id);
        form1.add(age);
        form1.add(btnadd);
        form1.add(btndelete);
        form1.add(btnupdate);
        form1.add(pane);


        form1.setVisible(true);
        form1.setLocation(0,0);
        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form1.setSize(900,400);
        */
       
    }
    
}

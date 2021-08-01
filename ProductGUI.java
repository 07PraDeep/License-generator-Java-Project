
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ProductGUI implements ActionListener, KeyListener{
    
    JFrame frm;
    JLabel lblHeadingAdd, lblHeadingActivate, lblHeadingTerminate, lblHeadingPrice, lblProductNumber1,lblProductNumber2,lblProductNumber3,lblProductNumber4,lblProductName1,lblProductName2, lblTotalPrice, lblClientCompanyName, lblLicenseActivationDate, lblLicenseExpireDate, lblActivationKey, lblNumberOfUser, lblPricePerUser1,lblPricePerUser2;
    JTextField txtProductNumber1, txtProductNumber2, txtProductNumber3, txtProductNumber4, txtProductName1,txtProductName2, txtTotalPrice, txtClientCompanyName, txtLicenseActivationDate, txtLicenseExpireDate, txtActivationKey, txtNumberOfUser, txtPricePerUser1, txtPricePerUser2;
    
    JButton btnAddProduct, btnActivateLicenseForProduct, btnTerminateLicenseForProduct, btnSetProductPrice, btnDisplay, btnClear;
    
    JComboBox day,month,year;
    JComboBox day1, month1, year1;
    
    ArrayList<MicrosoftProduct> Table= new ArrayList<MicrosoftProduct>();
    
    public ProductGUI(){
        frm=new JFrame("Microsoft Product User's Form");//form heading
        frm.setSize(820,720);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
        frm.setLayout(null);
        
        //heading for add product
        lblHeadingAdd=new JLabel("Add product");
        lblHeadingAdd.setBounds(100,10,100,30);
        frm.add(lblHeadingAdd);
        
        //product number
        lblProductNumber1=new JLabel("Product Number:-");
        lblProductNumber1.setBounds(50,35,150,60);
        frm.add(lblProductNumber1);
        
        txtProductNumber1=new JTextField();
        txtProductNumber1.setBounds(170,50,150,25);
        frm.add(txtProductNumber1);
        
        //product name
        lblProductName1=new JLabel("Product Name:-");
        lblProductName1.setBounds(50,75,150,60);
        frm.add(lblProductName1);
        
        txtProductName1=new JTextField();
        txtProductName1.setBounds(170,90,150,25);
        frm.add(txtProductName1);
        
        //price per user 1
        lblPricePerUser1=new JLabel("Price Per User:-");
        lblPricePerUser1.setBounds(50,120,150,60);
        frm.add(lblPricePerUser1);
        
        txtPricePerUser1=new JTextField();
        txtPricePerUser1.setBounds(170,140,150,25);
        frm.add(txtPricePerUser1);
        
        
        
        //heading for license activation
        lblHeadingActivate=new JLabel("Activate License For Product");
        lblHeadingActivate.setBounds(100,240,300,40);
        frm.add(lblHeadingActivate);
        
        //product number 2 for second topic
        lblProductNumber2=new JLabel("Product Number:-");
        lblProductNumber2.setBounds(50,280,150,60);
        frm.add(lblProductNumber2);
        
        txtProductNumber2=new JTextField();
        txtProductNumber2.setBounds(170,300,150,25);
        frm.add(txtProductNumber2);
        
        
        //client company name
        lblClientCompanyName=new JLabel("Client Company Name:-");
        lblClientCompanyName.setBounds(20,320,260,60);
        frm.add(lblClientCompanyName);
        
        txtClientCompanyName=new JTextField();
        txtClientCompanyName.setBounds(170,340,150,25);
        frm.add(txtClientCompanyName);
        
        
        //license activation date
        lblLicenseActivationDate=new JLabel("license Activation Date:-");
        lblLicenseActivationDate.setBounds(30,360,180,60);
        frm.add(lblLicenseActivationDate);
        
        String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        String months[]={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        String years[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
   
        day=new JComboBox(days);
        month=new JComboBox(months);
        year=new JComboBox(years);
   
        day.setBounds(180,380,50,20);
        month.setBounds(230,380,80,20);
        year.setBounds(310,380,100,20);
   
        frm.add(day);
        frm.add(month);
        frm.add(year);
        
        
        //license expire date
        lblLicenseExpireDate=new JLabel("license Expire Date:-");
        lblLicenseExpireDate.setBounds(30,400,180,60);
        frm.add(lblLicenseExpireDate);
        
        String days1[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        String months1[]={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        String years1[]={"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
   
        day1=new JComboBox(days1);
        month1=new JComboBox(months1);
        year1=new JComboBox(years1);
   
        day1.setBounds(180,420,50,20);
        month1.setBounds(230,420,80,20);
        year1.setBounds(310,420,100,20);
   
        frm.add(day1);
        frm.add(month1);
        frm.add(year1);
        
        
        //activation key
        lblActivationKey=new JLabel("Activation Key:-");
        lblActivationKey.setBounds(70,440,150,60);
        frm.add(lblActivationKey);
        
        txtActivationKey=new JTextField();
        txtActivationKey.setBounds(170,460,150,25);
        frm.add(txtActivationKey);
        
        lblNumberOfUser=new JLabel("Number Of User:-");
        lblNumberOfUser.setBounds(50,480,200,60);
        frm.add(lblNumberOfUser);
        
        txtNumberOfUser=new JTextField();
        txtNumberOfUser.setBounds(170,500,150,25);
        frm.add(txtNumberOfUser);
        
        
        //total price
        lblTotalPrice=new JLabel("Total Price:-");
        lblTotalPrice.setBounds(80,525,120,60);
        frm.add(lblTotalPrice);
        
        txtTotalPrice=new JTextField();
        txtTotalPrice.setBounds(170,545,150,25);
        frm.add(txtTotalPrice);
        
        
        //heading for license termination
        lblHeadingTerminate=new JLabel("Terminate license For Product");
        lblHeadingTerminate.setBounds(450,10,350,40);
        frm.add(lblHeadingTerminate);
        
        //product name 2
        lblProductName2=new JLabel("Product Name:-");
        lblProductName2.setBounds(450,30,120,60);
        frm.add(lblProductName2);
        
        txtProductName2=new JTextField();
        txtProductName2.setBounds(550,50,150,25);
        frm.add(txtProductName2);
        
        //product number 3 for license termination
        lblProductNumber3=new JLabel("Product Number:-");
        lblProductNumber3.setBounds(450,70,150,60);
        frm.add(lblProductNumber3);
        
        txtProductNumber3=new JTextField();
        txtProductNumber3.setBounds(550,90,150,25);
        frm.add(txtProductNumber3);
        
        
        //heading for set price
        lblHeadingPrice=new JLabel("Set Product Price");
        lblHeadingPrice.setBounds(480,240,300,50);
        frm.add(lblHeadingPrice);
        
        //product number 4 for title set price
        lblProductNumber4=new JLabel("Product Number:-");
        lblProductNumber4.setBounds(430,280,150,60);
        frm.add(lblProductNumber4);
        
        txtProductNumber4=new JTextField();
        txtProductNumber4.setBounds(550,300,150,25);
        frm.add(txtProductNumber4);
        
        //price per user 2
        lblPricePerUser2=new JLabel("Price Per User:-");
        lblPricePerUser2.setBounds(430,320,200,60);
        frm.add(lblPricePerUser2);
        
        txtPricePerUser2=new JTextField();
        txtPricePerUser2.setBounds(550,340,150,25);
        frm.add(txtPricePerUser2);
        
        
        
        
        //1.add product button
        btnAddProduct=new JButton("Add Product");
        btnAddProduct.setBounds(120,180,150,50);
        frm.add(btnAddProduct);
        btnAddProduct.addActionListener(this);
        
        //2.activate license for product button
        btnActivateLicenseForProduct=new JButton("Activate License For Product");
        btnActivateLicenseForProduct.setBounds(50,600,280,50);
        frm.add(btnActivateLicenseForProduct);
        btnActivateLicenseForProduct.addActionListener(this);
        
        //3.terminate license for product button
        btnTerminateLicenseForProduct=new JButton("Terminate License For Product");
        btnTerminateLicenseForProduct.setBounds(400,130,300,50);
        frm.add(btnTerminateLicenseForProduct);
        btnTerminateLicenseForProduct.addActionListener(this);
        
        //4.set product price per user
        btnSetProductPrice=new JButton("Set Product Price");
        btnSetProductPrice.setBounds(450,380,200,50);
        frm.add(btnSetProductPrice);
        btnSetProductPrice.addActionListener(this);
  
        //display button
        btnDisplay=new JButton("Display");
        btnDisplay.setBounds(480,480,150,70);
        frm.add(btnDisplay);
        btnDisplay.addActionListener(this);
        
        
        //clear button
        btnClear=new JButton("Clear");
        btnClear.setBounds(480,570,150,70);
        frm.add(btnClear);
        btnClear.addActionListener(this);
        txtNumberOfUser.addKeyListener(this);
        
    }
    public void keyPressed(KeyEvent k){}
    public void keyTyped(KeyEvent k){}
    public void keyReleased( KeyEvent k ){
    try{
        String productNumber=txtProductNumber2.getText();
        String numberOfUser=txtNumberOfUser.getText();
        float productNum=Float.parseFloat(productNumber);
        float numOfUser=Float.parseFloat(numberOfUser);
        setTotalPrice(productNum,numOfUser);
    }catch(Exception ex){
        JOptionPane.showMessageDialog(frm,"Please enter valid Data");
    }
}

public void setTotalPrice(float productNum, float numOfUser){//set total price for the product multiplying number of user and price per user
    boolean item=false;
    for(MicrosoftProduct tableObject:Table){
        if(tableObject.getProductNumber()==productNum){
            EnterpriseEdition tp=(EnterpriseEdition)tableObject;
            float totalprice=numOfUser*tp.getPricePerUser();
            txtTotalPrice.setText(totalprice+"");
            item=true;
            break;
        }
    }
        if(item==false){
            txtTotalPrice.setText(0+"");
        }
    }
  
    
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==btnAddProduct){//for add product button 
        try{
        String productNumber=txtProductNumber1.getText();//getting text from textfield
        String productName1=txtProductName1.getText();
        String pricePerUser=txtPricePerUser1.getText();
        if(productNumber.equals("")||productName1.equals("")||pricePerUser.equals("")){
            JOptionPane.showMessageDialog(frm,"Enter the Data");
        }else{
            float ProductNum=Float.parseFloat(productNumber);
            float userPrice= Float.parseFloat(pricePerUser);
            boolean duplicateData=false;
            for(MicrosoftProduct listObject:Table){
                if(listObject.getProductNumber()==ProductNum){
                duplicateData=true;
                break;
                }
            }
            if(duplicateData==false){
            EnterpriseEdition obj=new EnterpriseEdition(productName1,ProductNum,userPrice);//type casting enterprise edition
            Table.add(obj);
            JOptionPane.showMessageDialog(frm,"Product added sucessfully");
            }else{
            JOptionPane.showMessageDialog(frm,"Product is already activated");
            }
            
        }
        
    }catch(Exception ownException){//if any exception occur on the program
        JOptionPane.showMessageDialog(frm,"Enter the valid data");
    }
    }
    if (e.getSource()==btnActivateLicenseForProduct){//for actibate license for product button
           try{
        String productNumber=txtProductNumber2.getText();
        String clientCompanyName=txtClientCompanyName.getText();
        String numberOfUser=txtNumberOfUser.getText();
        
        String dayString=(String)day.getSelectedItem();//getting text from combo box using getSelectedItem method
        String monthString=(String)month.getSelectedItem();
        String yearString=(String)year.getSelectedItem();
        String licenseActivationDate=dayString + " " +  monthString + " " +  yearString;
        
        
        String day1String=(String )day1.getSelectedItem();//getting text from combo box using getSelectedItem method
        String month1String=(String)month1.getSelectedItem();
        String year1String=(String)year1.getSelectedItem();
        String licenseExpireDate=day1String + " " +  monthString + " " +  year1String;
       
        String activationKey=txtActivationKey.getText();
        if(productNumber.equals("") ||clientCompanyName.equals("") ||numberOfUser.equals("")||activationKey.equals("")||licenseActivationDate.equals("")||licenseExpireDate.equals("")){
        JOptionPane.showMessageDialog(frm,"Please enter the Data");
       }else{
        float productNumber2=Float.parseFloat(productNumber);
        float numberOfUser1=Float.parseFloat(numberOfUser);
        boolean item=false;
        for(MicrosoftProduct TableObject:Table){
            if(TableObject.getProductNumber()==productNumber2){
                item=true;
                EnterpriseEdition Table1=(EnterpriseEdition)TableObject;//type casting to enterprise edition
                if(Table1.getIsActivated()==true){
                    JOptionPane.showMessageDialog(frm,"License is already activated");
                }else{
                Table1.licenseIssue(clientCompanyName,numberOfUser1,activationKey,licenseExpireDate,licenseActivationDate);
                JOptionPane.showMessageDialog(frm,"License Is issued sucessfully");
            }
                break;
            }
        }
        if(item==false){
                JOptionPane.showMessageDialog(frm,"Product is not available");
            }
        }
            }catch(Exception ex){
        JOptionPane.showMessageDialog(frm,"Enter the valid data");
    }
    }
    if (e.getSource()==btnTerminateLicenseForProduct){//for terminate license for product button
    try{//try catch exception handelling
        String productNumber=txtProductNumber3.getText();
        String productName=txtProductName2.getText();
        
        if(productNumber.equals("")|| productName.equals("")){
            JOptionPane.showMessageDialog(frm,"Please enter the data");
        }else{
            float productNumber3=Float.parseFloat(productNumber);
            boolean items=false;
            for(MicrosoftProduct TableObject:Table){
                if(TableObject.getProductNumber()==productNumber3){
                    items=true;
                    EnterpriseEdition Table2=(EnterpriseEdition)TableObject;
                    if(Table2.getIsExpired()==true){
                        JOptionPane.showMessageDialog(frm,"Product license is not available");
                    }else{
                        Table2.terminateLicense();
                        JOptionPane.showMessageDialog(frm,"License Termination done !");
                    }
                    break;
                }
            }
            if(items==false){
                
                JOptionPane.showMessageDialog(frm,"Item unavailable");
            }
        }
    }catch(Exception ex){
        JOptionPane.showMessageDialog(frm,"Enter the valid data");
    }
    } 
    if(e.getSource()==btnSetProductPrice){//for set product price button
    try{
        String pricePerUser=txtPricePerUser2.getText();
        
        String productNumber=txtProductNumber4.getText();
        if(pricePerUser.equals("")||  productNumber.equals("")){
        JOptionPane.showMessageDialog(frm,"Please enter the data");
    }else{
        float productNumb=Float.parseFloat(productNumber);
        float productPrice= Float.parseFloat(pricePerUser);
        boolean item=false;
        for(MicrosoftProduct TableObject:Table){
            if(TableObject.getProductNumber()==productNumb){
                item=true;
                EnterpriseEdition Table2=(EnterpriseEdition)TableObject;//type casting tableObject to EnterpriseEdition
                if(Table2.getIsActivated()==false){
                    Table2.setPricePerUser(productPrice);
                    JOptionPane.showMessageDialog(frm,"Price per User is set");
                }else{
                    JOptionPane.showMessageDialog(frm,"Price per user cannot be change");
                }
                break;
            }
        }
        if(item==false){
           
            JOptionPane.showMessageDialog(frm,"product is not available");
        }
    }
        }catch(Exception ex){
             JOptionPane.showMessageDialog(frm,"Enter the valid data");
        }
    }
    if(e.getSource()==btnDisplay){//for displaying the product details that we had enter 
    for(MicrosoftProduct TableObject:Table){
        EnterpriseEdition object1=(EnterpriseEdition)TableObject;//type casting tableObject to enterprise edition
        object1.productDetails();
        break;
    }
    
    }
    
    if(e.getSource()==btnClear){//clearing every textfield to empty 
    txtProductNumber1.setText("");
    txtProductNumber2.setText("");
    txtProductNumber3.setText("");
    txtProductNumber4.setText("");
    txtProductName1.setText("");
    txtProductName2.setText("");
    txtPricePerUser1.setText("");
    txtPricePerUser2.setText("");
    txtClientCompanyName.setText("");
    
    day.setSelectedIndex(0);//setting combo box to default value after clearing selected items
    month.setSelectedIndex(0);
    year.setSelectedIndex(0);
    
    day1.setSelectedIndex(0);
    month1.setSelectedIndex(0);
    year1.setSelectedIndex(0);
 
   
    txtActivationKey.setText("");
    
    txtNumberOfUser.setText("");
    txtTotalPrice.setText(" ");
    }
}

   public static void main(String []args ){
        new ProductGUI();
    }
}




 



        
   

/**
 * Class MicrosoftProduct.
 *
 * @author (Pradip Dhital)
 * @version (1.0)
 */
public class MicrosoftProduct
{
        private float productNumber;
        private String productName;
        private String activationKey;
        private float price;
        public MicrosoftProduct(float productNumber, String productName)//local variables
        {
        this.productNumber=productNumber;
        this.productName=productName;
        this.activationKey="";
        this.price=0;
        }
        public float getProductNumber()//getter method for productNumber
        {
            return productNumber;
        }
        
        public String getProductName()//getter method for productName
        { 
            return productName;
        }
        
        public String getActivationKey()//getter method for activationKey
        {
            return activationKey;
        }
        
        public void setActivationKey(String activationKey)//setter method for activation key to set its value
        {
            this.activationKey=activationKey;
        }
        
        public float getprice()//getter method for price
        {
            return price;
        }
        
        public void setprice(float price)//setter method for price to set its value
        {
            this.price=price;
        }
        
        public void setProductNumber(Float productNumber){
            this.productNumber=productNumber;
        }
        
        public void setProductName(String productName){
            this.productName=productName;
        }
        
        public void productDetails()//dislay method as product details to diaplay the variables
        {
            System.out.println("Product Name: "+productName);
            System.out.println("Product Number: "+productNumber);
            if(!activationKey.equals(""))
            {
                System.out.println("Activation Key: "+activationKey);
            }
            
            if(price!=0)
            {
                System.out.println("Price: "+price);
            }
            
        }
        
    }

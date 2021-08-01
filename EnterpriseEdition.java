
public class EnterpriseEdition extends MicrosoftProduct
{

    private String clientCompanyName;
    private String licenseActivationDate;
    private String licenseExpireDate;
    private float pricePerUser;
    private float numberOfUser;
    private boolean isActivated;
    private boolean isExpired;

    public EnterpriseEdition(String productName, float productNumber, float pricePerUser)
    { 
        super(productNumber, productName);
        this.pricePerUser=pricePerUser;
        this.numberOfUser=0;
        this.licenseActivationDate="";
        this.licenseExpireDate="";
        this.isActivated=false;
        this.isExpired=false;
        this.clientCompanyName="";
    }
    //using getter method for all attributes given in question
    public String getClientCompanyName()
    {  
        return clientCompanyName;
    }

    public String getLicenseActivationDate()
    {
        return licenseActivationDate;
    }

    public String getLicenseExpireDate()
    {
        return licenseExpireDate;
    }

    public float getPricePerUser()
    {
        return pricePerUser;
    }

    public float getNumberOfUser()
    {
        return numberOfUser;
    }

    public boolean getIsActivated()
    {
        return isActivated;
    }

    public boolean getIsExpired()
    {
        return isExpired;
    }

    public void setPricePerUser(float pricePerUser)//setting price per user
    {
        this.pricePerUser=pricePerUser;
        if( isActivated==true)
        {
            System.out.println("price per user for license cannot be changed");
        }
        else
        {
            this.pricePerUser=pricePerUser;
        }
    }
    // declare the method to activate the license for the product given
    public void licenseIssue(String clientCompanyName, float numberOfUser,String licenseActivationDate, String licenseExpireDate, String activationKey)
    {  //if/else condition
        if(isActivated==true)
        {   System.out.println("name of client comapany: "+this.clientCompanyName);
            System.out.println("number of user: "+this.numberOfUser);
            System.out.println("the license is already activated");
        }
        else
        {
            this.clientCompanyName=clientCompanyName;
            this.numberOfUser=numberOfUser;
            this.licenseActivationDate=licenseActivationDate;
            this.licenseExpireDate=licenseExpireDate;

            this.isActivated=true;
            this.isExpired=false;
            super.setActivationKey(activationKey);
            float totalPrice=numberOfUser*pricePerUser;
            super.setprice(totalPrice);
        }
    }

    public void terminateLicense(){//methed to terminate the license of the product
        if(isExpired==true){
            System.out.println("license is expired already");
        }else{
            this.clientCompanyName="";
            super.setprice(0);//calling super method 
            this.setActivationKey("");
            this.licenseActivationDate="";
            this.licenseExpireDate="";
            this.numberOfUser=0;
            this.isActivated=false;
            this.isExpired=true;
        }
    }

    public void productDetails(){// method to display the product details
        super.productDetails();
        if(isActivated==true){
            //using if condition
            System.out.println("clientCompanyName: "+clientCompanyName);
            System.out.println("date of license activation: "+licenseActivationDate);
            System.out.println("date of license expire: "+licenseExpireDate);
            System.out.println("number of users: " +numberOfUser);
            System.out.println("price: "+pricePerUser);

            System.out.println("product is currently on active mood");
        }
    }  
}

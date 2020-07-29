public class FruitJuice
{
    int product_code, pack_size,product_price;
    String flavour, pack_type;
    
    public FruitJuice()
    {
        product_code = 0;
        pack_size=0;
        product_price=0;
        flavour= "";
        pack_type= "";
    }
    void input(int code,int size,int price,String Flavour, String type)
    {
        product_code = code;
        pack_size=size;
        product_price=price;
        flavour= Flavour;
        pack_type= type;
    }
    void discount()
    {
        product_price= product_price-10;
    }
    void display()
    {
       System.out.println("Product code: "+ product_code);
       System.out.println("Flavour: "+ flavour);
       System.out.println("Type of packaging: "+ pack_type);
       System.out.println("Package size: "+ pack_size);
       System.out.println("Price: " + product_price);
    }
    public static void main()
    {
        FruitJuice obj= new FruitJuice();
        obj.input(1976,500,128,"Orange","Bottle");
        obj.discount();
        obj.display();
    }
}
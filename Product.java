
public class Product implements Comparable<Product>
{
	int PId;
	String PName;
	double Price;	
    public Product(int PId,String PName,double Price) {
    	    this.PId=PId;
    	    this.PName=PName;
    	    this.Price=Price;
    }
    @Override
    public String toString() {
    	    return this.PId + " " + this.PName + " " + this.Price;
    }

    @Override
    public int compareTo(Product p) {
    	    return this.PId-p.PId;
//    	    if(this.PId == p.PId) {
//    	    	    return 0;
//    	    }
//    	    else if(this.PId > p.PId) {
//    	    	    return 1;
//    	    }
//    	    else {
//    	    	    return -1;
//    	    }
    } 
    public static void main(String[] args) {
        Product p1 = new Product(11,"Face-Cream",259.99);
        Product p2 = new Product(11,"Face-Cream",259.99);
        // Comparable<Product> comp = new al.Product();
        System.out.println(p1.compareTo(p2));
    }
}

package billGenerator;

public class Item {
	 private int itemNumber;
	    private String name;
	    private double price;
		public Item(int itemNumber, String name, double price) {
			super();
			this.itemNumber = itemNumber;
			this.name = name;
			this.price = price;
		}
		 public int getItemNumber() {
		        return itemNumber;
		    }

		    public String getName() {
		        return name;
		    }

		    public double getPrice() {
		        return price;
		    }
		@Override
		public String toString() {
			return "Item [itemNumber=" + itemNumber + ", name=" + name + ", price=" + price + "]";
		}

}

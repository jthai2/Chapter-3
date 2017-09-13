package youDoIt;

public class SpaService {
		// TODO Auto-generated method stub
		private String serviceDescription;
		private double price;
		public SpaService()
		{
			
		}
	
	
	
	public void setServiceDescription(String service)
	{
		serviceDescription = service;
		
	}
	
	public void setPrice(double pr)
	{
		price = pr;
	}
	
	public String getServiceDescription()
	{
		return serviceDescription;
	}
	
	public double getPrice()
	{
		return price;
	}

}

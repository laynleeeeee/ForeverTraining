package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WealthManagementSystem {
	public class Plan{
		Integer customerId = null;
		String portfolioName = "";
		boolean isOneTime = false;
		Double deposit = 0.0;
		
		public Integer getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}
		public String getPortfolioName() {
			return portfolioName;
		}
		public void setPortfolioName(String portfolioName) {
			this.portfolioName = portfolioName;
		}
		public boolean isOneTime() {
			return isOneTime;
		}
		public void setOneTime(boolean isOneTime) {
			this.isOneTime = isOneTime;
		}
		public Double getDeposit() {
			return deposit;
		}
		public void setDeposit(Double deposit) {
			this.deposit = deposit;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Plan [customerId=").append(customerId).append(", portfolioName=").append(portfolioName)
					.append(", isOneTime=").append(isOneTime).append(", deposit=").append(deposit).append("]");
			return builder.toString();
		}
	}
	
	public static HashMap<Integer, List<Plan>> PortfolioDeposits(List<Plan> plans) {
		HashMap<Integer, List<Plan>> customerPortfolios = new HashMap<>();
		for(Plan p: plans) {
			if(customerPortfolios.containsKey(p.getCustomerId())) {
				customerPortfolios.get(p.customerId).add(p);
			} else {
				customerPortfolios.put(p.getCustomerId(), new ArrayList<Plan>());
			}
		}
		return customerPortfolios;
	}

	public static void main(String args[]) {
		List<Plan> plans = new ArrayList<>();//list of plans, inputs goes here
		HashMap<Integer, List<Plan>> customerPortfolios = WealthManagementSystem.PortfolioDeposits(plans); //allocate plans by customer id
		int customerId = 5;//locating portfolio using customer id e.g. 5
		customerPortfolios.get(customerId);//output of the selected customer with the plans
	}
}

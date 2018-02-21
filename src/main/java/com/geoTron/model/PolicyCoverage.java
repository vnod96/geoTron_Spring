package com.geoTron.model;

public class PolicyCoverage {
		String pol_no;
		String pol_period;
		int bodily;
		int collision;
		int comprehensive;
		int deductibles;
		int premium;
		public PolicyCoverage() {
			super();
		}
		public PolicyCoverage(String pol_no, String pol_period, int bodily, int collision, int comprehensive,
				int deductibles, int premium) {
			super();
			this.pol_no = pol_no;
			this.pol_period = pol_period;
			this.bodily = bodily;
			this.collision = collision;
			this.comprehensive = comprehensive;
			this.deductibles = deductibles;
			this.premium = premium;
		}
		public String getPol_no() {
			return pol_no;
		}
		public void setPol_no(String pol_no) {
			this.pol_no = pol_no;
		}
		public String getPol_period() {
			return pol_period;
		}
		public void setPol_period(String pol_period) {
			this.pol_period = pol_period;
		}
		public int getBodily() {
			return bodily;
		}
		public void setBodily(int bodily) {
			this.bodily = bodily;
		}
		public int getCollision() {
			return collision;
		}
		public void setCollision(int collision) {
			this.collision = collision;
		}
		public int getComprehensive() {
			return comprehensive;
		}
		public void setComprehensive(int comprehensive) {
			this.comprehensive = comprehensive;
		}
		public int getDeductibles() {
			return deductibles;
		}
		public void setDeductibles(int deductibles) {
			this.deductibles = deductibles;
		}
		public int getPremium() {
			return premium;
		}
		public void setPremium(int premium) {
			this.premium = premium;
		}
		
	
}

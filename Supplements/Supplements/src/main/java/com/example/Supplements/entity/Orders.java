package com.example.Supplements.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Orders")
public class Orders {
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="Order_Id")
		private long OrderId;
		
		@Column(name="Order_Amount")
		private double OrderAmount;
		
		
		
//		@OneToOne
//		private long UserId;



		public long getOrderId() {
			return OrderId;
		}



		public void setOrderId(long orderId) {
			OrderId = orderId;
		}



		public double getOrderAmount() {
			return OrderAmount;
		}



		public void setOrderAmount(double orderAmount) {
			OrderAmount = orderAmount;
		}
		
		
		
}

package com.firstspringproject.customer;
// customer dao subclass
// and DataAccess parent class/ supper class
// 
public class CustomerDao implements DataAccess<CustomerModel>{

	@Override
	public CustomerModel save(CustomerModel entity) {
		System.out.println(entity.getId());
		
		System.out.println(entity.getName());
		
		System.out.println(entity.getAddress());
		return entity;
	}

	@Override
	public CustomerModel update(CustomerModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerModel getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

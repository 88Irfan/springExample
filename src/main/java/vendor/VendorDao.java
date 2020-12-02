package vendor;

public class VendorDao implements DataAccess<VendorModel>{

	@Override
	public VendorModel save(VendorModel entity) {
		System.out.println(entity.getId());
		System.out.println(entity.getName());
		System.out.println(entity.getAddress());
		return entity;
	}

	@Override
	public VendorModel updat(VendorModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VendorModel getById(VendorModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

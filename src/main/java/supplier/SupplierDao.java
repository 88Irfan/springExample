package supplier;

public class SupplierDao implements DataAccess<SupplierModel> {

	@Override
	public SupplierModel save(SupplierModel entity) {
		System.out.println(entity.getId());
		System.out.println(entity.getName());
		System.out.println(entity.getAddress());
		return null;
	}

	@Override
	public SupplierModel update(SupplierModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplierModel getById(SupplierModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

}

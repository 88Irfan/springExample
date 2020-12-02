package user;

public class UserDao implements DataAccess<UserModel>{

	@Override
	public UserModel save(UserModel entity) {
		System.out.println(entity.getId());
		System.out.println(entity.getName());
		System.out.println(entity.getAddress());
		return null;
	}

	@Override
	public UserModel update(UserModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel getById(UserModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

}

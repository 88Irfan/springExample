package student;

public class StudentDao implements DataAccess<StudentModel> {

	@Override
	public StudentModel save(StudentModel entity) {
		System.out.println(entity.getId());
		System.out.println(entity.getName());
		System.out.println(entity.getAddress());
		return entity;
	}

	@Override
	public StudentModel update(StudentModel entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentModel getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

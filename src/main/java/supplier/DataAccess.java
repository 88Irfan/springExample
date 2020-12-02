package supplier;

public interface DataAccess<T> {
	
	public T save(T entity);
	public T update(T entity);
	public T getById(T entity);

}

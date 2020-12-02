package vendor;

public interface DataAccess <T>{
public T save(T entity);
public T updat(T entity);
public T getById(T entity);
}

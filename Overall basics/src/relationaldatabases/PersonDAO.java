package relationaldatabases;

import java.util.List;

public interface PersonDAO {
	List<User> findAll();
	User findById(Integer id);
	Integer save (User p);
	void delete(User p);
	List<Integer> getIds();
}

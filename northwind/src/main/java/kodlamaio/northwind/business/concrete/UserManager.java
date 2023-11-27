package kodlamaio.northwind.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public Result Add(User user) {
		userDao.save(user);
		return new SuccessResult("BAşarıyla kydınız yapıldı");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		User user = userDao.findByEmail(email);
		return new SuccessDataResult<User>(user, "başarıyla listelendi");
	}

}

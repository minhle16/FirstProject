package buyer.web.service;

import buyer.web.entities.User;

public interface UserService {
	public User findUserByEmail(String email);

	public void saveUser(User user);
}

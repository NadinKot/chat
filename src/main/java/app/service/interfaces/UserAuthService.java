package app.service.interfaces;

import app.model.UserAuth;

import java.util.List;

public interface UserAuthService {

	void updateAuth(UserAuth userAuth);

	List<UserAuth> getAuthList();
}

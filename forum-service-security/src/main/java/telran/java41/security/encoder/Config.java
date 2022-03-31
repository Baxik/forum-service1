package telran.java41.security.encoder;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
class Config {

	public  PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(12);
	}
}

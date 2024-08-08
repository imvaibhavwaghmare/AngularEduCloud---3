package in.codetech.angulareducloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codetech.angulareducloud.module.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}

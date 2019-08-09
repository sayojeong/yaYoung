/**
 * login dao
 * 우다슬
 * 2019.08.09
 */
package swdo.team4.yayoung.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
	
	@Autowired
	SqlSession session;

}

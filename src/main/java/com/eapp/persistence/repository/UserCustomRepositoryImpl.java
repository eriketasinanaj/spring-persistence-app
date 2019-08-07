package com.eapp.persistence.repository;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.eapp.persistence.model.User;

@Repository
public class UserCustomRepositoryImpl implements UserCustomRepository {

 
	@PersistenceContext
	private EntityManager entityManager;

	public boolean checkUserPermissions(String userId, String controllerName, String methodName){

		String sql = " SELECT COUNT(1) as permission " +
                        " FROM user u  " +
                        " JOIN role_permission rp ON u.id_role = rp.id_role AND rp.deleted = 0 " +
                        " JOIN permission p ON p.permission_id = rp.id_permission AND p.id_application = u.id_application AND p.deleted = 0 " +
                        " WHERE u.deleted = 0 and u.is_active = 1 and u.user_id = :userId AND p.controller_name LIKE :controllerName AND p.method_name LIKE :methodName LIMIT 1 ";

        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("userId", userId);
        query.setParameter("controllerName", controllerName);
        query.setParameter("methodName", methodName);

        String result = query.getSingleResult().toString();


		return "1".equals(result);

	}
 
	@Override
	public List<User> getCustomUsers() {


		User u = new User();


//		String SELECT_CD_USER = "SELECT * FROM user";
//		List<String> cdUser = new ArrayList<>();
//
//		try {
//
//			SessionImplementor si = (SessionImplementor) entityManager.unwrap(Session.class);
//			Connection connect;
//			// Retrieve DB connection
//			connect = si.getJdbcConnectionAccess().obtainConnection();
//			connect.setAutoCommit(false); // transaction block start
//			PreparedStatement ps = null;
//			ResultSet rs;
//
//			log.debug("Start Get Autente :");
//			ps = connect.prepareStatement(SELECT_CD_USER);
//			rs = ps.executeQuery();
//			while (rs.next()) {
//				String cdUserTemp = rs.getString("CD_USER");
//				cdUser.add(cdUserTemp);
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//
//		}
 
		return null;
	}

	 
	 
}

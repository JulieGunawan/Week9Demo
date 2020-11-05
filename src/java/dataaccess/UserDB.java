/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import javax.persistence.EntityManager;
import models.User;

/**
 *
 * @author 751682
 */
public class UserDB {
    public User get(String email){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try{
            User user = em.find(User.class, email);
            return user;
        }
        finally {
            em.close();
        }
    }
    
}


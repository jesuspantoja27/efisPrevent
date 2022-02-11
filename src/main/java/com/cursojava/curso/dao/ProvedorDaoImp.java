package com.cursojava.curso.dao;

import com.cursojava.curso.models.Provedor;
import com.cursojava.curso.models.Usuario;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ProvedorDaoImp implements ProvedorDao {



    @Override
    public List<Provedor> getProvedor() {
        return null;
    }
}

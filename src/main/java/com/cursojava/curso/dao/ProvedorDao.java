package com.cursojava.curso.dao;

import com.cursojava.curso.models.Provedor;
import com.cursojava.curso.models.Usuario;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProvedorDao {



    List<Provedor> getProvedor() ;


}

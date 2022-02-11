package com.cursojava.curso.controllers;



import com.cursojava.curso.dao.ProvedorDao;
import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Provedor;
import com.cursojava.curso.models.Usuario;
import com.cursojava.curso.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProvedorController {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/provedores", method = RequestMethod.GET)
    public List<Provedor> getProvedor (@RequestHeader(value="Authorization") String token) {


        return null;
    }
//
  //  private boolean validarToken(String token) {
    //    String usuarioId = jwtUtil.getKey(token);
      //  return usuarioId != null;
    //}

   // @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
  //  public void registrarUsuario(@RequestBody Usuario usuario) {

      //  Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
      //  String hash = argon2.hash(1, 1024, 1, usuario.getPassword());
       // usuario.setPassword(hash);

      //  usuarioDao.registrar(usuario);
  //  }

    //@RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
  //  public void eliminar(@RequestHeader(value="Authorization") String token,
    //                     @PathVariable Long id) {
    //    if (!validarToken(token)) { return; }
    //    usuarioDao.eliminar(id);
    //}

}
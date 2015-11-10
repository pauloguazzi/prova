/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

/**
 *
 * @author a907413
 */
public class LoginBean {
    
private String login;
private String senha;
private int opadmin;

/** Creates a new instance of CadastroBean */
public LoginBean() {
}
public String getLogin() {
return login;
}
public void setLogin(String login) {
this.login = login;
}
public String getSenha() {
return senha;
}
public void setSenha(String senha) {
this.senha = senha;
}
public void setPerfil(int opadmin) {
this.opadmin = opadmin;
}
public int getPerfil() {
return opadmin;
}
}

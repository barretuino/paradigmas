package pjAula5;

import java.security.Timestamp;

public interface iIntegracao {
	public void servicoConexao(String user, String psw);
	public void fecharConexao();
	public void abrirSessao(long serial);
	public void invalidarSessao(Timestamp time);
}

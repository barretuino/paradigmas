package pjAula4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Coordenador extends Professor{
	private boolean deliberacao;

	public boolean isDeliberacao() {
		return deliberacao;
	}

	public void setDeliberacao(boolean deliberacao) {
		this.deliberacao = deliberacao;
	}
}

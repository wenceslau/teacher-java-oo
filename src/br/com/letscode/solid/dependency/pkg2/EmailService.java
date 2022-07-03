package br.com.letscode.solid.dependency.pkg2;

public class EmailService implements ComunicacaoService {

    @Override
    public void send(String message, String destinatario) {
        //Enviado email....
    }
}

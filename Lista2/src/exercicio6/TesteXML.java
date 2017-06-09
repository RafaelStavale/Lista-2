package exercicio6;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Thaïs Simões
 * Classe responsável pelo armazenamento em XML dos dados da agenda.
 */
public class TesteXML {

    public static void main(String[] args) {

        String PATH = "Agenda.xml";

        AgendaTelefone agendaTelefone1 = new AgendaTelefone();
        AgendaTelefone agendaTelefone2 = new AgendaTelefone();
        AgendaTelefone agendaTelefone3 = new AgendaTelefone();
        
        agendaTelefone1.setNome("Jujuba1");
        agendaTelefone2.setNome("Jujuba2");
        agendaTelefone3.setNome("Jujuba3");
        agendaTelefone1.setApelido("Ju1");
        agendaTelefone2.setApelido("Ju2");
        agendaTelefone3.setApelido("Ju3");
        agendaTelefone1.setTelefone("1111-1111");
        agendaTelefone2.setTelefone("2222-2222");
        agendaTelefone3.setTelefone("3333-3333");

        
        try {
                XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));

                encoder.writeObject(agendaTelefone1);
                encoder.writeObject(agendaTelefone2);
                encoder.writeObject(agendaTelefone3);

                encoder.close();
        } catch (Exception exc) {
                exc.printStackTrace();
        }

        AgendaTelefone recuperarAgendaTelefone1;
        AgendaTelefone recuperarAgendaTelefone2;
        AgendaTelefone recuperarAgendaTelefone3;

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));

            recuperarAgendaTelefone1 = (AgendaTelefone) decoder.readObject();
            recuperarAgendaTelefone2 = (AgendaTelefone) decoder.readObject();
            recuperarAgendaTelefone3 = (AgendaTelefone) decoder.readObject();

            decoder.close();

            System.out.println("Apelido: " + recuperarAgendaTelefone1.getApelido() + " // Telefone: " + recuperarAgendaTelefone1.getTelefone());
            System.out.println("Apelido: " + recuperarAgendaTelefone2.getApelido() + " // Telefone: " + recuperarAgendaTelefone2.getTelefone());
            System.out.println("Apelido: " + recuperarAgendaTelefone3.getApelido() + " // Telefone: " + recuperarAgendaTelefone3.getTelefone());

        } catch (Exception exc) {
                exc.printStackTrace();
        }

    }

}



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Limpiador;
import model.Medico;
import model.Operacion;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Medico medico = new Medico();
            medico.setDni("12345678A");
            medico.setNss("123456789012");
            medico.setDireccion("Calle Falsa 123");
            medico.setTelefono("123456789");
            medico.setNombre("Juan");
            medico.setConsulta("A");

            Operacion op1 = new Operacion();
            op1.setDescripcion("Operacion de corazon");
            op1.setMedico(medico);
            op1.setFecha(LocalDateTime.now());

            Operacion op2 = new Operacion();
            op2.setDescripcion("Operacion de pulmon");
            op2.setMedico(medico);
            op2.setFecha(LocalDateTime.now());


            List<Operacion> operacions = List.of(op1, op2);
            medico.setHistorico(operacions);

            Limpiador limpiador = new Limpiador();
            limpiador.setDni("87654321B");
            limpiador.setNss("987654321098");
            limpiador.setDireccion("Calle Falsa 321");
            limpiador.setTelefono("987654321");
            limpiador.setNombre("Pedro");
            limpiador.setPlanta("B");
            limpiador.setTurno("Tarde");


            em.persist(medico);
            em.persist(limpiador);



            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}

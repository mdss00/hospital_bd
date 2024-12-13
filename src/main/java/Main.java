import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.*;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Crear y persistir un objeto Medico
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

            em.persist(medico);

            // Crear y persistir un objeto Limpiador
            Limpiador limpiador = new Limpiador();
            limpiador.setDni("87654321B");
            limpiador.setNss("987654321098");
            limpiador.setDireccion("Calle Falsa 321");
            limpiador.setTelefono("987654321");
            limpiador.setNombre("Pedro");
            limpiador.setPlanta("B");
            limpiador.setTurno("Tarde");

            em.persist(limpiador);

            // Crear y persistir un objeto Enfermero
            Planta planta = new Planta();
            planta.setNum_planta(1);
            em.persist(planta);

            Enfermero enfermero = new Enfermero();
            enfermero.setDni("11223344C");
            enfermero.setNss("112233445566");
            enfermero.setDireccion("Calle Verdadera 456");
            enfermero.setTelefono("1122334455");
            enfermero.setNombre("Ana");
            enfermero.setTurno(Turnos.MANANA);
            enfermero.setPlanta(planta);

            Consulta consulta = new Consulta();
            consulta.setFecha(LocalDateTime.now());
          /*  consulta.setEnfermero(enfermero);*/

            enfermero.setConsulta(consulta);

            em.persist(enfermero);
            em.persist(consulta);

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
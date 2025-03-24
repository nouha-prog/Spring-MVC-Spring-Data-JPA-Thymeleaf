package ma.enset.hospital;

import ma.enset.hospital.entities.Patient;
import ma.enset.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;


@SpringBootApplication(scanBasePackages = "ma.enset.hospital")
@EnableJpaRepositories("ma.enset.hospital.repository")
@EntityScan("ma.enset.hospital.entities")
public class HospitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Mohammed", new Date(), false, 40));
        patientRepository.save(new Patient(null, "Hanane", new Date(), false, 334));
        patientRepository.save(new Patient(null, "Imane", new Date(), true, 304));
    }

}
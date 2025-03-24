package ma.enset.hospital.web;
import lombok.AllArgsConstructor;
import ma.enset.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;
    @GetMapping("/index")

    public String index(){
        return "patients";
    }
}

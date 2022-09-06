package edu.senac.olamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@RequestMapping(value = "/v1")
@SpringBootApplication
public class OlaMundoApplication {

	@GetMapping("olaMundo")
        public String olaMundo(){
            return "Olá Mundo";
        }
        
        @GetMapping(value = "/basico/get/olaMundo", produces = {"application/json"})
        public ResponseEntity<OlaMundoResponse> olaMundo(
                @Valid @RequestParam(value = "nome", required = false) String nome){
                System.out.println("/basico/get/olaMundo");
                
                OlaMundoResponse olaMundoResponse = new OlaMundoResponse();
                olaMundoResponse.setMensagem(String.format(MENSAGEM_OLA_MUNDO, nome));
        }
        
		
	

}

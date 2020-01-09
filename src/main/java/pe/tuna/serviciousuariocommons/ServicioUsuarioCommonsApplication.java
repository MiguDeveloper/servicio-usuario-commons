package pe.tuna.serviciousuariocommons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// IMPORTANTE: tenemos que excluir la autoconfiguracion de springdataJPA ya que por defecto va a pedir una configuacion
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ServicioUsuarioCommonsApplication {

    // Al tratarse de un common lo usaremos como una libreria y por tanto no tiene un ejecutable
    /*public static void main(String[] args) {
        SpringApplication.run(ServicioUsuarioCommonsApplication.class, args);
    }*/

}

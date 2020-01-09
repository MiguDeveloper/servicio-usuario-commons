# Servicio de libreria para usuario y rol (spring security)

Al tratarse de un servicio de libreria debemos como primer paso
- Recordar que siempre un proyecto de libreria debemos de construir el jar para usarlo como libreria en los demas proyectos. 
- Solo tener la dependencia de SpringDataJpa para de esta manera poder contar las etiquetas @Entity, etc.
- Quitar del pom.xml el plugin de maven
- Deshabilitar la autoconfiguracion de spring data Jpa y así nos evitamos el problema de que nos pida una base de datos.
 
``` java
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
// quitar el metodo main()
``` 

Tener en cuenta que donde usemos la libreria debemos de escribir tambien el nuevo componentScan, por ejemplo

``` java
@EntityScan({"pe.tuna.serviciousuariocommons.models.entity"})
@SpringBootApplication
public class ServicioUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioUsuariosApplication.class, args);
    }

}
```
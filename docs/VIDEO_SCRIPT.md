# Guion de video (5–7 minutos)

Antes de grabar: ejecuta `mvn clean test`, `mvn clean verify` y `mvn checkstyle:check`; abre el RTF3, JIRA real, IDE, terminal, README y reporte JaCoCo. No afirmes resultados que no puedas mostrar.

**0:00–0:30 Presentación**  
“Hola, soy [nombre]. Presento el avance de Estilo & Corte, un sistema para apoyar el registro de clientes, la consulta de disponibilidad y la programación de citas.”

**0:30–1:10 Problema y alcance**  
“El objetivo es organizar la información que en un negocio pequeño puede manejarse por mensajes, llamadas o anotaciones. El incremento aborda HU-001, HU-005 y HU-006. Esta versión trabaja la lógica principal; todavía no incluye interfaz gráfica ni base de datos persistente.”

**1:10–1:50 RTF3 y diseño**  
“En RTF3 se definieron caminos críticos y condiciones: datos obligatorios y duplicados en clientes; cruces entre intervalos para disponibilidad; y validación del cliente, servicio, empleado y horario antes de programar.” [Mostrar diagramas UML.]

**1:50–2:30 JIRA**  
“Organicé historias, tareas técnicas, criterios de aceptación, responsables, estimaciones y estados. Relacioné los casos CP-01 a CP-10 con sus historias. Solo marco una tarea como terminada cuando tengo evidencia.” [Mostrar el tablero real.]

**2:30–3:30 Código y Clean Code**  
“El proyecto separa modelos, repositorios y servicios. Los modelos representan datos; los repositorios abstraen almacenamiento; los servicios contienen reglas de negocio. La persistencia actual es en memoria, por lo que los datos no sobreviven al cierre.” [Mostrar carpetas, clase de servicio y README.]

**3:30–4:40 Pruebas**  
“JUnit cubre registros válidos e inválidos, duplicados, disponibilidad libre, cruce de horarios, citas consecutivas y reglas de programación.” [Ejecutar `mvn clean test`; narrar exactamente el resultado que aparezca.]

**4:40–5:20 Cobertura y análisis estático**  
“JaCoCo muestra las instrucciones y ramas ejecutadas; Checkstyle ayuda a detectar problemas de estilo. La cobertura no garantiza ausencia de errores.” [Mostrar el informe y resultado real si se generaron.]

**5:20–6:00 Git y cierre**  
“Uso commits pequeños y descriptivos. Como trabajo futuro quedan la persistencia real, la interfaz gráfica y ampliar las pruebas de errores de almacenamiento. Gracias por ver la presentación.”  
Ajusta el guion a lo que realmente esté implementado y ejecutado.

# Estilo & Corte — incremento inicial Java
Este es un incremento académico propuesto para HU-001, HU-005 y HU-006. **Ejecuta los comandos antes de afirmar que las pruebas pasaron.**

## Requisitos
JDK 17+, Maven 3.9+ e internet para descargar dependencias la primera vez.

## Ejecutar
- `mvn clean test` — ejecutar pruebas unitarias.
- `mvn clean verify` — ejecutar pruebas y generar JaCoCo.
- Informe: `target/site/jacoco/index.html`
- `mvn checkstyle:check` — análisis básico de estilo.

## Estructura
- `model`: entidades del negocio.
- `repository`: contratos y repositorios en memoria.
- `service`: reglas de negocio.
- `src/test`: pruebas JUnit 5.

## Limitaciones
La persistencia es en memoria, no hay interfaz gráfica ni base de datos real. Los datos se pierden al cerrar la aplicación. La versión es un incremento inicial, no software listo para producción. Revisa las reglas de negocio de RTF1/RTF2 antes de darlo por terminado.

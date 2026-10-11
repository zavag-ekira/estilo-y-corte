# Matriz de trazabilidad
| HU | Casos | Componente | Evidencia |
|---|---|---|---|
| HU-001 | CP-01 válido; CP-02 dato ausente; CP-03 duplicado | ClienteService | Salida JUnit |
| HU-005 | CP-04 sin citas; CP-05 cruce; CP-06 varios intervalos/límites | DisponibilidadService | Salida JUnit y JaCoCo |
| HU-006 | CP-07 válido; CP-08 ocupado; CP-09 referencia inválida; CP-10 error de guardado | CitaService | Salida JUnit |
Nota: CP-10 está planeado en RTF3 pero aún no existe prueba automatizada de fallo de almacenamiento en este incremento. No marcarlo aprobado sin implementarlo y ejecutarlo.

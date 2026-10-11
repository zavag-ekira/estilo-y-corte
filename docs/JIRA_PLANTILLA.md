# Plantilla para crear en JIRA (todavía debes crear las incidencias)
Proyecto: Estilo & Corte. Responsable: el estudiante. Estados sugeridos: Por hacer → En progreso → En revisión → Hecho. Asignar todo al estudiante y no marcar Hecho sin evidencia.

## Épica
EPIC-01 — Incremento funcional: clientes y citas.

## HU-001 — Registrar cliente
Historia: Como recepcionista, quiero registrar datos del cliente para conservar su información y facilitar la programación de citas.
Criterios: (1) con nombre, teléfono y correo válidos se registra; (2) datos obligatorios ausentes o correo inválido se rechazan; (3) teléfono duplicado no crea otro cliente.
Tareas sugeridas: diseñar Cliente (2 h); crear repositorio (1 h); implementar servicio (2 h); pruebas CP-01 a CP-03 (2 h). Prioridad alta.

## HU-005 — Consultar disponibilidad
Historia: Como recepcionista, quiero consultar disponibilidad por empleado, fecha y horario para ofrecer un espacio libre.
Criterios: (1) sin cruce, disponible; (2) con cita activa que se cruza, ocupado; (3) cita cancelada no bloquea; (4) datos inválidos se rechazan.
Tareas sugeridas: diseñar comparación de intervalos (1 h); consultar citas por empleado/fecha (2 h); implementar servicio (2 h); pruebas CP-04 a CP-06 (2 h). Prioridad alta.

## HU-006 — Programar cita
Historia: Como recepcionista, quiero asignar cliente, servicio, empleado y horario disponible.
Criterios: (1) datos válidos; (2) cliente registrado, servicio y empleado activos; (3) horario ocupado se rechaza; (4) confirmar solo tras guardar.
Tareas sugeridas: validar referencias (2 h); integrar disponibilidad (2 h); guardar cita (2 h); pruebas CP-07 a CP-10 (3 h). Prioridad alta.

## Tareas transversales
Configurar Maven/JUnit (2 h); configurar JaCoCo (1 h); ejecutar Checkstyle y corregir (1 h); README (1 h); Git y commits (1 h); preparar evidencias/video (2 h).

## Trazabilidad
HU-001 ↔ CP-01..CP-03; HU-005 ↔ CP-04..CP-06; HU-006 ↔ CP-07..CP-10. Adjuntar evidencias de ejecución, cobertura, análisis estático y enlace al repositorio. Las horas son estimaciones, no tiempo real invertido.

# Sistema de Gestión Bancaria

Un sistema modular en Java para administrar cuentas bancarias de clientes, desarrollado con Java Modules.

## Descripción

Aplicación de consola que simula las operaciones básicas de un banco:
- Gestión de clientes con información de contacto
- Múltiples tipos de cuentas: **Corriente**, **Ahorro** y **Sueldo**
- Lectura de datos de clientes desde archivo
- Menú interactivo para crear cuentas y consultar saldos

## Características

- **Clientes**: Almacenamiento de datos personales (nombre, apellido, DNI, contacto)
- **Cuentas**: 
  - Cuenta Corriente (con descubierto permitido)
  - Cuenta Ahorro (con tasa de interés)
  - Cuenta Sueldo (asociada a empresa)
- **Persistencia**: Lectura de datos desde archivo `src/cuenta.txt`
- **Módulos Java**: Uso de Java 9+ module system

## Estructura del Proyecto

```
clase 1/
├── src/
│   ├── module-info.java          # Declaración del módulo
│   └── ar/com/unpaz/
│       ├── model/                # Clases de dominio
│       │   ├── Cliente.java
│       │   ├── Cuenta.java
│       │   ├── CuentaCorriente.java
│       │   ├── CuentaAhorro.java
│       │   ├── CuentaSueldo.java
│       │   └── Contacto.java
│       ├── principal/            # Punto de entrada
│       │   └── Main.java
│       └── repositorio/          # Acceso a datos
│           └── LecturaArchivo.java
├── bin/                          # Compilados (generado)
├── run.sh                        # Script de ejecución (bash)
└── run.ps1                       # Script de ejecución (PowerShell)
```

## Requisitos

- **Java**: 21 o superior
- **SO**: Windows, macOS o Linux

## Cómo Ejecutar

### En Windows (PowerShell)
```powershell
.\run.ps1
```

### En macOS / Linux (bash)
```bash
./run.sh
```

## Compilación Manual

```bash
javac -d bin src/module-info.java src/ar/com/unpaz/model/*.java \
  src/ar/com/unpaz/repositorio/*.java src/ar/com/unpaz/principal/*.java
```

## Ejecución Manual

```bash
java --module-path bin -m POO/ar.com.unpaz.principal.Main
```

## Próximas Mejoras

- Persistencia en base de datos
- Validaciones avanzadas de entrada
- Operaciones de transferencia entre cuentas
- Reportes y estadísticas

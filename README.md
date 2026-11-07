Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Gestión de Cuentas en Redes Sociales (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🌐 Simulación de Gestión de Cuentas en Redes Sociales (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de perfiles para redes sociales, implementando una jerarquía de clases mediante herencia para administrar distintos tipos de cuentas especializadas (cuentas de creadores de contenido y cuentas corporativas) con algoritmos de cálculo de impacto y métricas personalizadas. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores e invocación de métodos mediante `super`, la organización en paquetes (`Super_Clase` y `Sub_Clase`), la sobrescritura polimórfica de métodos (`@Override`) y la gestión de operaciones lógicas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general, sus respectivas subclases especializadas y un punto de ejecución:

* **`CuentaSocial` (Paquete `Super_Clase`)**: Clase base que centraliza los atributos y comportamientos comunes de cualquier perfil dentro de la plataforma social.
* **Atributos protegidos (`protected`)**: `username`, `email` y `seguidores`, permitiendo que las clases hijas accedan directamente a la identidad básica de la cuenta.
* **Constructor**: Inicializa los datos comunes de identificación del usuario.
* **Métodos operativos**:
* `publicarContenido(String contenido)`: Simula la publicación de un mensaje en el perfil.
* `seguir(String seguir)`: Simula la acción de seguir a otro usuario dentro de la red.
* `calcularImpacto()`: Método base que retorna la cantidad simple de seguidores, diseñado para ser sobrescrito por las subclases.
* `mostrarInformacion()`: Imprime por consola los datos generales del perfil.




* **`CuentaCreador` (Paquete `Sub_Clase`)**: Extiende de `CuentaSocial` para modelar perfiles enfocados en la monetización y creación masiva de contenido.
* **Atributos privados (`private`)**: `ingresoPublicidad` y `visualizaciones`.
* **Constructor**: Invoca a `super(...)` para inicializar los datos heredados y configura las métricas financieras y de visualización.
* **Sobrescritura (`@Override`)**:
* `calcularImpacto()`: Aplica una fórmula ponderada sumando los seguidores a una fracción de las visualizaciones totales (`seguidores + (visualizaciones / 100.0)`).
* `mostrarInformacion()`: Reutiliza `super.mostrarInformacion()` y detalla el tipo de cuenta, ingresos publicitarios, visualizaciones e impacto calculado.


* **Método específico**: `registrarIngresos(double monto)` para sumar fondos de manera controlada al saldo publicitario.


* **`CuentaCorporativa` (Paquete `Sub_Clase`)**: Extiende de `CuentaSocial` para modelar perfiles de empresas u organizaciones con control administrativo y multiplicadores de impacto comercial.
* **Atributos privados (`private`)**: `limiteAdministradores`, `sitioWebOficial` y `administradoresActuales`.
* **Constructor**: Utiliza `super(...)`, asigna los permisos corporativos e inicializa el contador de administradores actuales en cero (`0`).
* **Sobrescritura (`@Override`)**:
* `calcularImpacto()`: Aplica un factor de ponderación comercial multiplicando los seguidores por un coeficiente corporativo (`seguidores * 1.5`).
* `mostrarInformacion()`: Extiende la visualización mediante `super` para incorporar el sitio web oficial, el límite y estado de administradores, y el impacto obtenido.


* **Método específico**: `agregarAdministrador()` para verificar topes y registrar altas de nuevos moderadores de forma defensiva.


* **`Main`**: Punto de entrada del programa. Instancia una cuenta de creador y una cuenta corporativa con datos reales, ejecuta acciones de publicación, seguimiento, registro de ingresos financieros y alta de administradores, y genera por consola los reportes consolidados de métricas e impacto final.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Cálculo Polimórfico de Impacto:** Cada tipo de cuenta implementa su propio algoritmo de evaluación de influencia (fórmula basada en visualizaciones para creadores vs. factor multiplicador comercial para corporaciones).
2. **Control Defensivo de Recursos:** La gestión de administradores en la cuenta corporativa valida estrictamente que no se rebase el límite máximo permitido antes de incrementar el contador.
3. **Reutilización Estructural con `super`:** Las subclases delegan la impresión de los datos de identidad básicos a la superclase mediante `super.mostrarInformacion()`, enriqueciendo el informe con sus métricas particulares.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== CUENTA DE CREADOR =====
gamer123publicó: Nuevo video disponible.
gamer123ahora sigues a @programador

--- MÉTRICAS DEL CREADOR ---
Username: gamer123
Email: gamer@gmail.com
Seguidores: 10000
Tipo de cuenta: Creador
Ingresos por publicidad: $60000.0
Visualizaciones: 250000
Impacto: 12500.0

===== CUENTA CORPORATIVA =====
tecnologia_oficialpublicó: Conocé nuestros nuevos productos.
tecnologia_oficialahora sigues a @clientes
Administrador agregado correctamente.
Administrador agregado correctamente.
Administrador agregado correctamente.
Se alcanzó el límite de administradores.

--- MÉTRICAS DE LA EMPRESA ---
Username: tecnologia_oficial
Email: contacto@tecnologia.com
Seguidores: 20000
Tipo de cuenta: Corporativa
Sitio web oficial: www.tecnologia.com
Límite de administradores: 3
Administradores actuales: 3
Impacto: 30000.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía de Perfiles Sociales:** Modelado de identidades digitales mediante una estructura limpia de herencia orientada a objetos.
* **Sobrescritura de Métodos (`@Override`):** Adaptación dinámica de las reglas de cálculo de impacto y presentación de reportes según la naturaleza del perfil.
* **Diseño Modular y Paquetes:** Clara separación entre clases base y derivadas utilizando namespaces de Java para mantener un código escalable y organizado.

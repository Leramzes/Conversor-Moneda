# 🪙 Conversor de Monedas (Java + API ExchangeRate)

Proyecto desarrollado como parte del programa **Alura Latam**, orientado a reforzar habilidades como **Backend Developer** utilizando Java moderno.  
Esta aplicación permite convertir valores entre diferentes monedas en tiempo real consumiendo una API externa de tasas de cambio.

---

## 🚀 Tecnologías utilizadas

- Java 17  
- Maven  
- HttpClient (Java 11+)  
- Gson (Google)  
- API de tipo de cambio (ExchangeRate)

---

## 📌 Funcionalidades

- Conversión de moneda usando valores reales desde una API  
- Menú interactivo por consola  
- Manejo de solicitudes HTTP con `HttpClient`  
- Parseo de JSON con `Gson`  
- Arquitectura simple y extensible

Monedas disponibles:

- Dólar ⇄ Peso Argentino  
- Dólar ⇄ Real Brasileño  
- Dólar ⇄ Peso Colombiano  

---

## 🛠 Requisitos

- Java 17 instalado  
- Maven 3.8+  
- Conexión a Internet  

---

## 🌐 API Utilizada

Este proyecto utiliza la API de tasas de cambio de:

**ExchangeRate API**  
https://www.exchangerate-api.com/

Para usar esta API necesitas una **API KEY** personal.

### 🔑 ¿Cómo obtener tu API KEY?

1. Ingresa a  
   https://www.exchangerate-api.com/
2. Regístrate con tu correo.
3. Obtendrás una API KEY gratuita (Free Tier).
4. Reemplaza la clave en tu código, por ejemplo:
   
```java
String apiKey = "TU_API_KEY_AQUI";
String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/USD/ARS";
```


---
## 📦 Instalación

Clona el repositorio:

```bash
git clone https://github.com/tuusuario/conversor-moneda-challenge.git



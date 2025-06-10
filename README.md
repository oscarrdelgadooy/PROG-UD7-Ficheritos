
# ActividadUno – Guardar texto en fichero 

Este programa Java permite al usuario introducir una cadena de texto por teclado, valida que tenga al menos **30 caracteres**, la transforma, y luego la guarda en un archivo llamado `hola.txt`.

##  ¿Qué hace?

1. Pide al usuario una cadena de mínimo 30 caracteres.
2. Si no alcanza la longitud, informa cuántos caracteres faltan y vuelve a pedir el texto.
3. Convierte el texto a **mayúsculas** y reemplaza los espacios por **guiones bajos** (`_`).
4. Guarda el resultado en el fichero `hola.txt` con codificación UTF-8.

# ActividadDos – Leer archivo carácter por carácter 

Este programa Java lee el contenido del archivo `backup.txt` **carácter por carácter** y muestra por consola cada letra junto con su código Unicode.

## ¿Qué hace?

- Abre el archivo `backup.txt` con codificación **UTF-8**.
- Lee cada carácter uno por uno.
- Imprime en consola el carácter y su valor entero (Unicode), separados por guiones bajos.

# ActividadTres – Fusionar archivos de texto 

Este programa en Java lee dos archivos (`hola.txt` y `backup.txt`), fusiona su contenido en un nuevo archivo llamado `fusedFiles.txt`, y añade una **firma artística ASCII** al final.

## ¿Qué hace?

1. Lee el contenido de `hola.txt`.
2. Lee el contenido de `backup.txt`.
3. Escribe ambos contenidos en `fusedFiles.txt` con sus respectivos títulos.
4. Agrega una firma en arte ASCII al final del archivo.

## Archivos involucrados

- `hola.txt`: generado en la actividad uno.
- `backup.txt`: usado en la actividad dos.
- `fusedFiles.txt`: archivo final que contiene la fusión de ambos textos más la firma.

## Estructura del archivo final

- Contenido del fichero Uno: HOLA_ESTO_ES_UNA_PRUEBA
- Contenido del fichero Dos: Otro texto...
- Firma chulisima.
 
## ActividadCuatro - Trabajar con objetos.

## Clases importantes

- Mesa.java: Clase que representa una mesa. Implementa Serializable.

- MesasMethods.java:

    - saveTable(ArrayList<Mesa>): guarda una lista de mesas en el fichero.

    - showTables(): lee las mesas del fichero y las muestra por consola.

## Funcionalidad

- Guardar una lista de objetos `Mesa` en un fichero (`mesitas.txt`) usando `ObjectOutputStream`.
- Leer dicha lista desde el fichero con `ObjectInputStream` y mostrar su contenido.
- Manejo completo de excepciones relacionadas con archivos y serialización.
# Taller-16
alumno: Carlos jose torres del rio Principio abierto cerrado

Principio abierto cerrado.

Como una de las partes de los principios SO(pen close principle)LID El principio abierto cerrado.

Puede ser llamado una pauta, regla o guia sobre la esstructuración del codigo, suu comprensión radica principalmene alrededor de enter que.

Una clase debe estar abierta a extenderse pero, cerrada a modificarse. Es decir:

Estar los suficientemente bien estructurada para que una vez terminado el codigo incluso la necesidad de añadir requisitos a posterior, no haga necesaria la moddificación de las clases terminadas ya completadas, sino el añadiido de nuevas partes al codigo.

Actividad 1:

Se pide una clase descuentos que maneje  descuentos en porcentaje. 
Se pide que se exitenda para manejar descuentos fijos.

Se crea la clase Descuentos
    -Se añaden loss ints precioOriginal y descuento
    -Se añade el double PreciotrasDescuento

Se crea una clase preciodeDescuentos
    -Se añade un contructor para los datos anteriores
    -se añade un nuevo double descontado para hacer la operación.
    se añade un metodo con un system out print    
Se crea una clase main para usar objetos en la demostración de la funcionalidadd del codigo.

Actividad 2:

Se pide una clase Documentos para formato pdf (No se consiguio el diferenciar los formatos)
se pide extender el codigo para añadir a los formatos word y excel

Se crea la clase documentos
    -se le da un metodo exportar coin system out print. para un mensaje para intentar usar de ejemplo a exportación pdf.
Se crean las 2 clases de extensión sin modificar el primer codigo de documentos.
    -clase word
    -clase excel
    -ambas tienen iteración propia del mensaje de exportar, para simular un canal propio de exportación
Se crea un main para poder poner a prueba el codigo.
    -se crea un objeto para cada clase.
    -cada objeto instancia el metodo de su respectiva clase para notar las diferencias conseguidas sin alterar el codigo base de documentos.

Actividad 3:

Se pide una clase Mensajero (Se usa un string para simular una notificación)
sse pide que exitena a sms (Se usa un string para simular el mensaje sms)
    
Se crea la clase mensajero
    -Se le añade un metodo enviar con un string.
se crea la clase SMS
    -Se da un sobreescribir al metodo enviar para ajustarlo a sms
Se crea una clase main para poner a prueba el funcionamiento del codigo sin alterar la base del codigo de una muestra se Strings    
# PROGR-1-DAW
## EJERCICIOS BASICOS

- Crear una aplicación con una clase Coche que pueda acelerar y frenar un número determinado de km/h. Haced que tenga también una clase Bicicleta que pueda acelerar y frenar (pero menos que el coche). Haced un método que os imprima por pantalla la velocidad del coche o la bicicleta. Haced un método para cada clase que devuelva (return) su velocidad.

- Crear una aplicación con una CuentaCorriente en la que se pueda ingresar y retirar dinero. También consultar su saldo.

- Hacer una aplicación con una clase Mago y otra Arquero. Un Mago puede atacar a un Arquero y hacerle unos puntos determinados de daño, y el Arquero puede hacerle lo mismo al Mago. Deben poder consultarse los puntos de vida de cada uno (este ejemplo tiene algo más de miga).

- Una Impresora nueva tiene un Toner. Un Toner tiene un número de páginas "de vida" (puede imprimir, por ejemplo, mil páginas; después, se agota). Cuando una impresora imprime, el número de páginas restantes del Toner disminuye (este también tiene algo distinto).

- Crea una clase que modele una Planta. Una planta debe tener nombre y niveles de agua, altura (en cm) y salud.
Cada planta puede tener un nombre distinto, pero todas empiezan con 40 puntos de agua, 10 cm de altura y 100 de salud.
Una planta puede regarse una cantidad determinada de litros, de manera que su agua suba 10 puntos por cada litro.
Puede tomar el sol un número determinado de horas. Por cada hora al sol, su agua baja 5 puntos, su altura sube 2 cm y su salud sube 1 punto.
También puede fertilizarse: su altura sube 3 cm y su agua baja 5 puntos.
También debe haber un método llamado mostrarEstado() que imprima por pantalla el nombre, agua, altura y salud de la planta.

Ampliación
Crea una clase llamada Jardinero. Un jardinero puede regar una planta una cantidad determinada de litros y puede fertilizarla.
Crea una clase Propietario que sea el dueño de una única Planta. Un propietario solo puede podar su planta, y no otra, cinco centímetros de cada vez o un número distinto de cm cada vez que se riegue (para practicar sobrecarga).

- Crea una clase modele una MascotaVirtual. Una mascotaVirtual debe tener nombre y niveles de hambre, felicidad y energía.
Cada mascota puede tener un nombre distinto, pero todas empiezan teniendo 50 puntos de hambre, 50 de felicidad y 100 de energía.
Una mascota puede comer, en cuyo caso su nivel de hambre baja 5 puntos y su energía sube 1 punto. Puede jugar un número determinado de minutos, de manera que su energía baje 2 puntos por cada minuto jugado. Su felicidad aumentará 3 puntos por cada minuto jugado, y su hambre subirá 1 punto por cada minuto jugado.
También puede dormir un número determinado de horas, recargando 2 puntos de energía por cada hora dormida. Su hambre sube 1 punto cada hora que duerme.
También debe haber un método llamado mostrarEstado() que imprima por pantalla el nombre, hambre, felicidad y energía de la mascota.

Ampliación
Crea una clase llamada Cuidador. Un cuidador puede alimentar a una mascota.
Crea una clase Propietario que sea el dueño de una única Mascota. Solo el propietario puede jugar con la mascota.
# language: es
Característica: sumar

	Esquema del escenario: Sumar dos números enteros
		Dado que he introducido <entrada_1> como primer sumando
    	Y que he introducido <entrada_2> como segundo sumando
    	Cuando oprimo el botón de sumar
    	Entonces el resultado debe ser <resultado> en la pantalla
  	
  	Ejemplos:
    	| entrada_1 | entrada_2 | resultado |
    	| 20        | 30        | 50        |
    	| 2         | 5         | 7         |
    	| 0         | 40        | 40        |
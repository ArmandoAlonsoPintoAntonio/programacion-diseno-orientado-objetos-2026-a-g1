El polimorfismo se aplica al usar una lista de tipo Envio que almacena diferentes tipos de envíos (Estandar, Express e Internacional). Cada objeto implementa su propio método calcularCosto(), pero todos se manejan como Envio.

Se sobrescribe el método calcularCosto() en cada subclase para aplicar diferentes fórmulas sin usar condicionales. Esto permite que el programa sea más flexible y fácil de ampliar.

Si se agrega un nuevo tipo de envío, solo se crea otra subclase y se implementa su cálculo, sin modificar el código existente, cumpliendo el principio de abierto/cerrado.
# Automatizacion en Booking
Prueba tecnica de Automatizacion para Devco realizada sobre la pagina:  
https://www.booking.com/

## Requisitos  
Para la clonacion y ejecucion del proyecto es necesario contar con los siguientes requisitos:  
- Java 11
- Gradle version 7.0.
- IntelliJ IDEA O Eclipse.
- Plugin "Cucumber for Java" instalado en Eclipse.
- Plugin "Gherkin" instalado en Eclipse.
- Navegador Google Chrome Versión 99.0.4844.51 (en caso de contar con una version de Google Chrome superior descargar el driver de esta misma y pegarlo en la carpeta "drivers").
- Git

## Clonacion del proyecto
Clonar el proyecto en la maquina local en la ubicacion deseada con el siguiente comando de git:  
`git clone https://github.com/Pablo-27/BookingTest.git`

### Abrir el proyecyo en Eclipse
- Se recomienda abrir el proyecto como proyecto de tipo GradleProject y refrescar el Gradle con click derecho sobre la raiz del proyecto -> Gradle -> Refresh Gradle Project.

## Ejecucion de casos de prueba
Para la ejecucion de los escenarios de prueba se puede usar el siguiente comando desde la consola de Eclipse:  
`gradle clean test aggregate`  
El comando anterior realiza la ejecucion de todos los escenarios de prueba que se tengan en el proyecto.  

En caso que se quiera ejecutar un escenario en especifico dentro de la carpeta runners se puede elegir el escenario a ejecutar, la carpeta runner se encuentra en la ruta:  
BookingTest\src\test\java\runners  
 - Para la ejecucion de un runner en especifico se debe de dar click derecho sobre este y luego la opcion Run As JUnit Test.


### Casos de prueba automatizados
Los casos de prueba automatizados se encuentran tageados dentro de los archivos feature con el tag:  
`@Automatico`  
Esto se hace con el fin de diferenciarlos de los casos de prueba manuales.

### Casos de prueba manuales
Los casos de prueba manuales se crearon dentro de los diferentes archivos .features identificados con los tags:  
```
@manual  
@ManualExitoso  
```
o  
```
@manual  
@ManualFallido 
```
 - El tag @ManualExitoso hace referencia a que de caso de prueba manual tuvo un resultado exitoso.
 - El tag @ManualFallido hace referencia a que de caso de prueba manual tuvo un resultado Fallido.  
 Esto se hace con el fin de que al momento de ejecutar los diferentes escenarios de prueba estos queden registrados en el reporte de serenity como ejecucion de forma manual y asi poder visualizar todos los escenrios de prueba en un mismo reporte. 

## Reporte de ejecucion de pruebas
Para la visualizacion del reporte de serenity se debe de abrir el archivo index.html el cual se encuentra en la ruta del proyecto:  
BookingTest\target\site\serenity  
Se debe tener presente que el reporte se sobreescribe en cada ejecucion realizada.

###Proyecto Realizado por: Juan Pablo Marquez Arredondo 

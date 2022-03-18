#Author: juanpablomarquez7@gmail.com


Feature: Atracciones turisticas
  Yo como usuario de Booking
  quiero automatizar la funciones de atracciones turisticas 
  con el fin de obetener las atracciones con precio mas bajo en Roma
 

	@AtraccionesTuristicasAutomatic
  Scenario: Atracciones Turisticas Booking
    Given "Juan" navega a la pagina de Booking
    When ingresa a las atracciones turisticas y busca en Roma
    Then se evidencia la atraccion con precio mas bajo con 'COP 12.700'


	@AtraccionesTuristicasManualExitoso
  Scenario: Atracciones Turisticas Booking
    Given "Juan" navega a la pagina de Booking
    When ingresa a las atracciones turisticas y busca en Roma
    Then se evidencia la atraccion con precio mas bajo con 'COP 12.537'
    
    
  @AtraccionesTuristicasManualFallido
  Scenario: Atracciones Turisticas Booking
    Given "Juan" navega a la pagina de Booking
    When ingresa a las atracciones turisticas y busca en Roma
    Then se evidencia que el precio mas bajo no es 'COP 12.537'
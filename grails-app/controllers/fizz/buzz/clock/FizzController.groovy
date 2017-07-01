package fizz.buzz.clock

import fizz.buzz.clock.business.ClockBusiness

public class FizzController {

   
    def index() { 
    
    }
    
    
    def check(){  
        ClockBusiness clockBusiness = new ClockBusiness()
            def hora = params.hora
        println "la hora ingresada es :" + hora
       def clockRes = clockBusiness.resultClock(hora)
      [resultado: clockRes]  
    }
}

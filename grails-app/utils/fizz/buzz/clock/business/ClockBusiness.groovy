/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fizz.buzz.clock.business

/**
 *
 * @author alejandro
 */
class ClockBusiness {
    
    
    String resultClock(String hour){
        
        if(hour.matches("[0-2][0-9]:[0-6][0-9]")){
            
          //  return "formato valido"
            
            def time = hour.split(':')
            int hours = Integer.parseInt(time[0])
            int minutes = Integer.parseInt(time[1])
           
            
            if(checkMaxHour(hours)){
                
                if(minutes == 0){
                    def clockReturn=""
                    def clockRepeat = (hours-12).abs()
                    for(int i; i<clockRepeat; i++){
                        clockReturn += "Cuckoo "
                    }
                    return clockReturn
                }
                else if(minutes ==30 ){
                    return "Cuckoo"
                }else {
                    def fizz = minutes%5
                    def buzz = minutes%3
                    def fizzbuzzRes = ""
                    if(fizz == 0 && buzz == 0)
                        fizzbuzzRes += "Fizz Buzz"

                    else if(fizz== 0)
                        fizzbuzzRes += "Fizz"
                    else if(buzz== 0)
                        fizzbuzzRes += "Buzz"
                    
                    else 
                        fizzbuzzRes = "tick"
                    
                    return fizzbuzzRes
                }
                
                
                
               
            }else {
                return "Ingreso un valor de hora mayor a 23, formato invalido"
            }
        }
        
        else{
            return "Formato no valido"
        }
        
        
        
    }
    
    
    boolean checkMaxHour(int hour){
        if ( hour <24){
            
            return true
            
        }else {
            return false
        }
        
    }
    
    
}


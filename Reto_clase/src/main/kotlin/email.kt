//pida email si este (retorna boolean) si

fun main(){
    fun businessEmail(s: String): Boolean {//2
        return s.contains("@") && s.contains("business.com")
    }

    fun isAnEmail(email: (String) -> Boolean) {//3
        print("Dime tu email: ")
        if(email(readln())){//al leer el email se lo envia a business y se retornará true o false
            println("Su email de la empresa es correcto.")
        }else{
            println("Su email de la empresa no es correcto.")
        }


    }
    isAnEmail(::businessEmail)//1

}

//ejecuta 1 que se va a 3 y al leer un email va a 2 y 2 sugun el email introducido retornará tre o false
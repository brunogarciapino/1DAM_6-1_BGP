/*Herencia de Especialización: Ya que una armadura tiene un comportamiento básico pero
cada parte de la armadura se especializa según sus características*/

//La clase Armadura es la superclase
abstract class Armadura(open var parte:String, open var material:String,open var peso:Int){
    abstract fun proteger()
}
//La clase casco es una subclase
 class Casco(override var parte: String,override var material: String,override var peso:Int):Armadura(parte,material,peso){
     override fun proteger(){
         println("Protege la cabeza")
     }
}
//La clase Pechera es una subclase
class Pechera(override var parte: String,override var material: String,override var peso:Int):Armadura(parte,material,peso){
    override fun proteger() {
        println("Protege el Torso")
    }
}
//La clase Pantalones es una subclase
class Pantalones(override var parte: String,override var material: String,override var peso:Int):Armadura(parte,material,peso){
    override fun proteger() {
        println("Protege las piernas")
    }
}
//La clase Botas es una subclase
class Botas(override var parte: String,override var material: String,override var peso:Int):Armadura(parte,material,peso){
    override fun proteger() {
        println("Protege los pies")
    }
}
/*Es herencia de extensión, ya que cada animal realiza algo distinto, por ejemplo un pajaro puede volar pero un perro no
pero aún así ambos son seres vivos
 */
//La clase serVivo es una superclase
abstract class serVivo(open var animal:String,open var raza:String,open var numextremidad:Int){
    abstract fun alimentación()

}
//La clase Perro es una subclase
class Perro(override var animal: String,override var raza: String,override var numextremidad: Int):serVivo(animal,raza, numextremidad){
    override fun alimentación() {
        println("El perro esta comiendo")
    }
    fun ladrar(){
        println("El perro está ladrando")
    }
}
//La clase Pájaro es una subclase
class Pajaro(override var animal: String,override var raza: String,override var numextremidad: Int):serVivo(animal,raza, numextremidad){
    override fun alimentación() {
        println("El pájaro esta picoteando el pisto")
    }
    fun volar(){
        println("El pájaro está volando")
    }
}

fun main() {
var armadura1:Casco = Casco("Cabeza","Hierro",1)
    println("¿Que protege la armadura1?")
    armadura1.proteger()
var armadura2:Pechera = Pechera("Torso","Hierro",2)
    println("¿Que protege la armadura2?")
    armadura2.proteger()
var armadura3:Pantalones = Pantalones("Piernas","Hierro",3)
    println("¿Que protege la armadura3?")
    armadura3.proteger()
var armadura4:Botas = Botas("Pies","Hierro",1)
    println("¿Que protege la armadura4?")
    armadura4.proteger()

var Perro1:Perro = Perro("Perro","Husky",4)
    println("Paco,¿Que hace el perro?")
Perro1.alimentación()
Perro1.ladrar()
var Pajaro1:Pajaro = Pajaro("Pájaro","Colibri",4)
    println("Paco,¿Que hace el pájaro?")
Pajaro1.alimentación()
Pajaro1.volar()
}

/* E)
    Yo creo que no existe otra forma de implementarlo si no es la herencia
 */

/* F)
    Nos permite reduccir el tamaño del código ya que al usar la herencia ahorramos códigos y obtener una mayor legibilidad
    lo que hace que sea un código más limpio y menos confuso
 */
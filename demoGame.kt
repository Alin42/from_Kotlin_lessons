class Item(var LvlRequired: Int, var StrRequired: Int, var Class: String){
    fun TryUsing(p: Player): Boolean{
        if (p.lvl >= LvlRequired && p.str >= StrRequired){
            println("Item used!")
            return true
        }
        else{
            println("Item can`t be used")
            return false
        }
    }
}


data class Player(var name: String, var _class: String, var backpack: Array<String> = emptyArray(),
                  var maxLen: Int = 20, var dex: Int = 1, var str: Int = 1, var lvl: Int = 1,
                  var maxHP: Int = 20, var nextLvlXP: Int = 10, var XP: Int = 0, var HP: Int = 20){
    private fun lvlUp(){
        lvl += 1
        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0
        maxHP = (maxHP * 1.1).toInt()
        nextLvlXP *= 2
        HP = maxHP
        println("Lvl up! Your stats are ${toString()}")
    }

    fun increaseXP(newXP : Int){
        println("Got ${newXP} XP")
        XP += newXP
        while (XP > nextLvlXP) lvlUp()
    }

    private fun deathPenalty() {
        XP /= 2
        HP = (maxHP * 0.05).toInt()
        println("You died! Your stats are ${toString()}")
    }

    fun dropThing(elementIndex: Int) {
        for (i in elementIndex + 1 until backpack.size){
            backpack[i - 1] = backpack[i]
        }
        backpack
    }

    fun storeThing(element: String) {
        if (backpack.size == maxLen)
            print("Backpack is full!")
        else
            backpack.plus(element)
    }
}

fun main(args: Array<String>){
    val player = Player("hero1", "warrior")
    for (i in 0 until 5) player.increaseXP(5)
}
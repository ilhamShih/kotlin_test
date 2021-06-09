package com.testing.com
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.jvm.Throws

class SuccessfulTest {


    /** ---------------------------------------------------------------
     * Тест на соответствие условию вывода списка младше 18
     *
     *
     */
    @Test
    @Throws(Exception::class)
    fun addition_correct() {

        val  person = arrayListOf<User>(
            User("\n Артём = 30",   30)
            ,User("\nМаксим = 20",   20)
            ,User("\nДарья = 14",    14)
            ,User("\nВиктория = 15", 15)
            ,User("\nМария = 17",    17)
            ,User("\nМихаил = 18",   18)
            ,User("\nКирилл = 18",   18)
            ,User("\nАлександр = 20",20)
            ,User("\nВалерия = 25",  25)
            ,User("\nАрина = 33",    33)
            ,User("\nКарина = 15",   15)
            ,User("\nАлиса = 17",    17)
            ,User("\nМилана = 16",   16)
            ,User("\nЕгор = 44",     44)
            ,User("\nТимур = 44",    44)
            ,User("\nНикита = 31",   31)
            ,User("\nЮлия = 18",     18)
        )

        val oldest_1 =  person.asSequence().filter { it.Age < 18 }.map(User::Name ).joinToString()
        val oldest_2 =  person.asSequence().filter { it.Age < 18 }.map(User::Name ).joinToString()
        println("Список соответствует условию младше 18! \n"+"$oldest_1")
        assertEquals("Список соответствует условию младше 18!","$oldest_1","$oldest_2")

    }



}
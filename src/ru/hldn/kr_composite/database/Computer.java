/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Composite                                          *
 * File Name    : Computer.java                                         *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Компоновщик                            *
 *                Наследуемый от ShopItem Компьютер                     *
 ***********************************************************************/

package ru.hldn.kr_composite.database;

/*
Наследуемый от ShopItem Компьютер
*/
public class Computer implements ShopItem{
    
    //поля
    String name;
    int price;
    
    //Конструктор класса
    public Computer(String nm, int pc){
        name = nm;
        price = pc;
    }//Computer(String nm, int pc)

    @Override
    public String getName() {
        return name;
    }//getName()

    @Override
    public int getPrice() {
        return price;
    }//getPrice()
    
}//class Computer

/******************** End Of Computer.java File ********************/
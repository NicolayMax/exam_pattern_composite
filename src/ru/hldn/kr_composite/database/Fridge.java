/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Composite                                          *
 * File Name    : Fridge.java                                           *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Компоновщик                            *
 *                Наследуемый от ShopItem холодильник                   *
 ***********************************************************************/

/*
Наследуемый от ShopItem холодильник
*/
package ru.hldn.kr_composite.database;

public class Fridge implements ShopItem{
    
    //поля
    String name;
    int price;
    
    //Конструктор класса
    public Fridge(String nm, int pc){
        name = nm;
        price = pc;
    }//Fridge(String nm, int pc)

    @Override
    public String getName() {
        return name;
    }//getName()

    @Override
    public int getPrice() {
        return price;
    }//getPrice()
    
}//class Fridge

/******************** End Of Fridge.java File ********************/
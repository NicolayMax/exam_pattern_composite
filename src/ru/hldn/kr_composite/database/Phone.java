/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Composite                                          *
 * File Name    : Phone.java                                            *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Компоновщик                            *
 *                Наследуемый от ShopItem телефон                       *
 ***********************************************************************/

package ru.hldn.kr_composite.database;

/*
Наследуемый от ShopItem телефон
*/
public class Phone implements ShopItem{
    
    //поля
    String name;
    int price;
    
    //Конструктор класса
    public Phone(String nm, int pc){
        name = nm;
        price = pc;
    }//Phone(String nm, int pc)

    @Override
    public String getName() {
        return name;
    }//getName()

    @Override
    public int getPrice() {
        return price;
    }//getPrice()
    
}//class Phone

/******************** End Of Phone.java File ********************/
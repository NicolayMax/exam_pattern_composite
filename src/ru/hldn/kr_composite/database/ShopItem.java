/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Composite                                          *
 * File Name    : ShopItem.java                                         *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Компоновщик                            *
 *                Интерфейс товара                                      *
 ***********************************************************************/

package ru.hldn.kr_composite.database;

/*
Интерфейс товара
*/
public interface ShopItem {
    //Получаем цену и название товара
    public String getName();
    public int getPrice();
}//class ShopItem

/******************** End Of ShopItem.java File ********************/
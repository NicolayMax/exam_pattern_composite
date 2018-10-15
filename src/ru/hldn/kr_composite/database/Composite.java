/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Composite                                          *
 * File Name    : Composite.java                                        *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Компоновщик                            *
 *                Класс - компоновщик товаров                           *
 ***********************************************************************/

package ru.hldn.kr_composite.database;

import java.util.ArrayList;
import java.util.List;

/*
Класс - компоновщик товаров
*/
public class Composite implements ShopItem {

    //Список компонентов заказа
    private List<ShopItem> componenets;
    
    //Конструктор класса Composite
    public Composite(){
        componenets = new ArrayList<>();
    }//Composite()
    
    //Добавление компонента
    public void addComponent(ShopItem item){
        componenets.add(item);
    }//addComponent(ShopItem item)
    
    //Удаление компонента
    public void removeComponent(ShopItem item){
        componenets.remove(item);
    }//removeComponent(ShopItem item)
    
    @Override
    public String getName() {
        String result = "Набор из:\n";
        
        //Собираем строку из названий компонентов
        for(ShopItem item:componenets){
            result = result.concat("\t").concat(item.getName()).concat("\n");
        }
        
        return result;
    }//getName()

    @Override
    public int getPrice() {
        int price = 0;
        
        //Считаем сумму стоимости всех компонентов
        for(ShopItem item:componenets){
            price += item.getPrice();
        }
        
        return price;
    }//getPrice()
    
}//class Composite

/******************** End Of Composite.java File ********************/

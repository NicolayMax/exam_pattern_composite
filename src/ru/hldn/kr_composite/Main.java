/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Composite                                          *
 * File Name    : Main.java                                             *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Компоновщик                            *
 *                Главный класс                                         *
 ***********************************************************************/

package ru.hldn.kr_composite;

import java.util.ArrayList;
import java.util.List;
import ru.hldn.kr_composite.database.Composite;
import ru.hldn.kr_composite.database.Computer;
import ru.hldn.kr_composite.database.Fridge;
import ru.hldn.kr_composite.database.Phone;
import ru.hldn.kr_composite.database.ShopItem;

public class Main {

    //Точка входа в приложение
    public static void main(String[] args) {
        //Создаем заказ
        Composite shopList= new Composite();
        
        //Пользователь набирает покупки
        shopList.addComponent(new Phone("Samsyng Galaxy", 10000));
        shopList.addComponent(new Phone("Nokia 3110", 500));
        shopList.addComponent(new Computer("Commodore 64", 6000));
        shopList.addComponent(new Fridge("ЗИЛ", 5000));
        
        //Создаем сложный заказ
        Composite box = new Composite();
        box.addComponent(new Fridge("ЗИЛ", 5000));
        box.addComponent(new Phone("Nokia 3110", 500));
        shopList.addComponent(box);
        
        //Выводим список покупок и сумму на экран
        System.out.println(shopList.getName());
        System.out.println("Всего к оплате: " + shopList.getPrice() + " руб.");
    }//main()
    
}//class Main

/******************** End Of Main.java File ********************/
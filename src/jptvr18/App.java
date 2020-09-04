/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18;

import entity.ResourseEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App{
    private List<ResourcseEntity> ListPesourrces = new ArrayList<>();
    public void run() {
        System.out.println("--- Менеджер паролей!");
        String repeat = "r";
        do{System.out.println("Выберете задачу");
        System.out.println("0 - выйти из программы");
        System.out.println("1 - добавить ресурс");
        System.out.println("2 - список  ресурсов");
        Scanner scanner = new Scanner (System.in);
        int task = scanner.nextInt();
        switch (task){
            
            case 0:
                repeat = "q";
                break;
            case 1:
                System.out.println("Выберете задачу 1");
                ResourseEntity resourse = new ResourseEntity ();
                resourse.setName ("ivkhk");
                resourse.setIrl  ("https://kutsehariduskeskus.ee/ru");
                resourse.setLogin("admin");
                resourse.setPassword ("123123");
                break;
            case 2:
                System.out.println("Выберете задачу 2");
                System.out.println("Список ресурсов:");
                for(Resourse r: this.list)()
                        System.out.printin(r.toString());
                break;
                
            
        }
            
        }while(!"q".equals(repeat));
        
                
                
        



 
                       
    }
}

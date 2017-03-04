/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.ArrayList;
/**
 *
 * @author osiri
 */
public class MobilePhone {
    //atributos
    private ArrayList<Contact> contacts = new ArrayList<> ();
    
    //constructor
    public MobilePhone (){
    }
    
    //metodos
    public boolean addContact (Contact contact){
        if (this.contacts.contains(contact)){
            return false;
        }else{
            this.contacts.add(contact);
            return true;
        }
    }
    
    public boolean removeContact (Contact contact){
        if (this.contacts.contains(contact)){
            this.contacts.remove(contact);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modifyContact (Contact contact){
        for (int a = 0; a < this.contacts.size(); a++){
            if (this.contacts.get(a).getName() == contact.getName()){
                this.contacts.remove(a);
                this.contacts.add(contact);
                return true;
            }
            if (this.contacts.get(a).getNumber() == contact.getNumber()){
                this.contacts.remove(a);
                this.contacts.add(contact);
                return true;
            }
        }
        return false;
    }
    
    public Contact searchContact (String name){
        for (int a = 0; a < this.contacts.size(); a++){
            if(this.contacts.get(a).getName() == name){
                return this.contacts.get(a);
            }
        }
        return null;
    }
    
    @Override
    public String toString (){
        String b = "";
        for (int a = 0; a < this.contacts.size(); a++){
            if (a == 0){
                b = this.contacts.get(a).toString();
            }else{
                b = b+", "+this.contacts.get(a).toString();
            }
        }
        return "Contacts = ("+b+")";
    }
}

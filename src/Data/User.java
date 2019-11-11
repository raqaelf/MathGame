/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author asus
 */
public class User {
    public String nama;
    private int lives ;
    private int skor;
    public void reset(){
        this.lives = 3;
        this.skor = 0;
    }
    public User(){
        this.lives = 3;
        this.skor = 0;
    }
    public User(String nama){
        this.nama = nama;
    }
    
    public User(int lives, int skor){
        this.lives = lives;
        this.skor = skor;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
    


}

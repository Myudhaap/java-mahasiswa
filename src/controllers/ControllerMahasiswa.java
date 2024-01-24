package controllers;

import model.Mahasiswa;

public class ControllerMahasiswa {
  private Mahasiswa[] dataMahasiswa;

  public ControllerMahasiswa(){
    this.dataMahasiswa = new Mahasiswa[5];
  }

  public void show(){
    int counterMahasiswa = 0;

    for(Mahasiswa mahasiswa: this.dataMahasiswa){
      if(mahasiswa != null){
        mahasiswa.getBiodata();
        counterMahasiswa++;
      }
    }

    if(counterMahasiswa == 0) System.out.println("Tidak terdapat Mahasiswa!");
  }
  
  public void store(String name, String nim, String alamat){
    for(int i = 0; i < this.dataMahasiswa.length; i++){
      if(this.dataMahasiswa[i] == null){
        this.dataMahasiswa[i] = new Mahasiswa(name, nim, alamat);
        break;
      }
    }
  }
  
}

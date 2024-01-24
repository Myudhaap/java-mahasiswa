public class Mahasiswa implements IMahasiswa{
  private String name, nim, alamat;
  public Mahasiswa(String name, String nim, String alamat){
    this.name = name;
    this.nim = nim;
    this.alamat = alamat;
  }

  @Override
  public String[] getBiodata() {
    return new String[] {this.name,this.nim,this.alamat};
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getNim() {
    return this.nim;
  }

  @Override
  public String getAlamat() {
    return this.alamat;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setNim(String nim) {
    this.nim = nim;
  }

  @Override
  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }
}

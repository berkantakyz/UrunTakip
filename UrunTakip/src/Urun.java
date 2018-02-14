/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class Urun {
    private String barkodNo,urunAd ;
    private int stok ;
    private float alisFiyat,satisFiyat;
    
    public Urun(String barkodNo , String urunAd , int stok , float alisFiyat,float satisFiyat)
    {
      this.barkodNo=barkodNo;
      this.urunAd=urunAd;
      this.stok=stok;
      this.alisFiyat=alisFiyat;
      this.satisFiyat=satisFiyat;
    }

    Urun(int aInt, String string, String string0, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getbarkodNo()
    {
        return barkodNo ;
    }
    public String geturunAd()
    {
        return urunAd ;
    }
    public int getstok()
    {
        return stok ;
    }
    public float getalisFiyat()
    {
        return alisFiyat ;
    }
     public float getsatisFiyat()
    {
        return satisFiyat ;
    }
    
    
}

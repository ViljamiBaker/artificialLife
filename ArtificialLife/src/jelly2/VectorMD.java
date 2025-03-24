package src.Jelly;
// a basic class I made for many of my projects with java
// makes some math easier
public class VectorMD {
   public double M;
   public double D;
   
   public VectorMD(double M, double D){
      this.M = M;
      this.D = D;
   }
   
   public Vector2D convert(){
      return new Vector2D(Math.sin(this.D)*this.M,Math.cos(this.D)*this.M);
   }
   
   public VectorMD clone(){
      return new VectorMD(this.M, this.D);
   }
   public VectorMD addM(VectorMD other){
      return new VectorMD(this.M + other.M, this.D);
   }
   public VectorMD addD(VectorMD other){
      return new VectorMD(this.M, this.D + other.D);
   }
   public VectorMD addA(VectorMD other){
      return this.convert().add(other.convert()).convert();
   }
   public VectorMD addMD(Double other){
      return new VectorMD(this.M+other, this.D);
   }
   public VectorMD addDD(Double other){
      return new VectorMD(this.M, this.D+other);
   }
   public VectorMD mult(Double other){
      return new VectorMD(this.M*other, this.D);
   }
   public VectorMD i(){
      return new VectorMD(this.M, this.D+Math.PI);
   }
   public VectorMD normal(){
      return new VectorMD(1,this.D);
   }
}
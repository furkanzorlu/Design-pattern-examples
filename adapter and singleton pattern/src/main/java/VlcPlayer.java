public class VlcPlayer implements AdvancedMediaPlayer{
    SingleObject object = SingleObject.getInstance();
   @Override
   
   public void playVlc(String fileName) {
      object.showMessage();
         System.out.println( fileName);	
   }

   @Override
   public void playMp4(String fileName) {
     
   }
}
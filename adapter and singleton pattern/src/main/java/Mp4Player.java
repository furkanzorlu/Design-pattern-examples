public class Mp4Player implements AdvancedMediaPlayer{
SingleObject object = SingleObject.getInstance();
   @Override
   public void playVlc(String fileName) {
      
   }

   @Override
   public void playMp4(String fileName) {
      object.showMessage();
         System.out.println( fileName);	
   }
}
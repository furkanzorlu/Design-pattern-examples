public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter; 
  SingleObject object = SingleObject.getInstance();
   @Override
   public void play(String audioType, String fileName) {		

     
      if(audioType.equalsIgnoreCase("mp3")){
          object.showMessage();
         System.out.println( fileName);
           
      } 
      
     
      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      
      else{
         System.out.println("Invalid media. " + audioType + " format not supported");
      }
   }   
}
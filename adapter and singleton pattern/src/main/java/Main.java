public class Main {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
      SingleObject object = SingleObject.getInstance();
      
      audioPlayer.play("mp3", "tarkan.mp3");
      audioPlayer.play("mp4", "ferdi.mp4");
      audioPlayer.play("vlc", "müslüm.vlc");
      audioPlayer.play("AAC", "orhan.AAC ");
      
   }
}
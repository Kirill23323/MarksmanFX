package labs.marksman_game;

public class Utils {
    
    public static class ArrowState {
        public boolean visible;
        public double posX;
    
        ArrowState() {
          visible = false;
          posX = 0.0;
        }
    
        ArrowState(boolean visible, double pos) {
          this.visible = visible;
          this.posX = pos;
        }
    }

    public static class ArrowStateArray {
        public ArrowState[] arr;
    
        ArrowStateArray(int n) {
          arr = new ArrowState[n];
          for (int i = 0; i < n; i++) {
            arr[i] = new ArrowState();
          }
        }
    }
}

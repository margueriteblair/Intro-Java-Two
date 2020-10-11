public class UIControl {
    public static void main(String[] args) {

        private boolean isEnabled = true;

        public UIControl(boolean isEnabled) {
            this.isEnabled = isEnabled;
            System.out.println("UI Control");
        }

        public void enable() {
            isEnabled = true;
        }

        public void disable() {
            isEnabled = false;
        }
    }
}
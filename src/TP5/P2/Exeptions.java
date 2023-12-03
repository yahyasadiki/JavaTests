// Exeptions.java
package TP5.P2;

public class Exeptions {
    public static class CapaciteMaximaleAtteinteException extends Exception {
        public CapaciteMaximaleAtteinteException(String message) {
            super(message);
        }
    }

    public static class PositionInvalideException extends Exception {
        public PositionInvalideException(String message) {
            super(message);
        }
    }

    public static class EtagereException extends Exception {
        public EtagereException(String message) {
            super(message);
        }
    }
}

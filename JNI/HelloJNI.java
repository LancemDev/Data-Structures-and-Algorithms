package JNI;

public class HelloJNI {
    // Native method declaration
    public native void sayHello();
    
    static {
        // Load the native library when the class is loaded
        System.loadLibrary("HelloJNI");
    }
    
    public static void main(String[] args) {
        // Create an instance of HelloJNI and call the native method
        HelloJNI helloJNI = new HelloJNI();
        helloJNI.sayHello();
    }
}

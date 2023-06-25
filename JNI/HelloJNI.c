// Compile: gcc -shared -fpic -o libHelloJNI.so HelloJNI.c
// Run: java -Djava.library.path=. HelloJNI


#include <stdio.h>
#include "HelloJNI.h"

JNIEXPORT void JNICALL Java_HelloJNI_sayHello(JNIEnv *env, jobject obj) {
    printf("Hello from JNI!\n");
}

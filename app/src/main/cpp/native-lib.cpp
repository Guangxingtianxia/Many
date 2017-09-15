//
// Created by mr_zhou on 2017/9/12.
//
#include<jni.h>
#include<string>
extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_zhou_delete_view_activity_Jni1Activity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = " 存天道，灭人欲";
    return env->NewStringUTF(hello.c_str());

}
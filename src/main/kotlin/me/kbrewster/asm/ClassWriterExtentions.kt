package me.kbrewster.asm

import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter

inline fun classWriter(lambda: ClassWriterBuilder.() -> Unit) =
    ClassWriterBuilder().apply(lambda).build()


class ClassWriterBuilder(var classReader: ClassReader? = null,
                              var flags: Int = 0) {
    fun build() = ClassWriter(classReader, flags)
}
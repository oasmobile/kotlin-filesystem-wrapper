import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    `java-library`
    `maven-publish`
}

group = "com.oasis.mlib"
version = "v0.0.1"

repositories {
    mavenCentral()
    mavenLocal()
    maven(url = "https://jitpack.io")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("com.github.oasmobile:kotlin-utils:0.0.4")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

publishing {
    publications {
        create<MavenPublication>("KotlinFilesystemWrapper") {
            artifactId = "KotlinFilesystemWrapper"
            from(components["java"])
            pom {
                name.set("Kotlin Filesytem Wrapper")
                description.set("oasis mlib kotlin file system wrapper library")
                url.set("https://github.com/oasmobile/kotlin-filesystem-wrapper")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("zhangxuchang")
                        name.set("ZHANG XUCHANG")
                        email.set("zhangxuchang@oasgames.com")
                    }
                }
            }
        }
    }
    repositories {
        maven {
            name = "KotlinFilesystemWrapper"
            url = uri(layout.buildDirectory.dir("repo"))
        }
    }
}
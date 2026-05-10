package composeicons.generator.core

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isGreaterThanOrEqualTo
import assertk.assertions.isLessThan
import assertk.assertions.isLessThanOrEqualTo
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.Test
import java.io.File

class R8SizeTest {
    private val baselineDir: File
        get() {
            val fromEnv = System.getenv("COMPOSE_ICONS_PROJECT_ROOT")
            val root = if (fromEnv != null) File(fromEnv)
                       else File(System.getProperty("user.dir")).let { if (it.name == "core") it.parentFile?.parentFile else it } ?: File(System.getProperty("user.dir"))
            return root.resolve("generator/core/src/test/baselines/r8-size")
        }

    private val projectRoot: File
        get() {
            val fromEnv = System.getenv("COMPOSE_ICONS_PROJECT_ROOT")
            return if (fromEnv != null) File(fromEnv)
                   else File(System.getProperty("user.dir")).let { if (it.name == "core") it.parentFile?.parentFile else it } ?: File(System.getProperty("user.dir"))
        }

    @Test
    fun `tabler all flavor APK size within threshold`() {
        val apkSize = measureApkSize("all")
        val baselineFile = baselineDir.resolve("tabler-all.txt")

        assumeTrue(apkSize > 0, "All flavor APK must exist to run this test")
        assumeTrue(baselineFile.exists(), "Baseline file must exist to run this test")

        val baseline = baselineFile.readText().trim().toLong()
        val threshold = (baseline * 0.05).toLong() // 5% allowance

        assertAll {
            assertThat(apkSize).isGreaterThanOrEqualTo(baseline - threshold)
            assertThat(apkSize).isLessThanOrEqualTo(baseline + threshold)
        }
    }

    @Test
    fun `tabler zero flavor APK size within threshold`() {
        val apkSize = measureApkSize("zero")
        val baselineFile = baselineDir.resolve("tabler-zero.txt")

        assumeTrue(apkSize > 0, "Zero flavor APK must exist to run this test")
        assumeTrue(baselineFile.exists(), "Baseline file must exist to run this test")

        val baseline = baselineFile.readText().trim().toLong()
        val threshold = (baseline * 0.05).toLong() // 5% allowance

        assertAll {
            assertThat(apkSize).isGreaterThanOrEqualTo(baseline - threshold)
            assertThat(apkSize).isLessThanOrEqualTo(baseline + threshold)
        }
    }

    @Test
    fun `zero flavor smaller than all flavor`() {
        val zeroApk = measureApkSize("zero")
        val allApk = measureApkSize("all")

        assumeTrue(zeroApk > 0 && allApk > 0, "Both zero and all flavor APKs must exist")

        assertThat(zeroApk).isLessThan(allApk)
    }

    private fun measureApkSize(flavor: String): Long {
        val apkDir = projectRoot.resolve("sample/build/outputs/apk/$flavor/release")
        val apk = apkDir.listFiles()?.firstOrNull { it.name.endsWith(".apk") }
        return apk?.length() ?: 0L
    }
}

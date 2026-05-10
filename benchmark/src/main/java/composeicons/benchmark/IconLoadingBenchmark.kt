package composeicons.benchmark

import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.ext.junit.runners.AndroidJUnit4
import composeicons.tabler.TablerIcons
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class IconLoadingBenchmark {

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    @Test
    fun loadSingleIcon() {
        benchmarkRule.measureRepeated {
            // Accessing the extension property triggers lazy initialization
            val icon = TablerIcons.Outline.Home
        }
    }

    @Test
    fun loadAllTablerIcons() {
        benchmarkRule.measureRepeated {
            // Measure total time to load all outline icons
            // Note: This uses reflection which adds overhead
            TablerIcons.Outline::class.memberProperties.forEach {
                it.getter.call(TablerIcons.Outline)
            }
        }
    }
}

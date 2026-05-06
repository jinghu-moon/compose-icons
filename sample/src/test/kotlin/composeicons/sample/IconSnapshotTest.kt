package composeicons.sample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.captureRoboImage
import composeicons.lucide.LucideIcons
import composeicons.lucide.outline.Activity
import composeicons.tabler.TablerIcons
import composeicons.tabler.outline.AB
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Pixel-level screenshot regression tests for representative icons.
 *
 * - Powered by Roborazzi (Robolectric-backed JVM rendering, AGP-version-stable).
 * - Replaces previous Paparazzi-based test which broke on AGP 9.x due to
 *   removed `BaseExtension` API.
 *
 * Snapshots stored at sample/src/test/snapshots/. To re-record:
 *   ./gradlew :sample:recordRoborazziDebug
 * To verify (CI):
 *   ./gradlew :sample:verifyRoborazziDebug
 */
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [33], qualifiers = "w360dp-h640dp-xhdpi")
class IconSnapshotTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun tablerOutlineAB() {
        composeTestRule.setContent {
            Box(Modifier.padding(16.dp)) {
                Icon(
                    imageVector = TablerIcons.Outline.AB,
                    contentDescription = null,
                    modifier = Modifier.size(48.dp),
                    tint = Color.Black,
                )
            }
        }
        composeTestRule.onRoot().captureRoboImage(filePath = "src/test/snapshots/tabler_outline_ab.png")
    }

    @Test
    fun lucideOutlineActivity() {
        composeTestRule.setContent {
            Box(Modifier.padding(16.dp)) {
                Icon(
                    imageVector = LucideIcons.Outline.Activity,
                    contentDescription = null,
                    modifier = Modifier.size(48.dp),
                    tint = Color.Black,
                )
            }
        }
        composeTestRule.onRoot().captureRoboImage(filePath = "src/test/snapshots/lucide_outline_activity.png")
    }
}

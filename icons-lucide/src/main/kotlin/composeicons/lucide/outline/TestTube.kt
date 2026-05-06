package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = lucideOutlineIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.5 2v17.5C14.5 20.9 13.4 22 12 22 10.6 22 9.5 20.9 9.5 19.5v-17.5")
            addPathData("M8.5 2h7")
            addPathData("M14.5 16h-5")
        }
        return _testTube!!
    }

private var _testTube: ImageVector? = null

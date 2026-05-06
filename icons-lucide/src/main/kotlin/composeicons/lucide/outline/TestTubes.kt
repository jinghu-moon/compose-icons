package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TestTubes: ImageVector
    get() {
        if (_testTubes != null) return _testTubes!!
        _testTubes = lucideOutlineIcon(
            name = "TestTubes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 2v17.5C9 20.881 7.881 22 6.5 22 5.119 22 4 20.881 4 19.5v-17.5")
            addPathData("M20 2v17.5C20 20.881 18.881 22 17.5 22 16.119 22 15 20.881 15 19.5v-17.5")
            addPathData("M3 2h7")
            addPathData("M14 2h7")
            addPathData("M9 16h-5")
            addPathData("M20 16h-5")
        }
        return _testTubes!!
    }

private var _testTubes: ImageVector? = null

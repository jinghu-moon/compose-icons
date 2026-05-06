package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TestTubeDiagonal: ImageVector
    get() {
        if (_testTubeDiagonal != null) return _testTubeDiagonal!!
        _testTubeDiagonal = lucideOutlineIcon(
            name = "TestTubeDiagonal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 7 6.82 21.18C5.713 22.274 3.931 22.27 2.83 21.17c-1.104-1.105-1.104-2.895 0-4L17 3")
            addPathData("M16 2l6 6")
            addPathData("M12 16h-8")
        }
        return _testTubeDiagonal!!
    }

private var _testTubeDiagonal: ImageVector? = null

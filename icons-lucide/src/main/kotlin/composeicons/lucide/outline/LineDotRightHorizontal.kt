package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LineDotRightHorizontal: ImageVector
    get() {
        if (_lineDotRightHorizontal != null) return _lineDotRightHorizontal!!
        _lineDotRightHorizontal = lucideOutlineIcon(
            name = "LineDotRightHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h12")
            addPathData("M21 12c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _lineDotRightHorizontal!!
    }

private var _lineDotRightHorizontal: ImageVector? = null

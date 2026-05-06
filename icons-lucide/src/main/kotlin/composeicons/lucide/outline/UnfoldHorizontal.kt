package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UnfoldHorizontal: ImageVector
    get() {
        if (_unfoldHorizontal != null) return _unfoldHorizontal!!
        _unfoldHorizontal = lucideOutlineIcon(
            name = "UnfoldHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12h6")
            addPathData("M8 12h-6")
            addPathData("M12 2v2")
            addPathData("M12 8v2")
            addPathData("M12 14v2")
            addPathData("M12 20v2")
            addPathData("M19 15l3-3L19 9")
            addPathData("M5 9 2 12l3 3")
        }
        return _unfoldHorizontal!!
    }

private var _unfoldHorizontal: ImageVector? = null

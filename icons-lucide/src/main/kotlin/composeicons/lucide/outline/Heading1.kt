package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Heading1: ImageVector
    get() {
        if (_heading1 != null) return _heading1!!
        _heading1 = lucideOutlineIcon(
            name = "Heading1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h8")
            addPathData("M4 18v-12")
            addPathData("M12 18v-12")
            addPathData("M17 12l3-2v8")
        }
        return _heading1!!
    }

private var _heading1: ImageVector? = null

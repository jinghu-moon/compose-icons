package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Heading: ImageVector
    get() {
        if (_heading != null) return _heading!!
        _heading = lucideOutlineIcon(
            name = "Heading",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12h12")
            addPathData("M6 20v-16")
            addPathData("M18 20v-16")
        }
        return _heading!!
    }

private var _heading: ImageVector? = null

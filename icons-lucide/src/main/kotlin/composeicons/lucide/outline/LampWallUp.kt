package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampWallUp: ImageVector
    get() {
        if (_lampWallUp != null) return _lampWallUp!!
        _lampWallUp = lucideOutlineIcon(
            name = "LampWallUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.929 9.629c.123 .308 .085 .657-.101 .932-.186 .275-.496 .439-.828 .439h-10c-.332-0-.642-.165-.827-.439-.186-.275-.224-.624-.101-.932l2-5C10.224 4.249 10.591 4 11 4h6c.409 0 .776 .249 .928 .629Z")
            addPathData("M6 15c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-1C4.448 21 4 20.552 4 20v-4c0-.552 .448-1 1-1Z")
            addPathData("M8 18h4c1.105 0 2-.895 2-2v-5")
        }
        return _lampWallUp!!
    }

private var _lampWallUp: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampWallDown: ImageVector
    get() {
        if (_lampWallDown != null) return _lampWallDown!!
        _lampWallDown = lucideOutlineIcon(
            name = "LampWallDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.929 18.629c.123 .308 .085 .657-.101 .932-.186 .275-.496 .439-.828 .439h-10c-.332-0-.642-.165-.827-.439-.186-.275-.224-.624-.101-.932l2-5c.152-.38 .519-.629 .928-.629h6c.409 0 .776 .249 .928 .629Z")
            addPathData("M6 3c1.105 0 2 .895 2 2v2C8 8.105 7.105 9 6 9h-1C4.448 9 4 8.552 4 8v-4C4 3.448 4.448 3 5 3Z")
            addPathData("M8 6h4c1.105 0 2 .895 2 2v5")
        }
        return _lampWallDown!!
    }

private var _lampWallDown: ImageVector? = null

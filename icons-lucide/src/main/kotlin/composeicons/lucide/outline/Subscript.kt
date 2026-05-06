package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Subscript: ImageVector
    get() {
        if (_subscript != null) return _subscript!!
        _subscript = lucideOutlineIcon(
            name = "Subscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5l8 8")
            addPathData("M12 5 4 13")
            addPathData("M20 19h-4c0-1.5 .44-2 1.5-2.5C18.56 16 20 15.33 20 14c0-.47-.17-.93-.48-1.29-.66-.747-1.752-.931-2.62-.44-.42 .24-.74 .62-.9 1.07")
        }
        return _subscript!!
    }

private var _subscript: ImageVector? = null

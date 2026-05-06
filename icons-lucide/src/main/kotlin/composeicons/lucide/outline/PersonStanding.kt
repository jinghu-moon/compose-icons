package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PersonStanding: ImageVector
    get() {
        if (_personStanding != null) return _personStanding!!
        _personStanding = lucideOutlineIcon(
            name = "PersonStanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 5c0 .552-.448 1-1 1C11.448 6 11 5.552 11 5c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M9 20l3-6 3 6")
            addPathData("M6 8l6 2L18 8")
            addPathData("M12 10v4")
        }
        return _personStanding!!
    }

private var _personStanding: ImageVector? = null

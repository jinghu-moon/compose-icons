package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dam: ImageVector
    get() {
        if (_dam != null) return _dam!!
        _dam = lucideOutlineIcon(
            name = "Dam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 11.31c1.17 .56 1.54 1.69 3.5 1.69 2.5 0 2.5-2 5-2 1.3 0 1.9 .5 2.5 1")
            addPathData("M11.75 18c.35 .5 1.45 1 2.75 1 2.5 0 2.5-2 5-2 1.3 0 1.9 .5 2.5 1")
            addPathData("M2 10h4")
            addPathData("M2 14h4")
            addPathData("M2 18h4")
            addPathData("M2 6h4")
            addPathData("M7 3C6.448 3 6 3.448 6 4v16c0 .552 .448 1 1 1h4c.552 0 1-.448 1-1L10 4C10 3.448 9.552 3 9 3Z")
        }
        return _dam!!
    }

private var _dam: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Languages: ImageVector
    get() {
        if (_languages != null) return _languages!!
        _languages = lucideOutlineIcon(
            name = "Languages",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 8l6 6")
            addPathData("M4 14 10 8 12 5")
            addPathData("M2 5h12")
            addPathData("M7 2h1")
            addPathData("M22 22 17 12 12 22")
            addPathData("M14 18h6")
        }
        return _languages!!
    }

private var _languages: ImageVector? = null

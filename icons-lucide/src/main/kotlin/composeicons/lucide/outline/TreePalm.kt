package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = lucideOutlineIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 8C13 5.24 10.54 3 7.5 3 4.46 3 2 5.24 2 8h2L5 7 6 8h4")
            addPathData("M13 7.14C14.013 6.391 15.241 5.991 16.5 6 19.54 6 22 8.24 22 11h-3L18 10l-1 1h-3")
            addPathData("M5.89 9.71c-2.15 2.15-2.3 5.47-.35 7.43L9.78 12.89l.7-.7 .71-.71L13.31 9.36C11.36 7.4 8.04 7.56 5.89 9.71")
            addPathData("M11 15.5C11.5 18 10.83 20 10 22h4C16 16.5 13.5 10 13 8")
        }
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null

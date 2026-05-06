package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListRestart: ImageVector
    get() {
        if (_listRestart != null) return _listRestart!!
        _listRestart = lucideOutlineIcon(
            name = "ListRestart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5h-18")
            addPathData("M7 12h-4")
            addPathData("M7 19h-4")
            addPathData("M12 18c1.291 1.722 3.539 2.424 5.581 1.743C19.623 19.063 21 17.152 21 15c0-2.485-2.015-4.5-4.5-4.5-1.33 0-2.54 .54-3.41 1.41L11 14")
            addPathData("M11 10v4h4")
        }
        return _listRestart!!
    }

private var _listRestart: ImageVector? = null

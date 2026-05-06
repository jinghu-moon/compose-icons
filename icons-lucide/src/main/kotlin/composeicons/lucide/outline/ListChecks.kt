package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = lucideOutlineIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 5h8")
            addPathData("M13 12h8")
            addPathData("M13 19h8")
            addPathData("M3 17l2 2L9 15")
            addPathData("M3 7 5 9 9 5")
        }
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null

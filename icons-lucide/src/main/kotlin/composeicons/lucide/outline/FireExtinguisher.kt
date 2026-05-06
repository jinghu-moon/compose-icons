package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = lucideOutlineIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 6.5v-3.5C15 2.448 14.552 2 14 2h-2c-.552 0-1 .448-1 1v3.5")
            addPathData("M9 18h8")
            addPathData("M18 3h-3")
            addPathData("M11 3C7.686 3 5 5.686 5 9v11")
            addPathData("M5 13h4")
            addPathData("M17 10C17 7.791 15.209 6 13 6 10.791 6 9 7.791 9 10v10c0 1.105 .895 2 2 2h4c1.105 0 2-.895 2-2Z")
        }
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null

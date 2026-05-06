package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronsUpDown: ImageVector
    get() {
        if (_chevronsUpDown != null) return _chevronsUpDown!!
        _chevronsUpDown = lucideOutlineIcon(
            name = "ChevronsUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 15l5 5 5-5")
            addPathData("M7 9 12 4l5 5")
        }
        return _chevronsUpDown!!
    }

private var _chevronsUpDown: ImageVector? = null

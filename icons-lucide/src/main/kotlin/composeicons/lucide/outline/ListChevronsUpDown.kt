package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListChevronsUpDown: ImageVector
    get() {
        if (_listChevronsUpDown != null) return _listChevronsUpDown!!
        _listChevronsUpDown = lucideOutlineIcon(
            name = "ListChevronsUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h8")
            addPathData("M3 12h8")
            addPathData("M3 19h8")
            addPathData("M15 8 18 5l3 3")
            addPathData("M15 16l3 3 3-3")
        }
        return _listChevronsUpDown!!
    }

private var _listChevronsUpDown: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BrushCleaning: ImageVector
    get() {
        if (_brushCleaning != null) return _brushCleaning!!
        _brushCleaning = lucideOutlineIcon(
            name = "BrushCleaning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 22 15 18")
            addPathData("M19 14c.552 0 1-.448 1-1v-1c0-1.105-.895-2-2-2h-3c-.552 0-1-.448-1-1v-5C14 2.895 13.105 2 12 2c-1.105 0-2 .895-2 2v5c0 .552-.448 1-1 1h-3c-1.105 0-2 .895-2 2v1c0 .552 .448 1 1 1")
            addPathData("M19 14h-14L3.027 20.767c-.071 .298-.002 .612 .187 .852 .19 .24 .479 .381 .786 .381h16c.306 0 .596-.14 .786-.381 .19-.24 .259-.555 .187-.852Z")
            addPathData("M8 22 9 18")
        }
        return _brushCleaning!!
    }

private var _brushCleaning: ImageVector? = null

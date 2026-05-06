package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = lucideOutlineIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 11l11 .9c.513 .101 .862 .581 .8 1.1l-.665 4.158c-.078 .485-.496 .842-.988 .842h-.147")
            addPathData("M16 18h-5")
            addPathData("M18 5c-.552 0-1 .448-1 1v5.573")
            addPathData("M3 4h8.129c.499 0 .922 .369 .99 .863L13 11.246")
            addPathData("M4 11v-7")
            addPathData("M7 15h.01")
            addPathData("M8 10.1v-6.1")
            addPathData("M20 18c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M12 15c0 2.761-2.239 5-5 5C4.239 20 2 17.761 2 15 2 12.239 4.239 10 7 10c2.761 0 5 2.239 5 5Z")
        }
        return _tractor!!
    }

private var _tractor: ImageVector? = null

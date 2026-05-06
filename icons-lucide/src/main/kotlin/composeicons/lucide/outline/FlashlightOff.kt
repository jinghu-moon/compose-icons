package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlashlightOff: ImageVector
    get() {
        if (_flashlightOff != null) return _flashlightOff!!
        _flashlightOff = lucideOutlineIcon(
            name = "FlashlightOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.652 6h6.348")
            addPathData("M12 13v1")
            addPathData("M16 16v4c0 1.105-.895 2-2 2h-4C8.895 22 8 21.105 8 20v-8C8 11.135 7.719 10.292 7.2 9.6L6.6 8.8C6.211 8.281 6 7.649 6 7v-1")
            addPathData("M2 2 22 22")
            addPathData("M7.649 2h9.351c.552 0 1 .448 1 1v4c0 .649-.211 1.281-.6 1.8l-.6 .8c-.231 .307-.416 .647-.55 1.007")
        }
        return _flashlightOff!!
    }

private var _flashlightOff: ImageVector? = null

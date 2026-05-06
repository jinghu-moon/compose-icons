package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PinOff: ImageVector
    get() {
        if (_pinOff != null) return _pinOff!!
        _pinOff = lucideOutlineIcon(
            name = "PinOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v5")
            addPathData("M15 9.34v-2.34c0-.552 .448-1 1-1 1.105 0 2-.895 2-2C18 2.895 17.105 2 16 2h-8.11")
            addPathData("M2 2 22 22")
            addPathData("M9 9v1.76c-0 .759-.43 1.452-1.11 1.79l-1.78 .9C5.43 13.788 5 14.481 5 15.24v.76c0 .552 .448 1 1 1h11")
        }
        return _pinOff!!
    }

private var _pinOff: ImageVector? = null

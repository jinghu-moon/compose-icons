package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = lucideOutlineIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 17h2c.6 0 1-.4 1-1v-3c0-.9-.7-1.7-1.5-1.9C18.7 10.6 16 10 16 10 16 10 14.7 8.6 13.8 7.7 13.3 7.3 12.7 7 12 7h-7C4.4 7 3.9 7.4 3.6 7.9L2.2 10.8C2.068 11.186 2 11.592 2 12v4c0 .6 .4 1 1 1h2")
            addPathData("M9 17c0 1.105-.895 2-2 2C5.895 19 5 18.105 5 17c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M9 17h6")
            addPathData("M19 17c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _car!!
    }

private var _car: ImageVector? = null

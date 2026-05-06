package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ScreenShareOff: ImageVector
    get() {
        if (_screenShareOff != null) return _screenShareOff!!
        _screenShareOff = lucideOutlineIcon(
            name = "ScreenShareOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 3h-9C2.895 3 2 3.895 2 5v10c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-3")
            addPathData("M8 21h8")
            addPathData("M12 17v4")
            addPathData("M22 3 17 8")
            addPathData("M17 3l5 5")
        }
        return _screenShareOff!!
    }

private var _screenShareOff: ImageVector? = null

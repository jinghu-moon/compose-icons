package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = lucideOutlineIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 17c0-1.105-.895-2-2-2h-14c-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-2Z")
            addPathData("M6 15v-2")
            addPathData("M12 15v-6")
            addPathData("M15 6c0 1.657-1.343 3-3 3C10.343 9 9 7.657 9 6 9 4.343 10.343 3 12 3c1.657 0 3 1.343 3 3Z")
        }
        return _joystick!!
    }

private var _joystick: ImageVector? = null

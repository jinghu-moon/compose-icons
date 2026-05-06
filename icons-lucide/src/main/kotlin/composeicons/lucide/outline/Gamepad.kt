package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gamepad: ImageVector
    get() {
        if (_gamepad != null) return _gamepad!!
        _gamepad = lucideOutlineIcon(
            name = "Gamepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12h4")
            addPathData("M8 10v4")
            addPathData("M15 13h.01")
            addPathData("M18 11h.01")
            addPathData("M4 6h16c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-16C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6Z")
        }
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null

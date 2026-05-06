package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gamepad2: ImageVector
    get() {
        if (_gamepad2 != null) return _gamepad2!!
        _gamepad2 = lucideOutlineIcon(
            name = "Gamepad2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 11h4")
            addPathData("M8 9v4")
            addPathData("M15 12h.01")
            addPathData("M18 10h.01")
            addPathData("M17.32 5h-10.64C4.63 5 2.912 6.551 2.702 8.59c-.006 .052-.01 .101-.017 .152C2.604 9.416 2 14.456 2 16c0 1.657 1.343 3 3 3 1 0 1.5-.5 2-1L8.414 16.586c.375-.375 .884-.586 1.414-.586h4.344c.53 0 1.039 .211 1.414 .586L17 18c.5 .5 1 1 2 1 1.657 0 3-1.343 3-3 0-1.545-.604-6.584-.685-7.258-.007-.05-.011-.1-.017-.151C21.088 6.551 19.37 5.001 17.32 5Z")
        }
        return _gamepad2!!
    }

private var _gamepad2: ImageVector? = null

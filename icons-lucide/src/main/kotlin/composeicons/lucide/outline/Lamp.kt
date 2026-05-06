package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = lucideOutlineIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v6")
            addPathData("M4.077 10.615c-.129 .309-.095 .661 .091 .94 .185 .278 .498 .445 .832 .445h14c.334 0 .647-.167 .832-.445 .185-.278 .22-.631 .091-.94L16.846 3.231C16.536 2.486 15.807 2 15 2h-6C8.193 2 7.465 2.485 7.154 3.23Z")
            addPathData("M8 20c0-1.105 .895-2 2-2h4c1.105 0 2 .895 2 2v1c0 .552-.448 1-1 1h-6C8.448 22 8 21.552 8 21Z")
        }
        return _lamp!!
    }

private var _lamp: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pin: ImageVector
    get() {
        if (_pin != null) return _pin!!
        _pin = lucideOutlineIcon(
            name = "Pin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v5")
            addPathData("M9 10.76c-0 .759-.43 1.452-1.11 1.79l-1.78 .9C5.43 13.788 5 14.481 5 15.24v.76c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-.76c-0-.759-.43-1.452-1.11-1.79l-1.78-.9C15.43 12.212 15 11.519 15 10.76v-3.76c0-.552 .448-1 1-1 1.105 0 2-.895 2-2C18 2.895 17.105 2 16 2h-8C6.895 2 6 2.895 6 4c0 1.105 .895 2 2 2 .552 0 1 .448 1 1Z")
        }
        return _pin!!
    }

private var _pin: ImageVector? = null

package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = lucideOutlineIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.8 19.6c.696 .522 1.65 .534 2.359 .03 .709-.504 1.011-1.409 .746-2.238C15.641 16.563 14.87 16 14 16h-12")
            addPathData("M17.5 8c.705-.941 1.971-1.262 3.04-.773 1.069 .489 1.653 1.657 1.403 2.806C21.692 11.181 20.676 12 19.5 12h-17.5")
            addPathData("M9.8 4.4c.696-.522 1.65-.534 2.359-.03 .709 .504 1.011 1.409 .746 2.238C12.641 7.437 11.87 8 11 8h-9")
        }
        return _wind!!
    }

private var _wind: ImageVector? = null

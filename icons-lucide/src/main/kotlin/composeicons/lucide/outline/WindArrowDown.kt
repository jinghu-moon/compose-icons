package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WindArrowDown: ImageVector
    get() {
        if (_windArrowDown != null) return _windArrowDown!!
        _windArrowDown = lucideOutlineIcon(
            name = "WindArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2v8")
            addPathData("M12.8 21.6c.696 .522 1.65 .534 2.359 .03 .709-.504 1.011-1.409 .746-2.238C15.641 18.563 14.87 18 14 18h-12")
            addPathData("M17.5 10c.705-.941 1.971-1.262 3.04-.773 1.069 .489 1.653 1.657 1.403 2.806C21.692 13.181 20.676 14 19.5 14h-17.5")
            addPathData("M6 6l4 4L14 6")
        }
        return _windArrowDown!!
    }

private var _windArrowDown: ImageVector? = null

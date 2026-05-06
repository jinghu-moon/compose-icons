package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Brain: ImageVector
    get() {
        if (_brain != null) return _brain!!
        _brain = lucideOutlineIcon(
            name = "Brain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18v-13")
            addPathData("M15 13C13.223 12.481 12.001 10.851 12 9c-.001 1.851-1.223 3.481-3 4")
            addPathData("M17.598 6.5c.631-1.092 .511-2.462-.3-3.428C16.487 2.105 15.159 1.749 13.974 2.181 12.789 2.612 12 3.739 12 5 12 3.739 11.211 2.612 10.026 2.181 8.841 1.749 7.513 2.105 6.702 3.072c-.811 .966-.931 2.336-.3 3.428")
            addPathData("M17.997 5.125c1.191 .306 2.175 1.143 2.668 2.27 .493 1.127 .441 2.417-.142 3.5")
            addPathData("M18 18c1.81-0 3.395-1.216 3.864-2.965C22.332 13.287 21.568 11.441 20 10.536")
            addPathData("M19.967 17.483c.191 1.478-.455 2.939-1.677 3.792-1.222 .853-2.816 .957-4.138 .268C12.831 20.856 12.002 19.49 12 18c-.002 1.49-.831 2.856-2.153 3.544-1.322 .688-2.916 .585-4.138-.268C4.488 20.422 3.842 18.961 4.033 17.483")
            addPathData("M6 18C4.19 18 2.605 16.784 2.136 15.035 1.668 13.287 2.432 11.441 4 10.536")
            addPathData("M6.003 5.125C4.812 5.431 3.828 6.268 3.335 7.395c-.493 1.127-.441 2.417 .142 3.5")
        }
        return _brain!!
    }

private var _brain: ImageVector? = null

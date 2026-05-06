package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClockArrowDown: ImageVector
    get() {
        if (_clockArrowDown != null) return _clockArrowDown!!
        _clockArrowDown = lucideOutlineIcon(
            name = "ClockArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v6l2 1")
            addPathData("M12.337 21.994C8.152 22.135 4.322 19.653 2.741 15.775 1.16 11.898 2.162 7.446 5.253 4.62 8.343 1.794 12.867 1.193 16.588 3.114c3.721 1.921 5.851 5.957 5.337 10.113")
            addPathData("M14 18l4 4 4-4")
            addPathData("M18 14v8")
        }
        return _clockArrowDown!!
    }

private var _clockArrowDown: ImageVector? = null

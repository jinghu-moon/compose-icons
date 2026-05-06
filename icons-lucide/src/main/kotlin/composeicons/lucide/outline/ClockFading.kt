package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClockFading: ImageVector
    get() {
        if (_clockFading != null) return _clockFading!!
        _clockFading = lucideOutlineIcon(
            name = "ClockFading",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2c3.964-.001 7.555 2.34 9.153 5.968 1.598 3.628 .903 7.857-1.773 10.782")
            addPathData("M12 6v6l4 2")
            addPathData("M2.5 8.875c-.319 .969-.487 1.98-.5 3")
            addPathData("M2.83 16c.562 1.292 1.39 2.45 2.43 3.4")
            addPathData("M4.636 5.235c.279-.304 .577-.59 .891-.857")
            addPathData("M8.644 21.42c2.494 .888 5.238 .752 7.631-.38")
        }
        return _clockFading!!
    }

private var _clockFading: ImageVector? = null

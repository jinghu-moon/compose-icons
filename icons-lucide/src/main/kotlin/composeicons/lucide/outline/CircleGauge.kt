package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleGauge: ImageVector
    get() {
        if (_circleGauge != null) return _circleGauge!!
        _circleGauge = lucideOutlineIcon(
            name = "CircleGauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.6 2.7C11.192 .987 6.187 2.597 3.603 6.558 1.019 10.519 1.564 15.748 4.908 19.092c3.344 3.344 8.573 3.888 12.534 1.305 3.961-2.584 5.571-7.589 3.858-11.997")
            addPathData("M14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M13.4 10.6 19 5")
        }
        return _circleGauge!!
    }

private var _circleGauge: ImageVector? = null

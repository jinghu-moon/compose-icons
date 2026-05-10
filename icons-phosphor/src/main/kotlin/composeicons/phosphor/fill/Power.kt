package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorFillIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C232 70.562 185.438 24 128 24ZM120 64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 208C92.76 208.004 61.668 184.947 51.437 151.225 41.207 117.502 54.248 81.057 83.55 61.48c2.373-1.678 5.47-1.937 8.089-.677 2.619 1.261 4.348 3.843 4.517 6.745 .168 2.902-1.25 5.667-3.706 7.222C69.007 90.43 58.573 119.585 66.755 146.563c8.182 26.978 33.054 45.426 61.245 45.426 28.192 0 53.063-18.447 61.245-45.426 8.182-26.978-2.253-56.133-25.695-71.793-2.456-1.555-3.874-4.32-3.706-7.222 .168-2.902 1.898-5.484 4.517-6.745 2.619-1.261 5.716-1.002 8.089 .677 29.302 19.577 42.343 56.022 32.113 89.745C194.332 184.947 163.24 208.004 128 208Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _power!!
    }

private var _power: ImageVector? = null

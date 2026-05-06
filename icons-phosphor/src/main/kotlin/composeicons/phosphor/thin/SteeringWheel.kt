package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorThinIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 148c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM228 128c0 55.228-44.772 100-100 100C72.772 228 28 183.228 28 128 28 72.772 72.772 28 128 28c55.203 .061 99.939 44.797 100 100ZM36 128q0 4.53 .44 8.94c51.104-49.254 132.016-49.254 183.12 0Q220 132.53 220 128C220 77.19 178.81 36 128 36 77.19 36 36 77.19 36 128ZM113.75 218.9 94.2 166.6c-.585-1.565-2.08-2.601-3.75-2.6h-47.11c12.471 29.188 39.062 49.922 70.41 54.9ZM128 220c1.78 0 3.55-.06 5.3-.16l21-56.05c1.757-4.69 6.242-7.795 11.25-7.79h50.09c.969-3.026 1.78-6.1 2.43-9.21C194.65 122.038 162.076 108.016 128 108.016c-34.076 0-66.65 14.023-90.07 38.774 .65 3.11 1.461 6.184 2.43 9.21h50.09c5.007 0 9.488 3.11 11.24 7.8l21 56c1.73 .14 3.51 .2 5.31 .2ZM212.66 164h-47.11c-1.67-.001-3.165 1.035-3.75 2.6l-19.6 52.3c31.37-4.953 57.988-25.692 70.46-54.9Z"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null

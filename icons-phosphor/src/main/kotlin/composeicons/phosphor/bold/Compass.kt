package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorBoldIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM163.27 77l-56 24c-2.831 1.214-5.086 3.469-6.3 6.3l-24 56c-1.898 4.505-.874 9.711 2.589 13.161 3.463 3.45 8.673 4.454 13.171 2.539l56-24c2.831-1.214 5.086-3.469 6.3-6.3l24-56c1.898-4.505 .874-9.711-2.589-13.161C172.977 76.089 167.768 75.085 163.27 77ZM134.86 134.89l-24 10.29 10.29-24 24-10.29Z"),
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
        return _compass!!
    }

private var _compass: ImageVector? = null

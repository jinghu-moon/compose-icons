package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorBoldIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 85.48 44.73 46.66 83 29.1c3.915-1.908 8.556-1.546 12.127 .946 3.571 2.493 5.511 6.724 5.07 11.057-.442 4.333-3.196 8.086-7.197 9.806C63.24 64.57 44 94.83 44 128c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84C212 94.83 192.76 64.57 163 50.91c-4.001-1.721-6.755-5.474-7.197-9.806-.442-4.333 1.499-8.564 5.07-11.057 3.571-2.493 8.212-2.855 12.127-.946 38.27 17.56 63 56.38 63 98.9Z"),
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
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null

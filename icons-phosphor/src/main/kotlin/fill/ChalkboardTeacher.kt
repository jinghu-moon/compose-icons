package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorFillIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 53.390 216.000 C 56.480 216.001 59.295 214.222 60.620 211.430 C 68.561 194.665 85.450 183.977 104.000 183.977 C 122.550 183.977 139.439 194.665 147.380 211.430 C 148.705 214.222 151.520 216.001 154.610 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 104.000 168.000 C 86.327 168.000 72.000 153.673 72.000 136.000 C 72.000 118.327 86.327 104.000 104.000 104.000 C 121.673 104.000 136.000 118.327 136.000 136.000 C 136.000 153.673 121.673 168.000 104.000 168.000 ZM 216.000 200.000 L 159.430 200.000 C 155.942 193.987 151.497 188.582 146.270 184.000 L 192.000 184.000 C 196.418 184.000 200.000 180.418 200.000 176.000 L 200.000 80.000 C 200.000 75.582 196.418 72.000 192.000 72.000 L 64.000 72.000 C 59.582 72.000 56.000 75.582 56.000 80.000 L 56.000 176.000 C 55.998 179.649 58.466 182.838 62.000 183.750 C 56.652 188.383 52.113 193.875 48.570 200.000 L 40.000 200.000 L 40.000 56.000 L 216.000 56.000 Z"),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null

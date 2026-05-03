package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorBoldIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.880 31.930 C 54.606 29.427 51.382 28.000 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 212.749 228.000 217.051 225.198 218.973 220.855 C 220.894 216.512 220.074 211.445 216.880 207.930 ZM 52.000 204.000 L 52.000 62.240 L 180.870 204.000 ZM 228.000 48.000 L 228.000 165.340 C 228.000 171.967 222.627 177.340 216.000 177.340 C 209.373 177.340 204.000 171.967 204.000 165.340 L 204.000 100.000 L 145.690 100.000 C 139.063 100.000 133.690 94.627 133.690 88.000 C 133.690 81.373 139.063 76.000 145.690 76.000 L 204.000 76.000 L 204.000 52.000 L 188.000 52.000 C 188.000 58.627 182.627 64.000 176.000 64.000 C 169.373 64.000 164.000 58.627 164.000 52.000 L 102.060 52.000 C 95.433 52.000 90.060 46.627 90.060 40.000 C 90.060 33.373 95.433 28.000 102.060 28.000 L 164.000 28.000 L 164.000 24.000 C 164.000 17.373 169.373 12.000 176.000 12.000 C 182.627 12.000 188.000 17.373 188.000 24.000 L 188.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 Z"),
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
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null

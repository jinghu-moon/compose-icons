package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorThinIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-28v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-88v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-28C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h28v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h88v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h28c2.209 0 4 1.791 4 4ZM152 92c-9.831 .003-18.941 5.161-24 13.59C121.52 94.807 108.645 89.67 96.523 93.029 84.4 96.389 76.005 107.42 76 120c0 14.51 8.56 29 25.44 43.07 7.662 6.347 15.963 11.88 24.77 16.51 1.127 .564 2.453 .564 3.58 0 8.807-4.63 17.108-10.163 24.77-16.51C171.44 149 180 134.51 180 120 180 104.536 167.464 92 152 92ZM128 171.47C119.54 166.83 84 145.8 84 120c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 25.8-35.54 46.83-44 51.47Z"),
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
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null

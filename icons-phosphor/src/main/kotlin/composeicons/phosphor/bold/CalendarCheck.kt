package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) return _calendarCheck!!
        _calendarCheck = phosphorBoldIcon(
            name = "CalendarCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-20v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-72v-4C92 17.373 86.627 12 80 12 73.373 12 68 17.373 68 24v4h-20C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM68 52c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h16v24h-152v-24ZM52 204v-104h152v104ZM172.49 119.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-48 48c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-24-24c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L116 159l39.51-39.52c2.255-2.249 5.311-3.51 8.496-3.504 3.185 .006 6.237 1.277 8.484 3.534Z"),
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
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null

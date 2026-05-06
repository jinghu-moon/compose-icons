package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarBlank: ImageVector
    get() {
        if (_calendarBlank != null) return _calendarBlank!!
        _calendarBlank = phosphorBoldIcon(
            name = "CalendarBlank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-20v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-72v-4C92 17.373 86.627 12 80 12 73.373 12 68 17.373 68 24v4h-20C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM68 52c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h16v24h-152v-24ZM52 204v-104h152v104Z"),
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
        return _calendarBlank!!
    }

private var _calendarBlank: ImageVector? = null

package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarDot: ImageVector
    get() {
        if (_calendarDot != null) return _calendarDot!!
        _calendarDot = phosphorBoldIcon(
            name = "CalendarDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 152c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM228 48v160c0 11.046-8.954 20-20 20h-160C36.954 228 28 219.046 28 208v-160C28 36.954 36.954 28 48 28h20v-4C68 17.373 73.373 12 80 12c6.627 0 12 5.373 12 12v4h72v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h20c11.046 0 20 8.954 20 20ZM52 52v24h152v-24h-16c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12h-72c0 6.627-5.373 12-12 12C73.373 64 68 58.627 68 52ZM204 204v-104h-152v104Z"),
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
        return _calendarDot!!
    }

private var _calendarDot: ImageVector? = null

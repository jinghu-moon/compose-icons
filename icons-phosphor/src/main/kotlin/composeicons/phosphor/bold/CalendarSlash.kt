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
                pathData = parseSvgPathData("M56.88 31.93C54.606 29.427 51.382 28 48 28 36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c4.749-0 9.051-2.802 10.973-7.145 1.922-4.343 1.101-9.411-2.093-12.925ZM52 204v-141.76L180.87 204ZM228 48v117.34c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-65.34h-58.31c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h58.31v-24h-16c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12h-61.94c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h61.94v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h20c11.046 0 20 8.954 20 20Z"),
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

package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorRegularIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-24v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-80v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-24C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM208 208h-160v-160h24v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h80v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h24v160ZM152 88c-9.191-.005-17.937 3.953-24 10.86C119.2 88.882 105.145 85.39 92.698 90.088 80.252 94.787 72.011 106.696 72 120c0 36.52 50.28 62.08 52.42 63.16 2.253 1.128 4.907 1.128 7.16 0C133.72 182.08 184 156.52 184 120 184 102.327 169.673 88 152 88ZM128 166.93C114.21 159.14 88 140.18 88 120c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 20.19-26.21 39.15-40 46.93Z"),
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

package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) return _calendarCheck!!
        _calendarCheck = phosphorRegularIcon(
            name = "CalendarCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-24v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-80v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-24C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM72 48v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h80v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h24v32h-160v-32ZM208 208h-160v-112h160v112ZM169.66 122.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-48 48c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-24-24c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L116 164.69l42.34-42.35c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346Z"),
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

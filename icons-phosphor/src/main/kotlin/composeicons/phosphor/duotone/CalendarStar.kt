package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorDuotoneIcon(
            name = "CalendarStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M149.6 143.41 157.67 176 128 158.54 98.33 176l8.07-32.59L80 121.61l34.65-2.67L128 88l13.35 30.94L176 121.61Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 32h-24v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-80v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-24C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM208 208h-160v-160h24v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h80v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h24v160ZM176.62 113.64l-29.84-2.31L135.35 84.83C134.088 81.892 131.197 79.989 128 79.989c-3.197 0-6.088 1.904-7.35 4.841l-11.43 26.5-29.84 2.31c-3.249 .256-6.017 2.457-6.999 5.564-.982 3.107 .018 6.499 2.529 8.576l22.52 18.59-6.86 27.71c-.769 3.124 .408 6.404 2.987 8.326 2.579 1.922 6.059 2.113 8.833 .484L128 167.82l25.61 15.07c2.774 1.629 6.254 1.439 8.833-.484 2.579-1.922 3.756-5.203 2.987-8.326l-6.86-27.71 22.52-18.59c2.511-2.077 3.512-5.469 2.529-8.576-.982-3.107-3.751-5.308-6.999-5.564ZM144.51 137.24c-2.375 1.957-3.417 5.102-2.68 8.09l3.5 14.12-13.27-7.81c-2.506-1.476-5.614-1.476-8.12 0l-13.27 7.81 3.5-14.12c.737-2.988-.305-6.133-2.68-8.09l-11.11-9.18 14.89-1.15c2.96-.227 5.551-2.075 6.73-4.8l6-13.92 6 13.92c1.179 2.725 3.77 4.573 6.73 4.8l14.89 1.15Z"),
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
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null

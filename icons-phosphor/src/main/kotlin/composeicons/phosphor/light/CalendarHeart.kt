package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorLightIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-26v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-84v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-26C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h26v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h84v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h26c1.105 0 2 .895 2 2ZM152 90c-9.443 0-18.334 4.446-24 12C120.252 91.67 106.763 87.456 94.513 91.539 82.263 95.623 74 107.087 74 120c0 35.3 49.22 60.32 51.32 61.37 1.687 .842 3.673 .842 5.36 0C132.78 180.32 182 155.3 182 120 182 103.431 168.569 90 152 90ZM148.33 155.25c-6.347 5.244-13.151 9.909-20.33 13.94-7.177-4.035-13.98-8.7-20.33-13.94C97.78 147 86 134.15 86 120c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 14.15-11.78 27-21.67 35.25Z"),
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

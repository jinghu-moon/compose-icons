package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) return _calendarCheck!!
        _calendarCheck = phosphorLightIcon(
            name = "CalendarCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-26v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-84v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-26C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM48 46h26v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h84v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h26c1.105 0 2 .895 2 2v34h-164v-34c0-1.105 .895-2 2-2ZM208 210h-160c-1.105 0-2-.895-2-2v-114h164v114c0 1.105-.895 2-2 2ZM168.24 123.76c2.34 2.343 2.34 6.137 0 8.48l-48 48c-2.343 2.34-6.137 2.34-8.48 0l-24-24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L116 167.51l43.76-43.75c2.343-2.34 6.137-2.34 8.48 0Z"),
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

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarX: ImageVector
    get() {
        if (_calendarX != null) return _calendarX!!
        _calendarX = phosphorLightIcon(
            name = "CalendarX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-26v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-84v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-26C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM48 46h26v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h84v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h26c1.105 0 2 .895 2 2v34h-164v-34c0-1.105 .895-2 2-2ZM208 210h-160c-1.105 0-2-.895-2-2v-114h164v114c0 1.105-.895 2-2 2ZM156.24 132.24 136.48 152l19.76 19.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L128 160.48l-19.76 19.76c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L119.52 152 99.76 132.24c-1.605-1.496-2.266-3.748-1.723-5.874 .543-2.126 2.203-3.786 4.329-4.329 2.126-.543 4.379 .118 5.874 1.723L128 143.52l19.76-19.76c1.496-1.605 3.748-2.266 5.874-1.723 2.126 .543 3.786 2.203 4.329 4.329 .543 2.126-.118 4.379-1.723 5.874Z"),
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
        return _calendarX!!
    }

private var _calendarX: ImageVector? = null

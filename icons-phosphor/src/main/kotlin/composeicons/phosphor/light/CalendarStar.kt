package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorLightIcon(
            name = "CalendarStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-26v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-84v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-26C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h26v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h84v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h26c1.105 0 2 .895 2 2ZM176.46 115.63l-31-2.4L133.51 85.62c-.954-2.188-3.113-3.602-5.5-3.602-2.387 0-4.546 1.414-5.5 3.602l-11.91 27.61-31 2.4c-2.44 .187-4.522 1.838-5.261 4.171-.739 2.333 .013 4.881 1.901 6.439l23.49 19.39-7.16 28.93c-.58 2.345 .303 4.808 2.239 6.251 1.937 1.443 4.55 1.584 6.631 .359L128 165.5l26.62 15.67c2.081 1.226 4.694 1.085 6.631-.359 1.937-1.443 2.819-3.907 2.239-6.251l-7.16-28.93 23.49-19.39c1.888-1.558 2.64-4.106 1.901-6.439-.739-2.333-2.821-3.984-5.261-4.171ZM145.78 138.78c-1.778 1.47-2.556 3.83-2 6.07l4.63 18.74L131 153.37c-1.877-1.103-4.203-1.103-6.08 0l-17.37 10.22 4.63-18.74c.556-2.24-.222-4.6-2-6.07L95.28 126.45l19.83-1.53c2.205-.189 4.127-1.577 5-3.61L128 103.14l7.84 18.17c.873 2.033 2.795 3.421 5 3.61l19.83 1.53Z"),
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

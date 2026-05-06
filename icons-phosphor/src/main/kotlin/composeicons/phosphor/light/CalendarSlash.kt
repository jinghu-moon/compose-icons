package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorLightIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36C51.309 34.736 49.696 34.009 48 34 40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c2.36-.013 4.494-1.408 5.452-3.565 .958-2.157 .562-4.676-1.012-6.435ZM46.26 47 78.07 82h-32.07v-34c0-.35 .09-.694 .26-1ZM48 210c-1.105 0-2-.895-2-2v-114h43L194.44 210ZM222 48v129.23c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-83.23h-75.12c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h75.12v-34c0-1.105-.895-2-2-2h-26v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-78.75c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h78.75v-10c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v10h26c7.732 0 14 6.268 14 14Z"),
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

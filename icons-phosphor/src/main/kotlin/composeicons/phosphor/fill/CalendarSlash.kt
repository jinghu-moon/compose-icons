package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorFillIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48v139.57c.023 1.674-.999 3.184-2.56 3.787-1.562 .602-3.333 .169-4.44-1.087L116.8 80h91.2v-32h-24v8c.005 2.215-.909 4.333-2.524 5.849-1.615 1.516-3.786 2.295-5.996 2.151-4.277-.367-7.543-3.978-7.48-8.27v-7.73h-80.29L79.25 38.69c-1.07-1.177-1.34-2.876-.69-4.327 .651-1.451 2.099-2.379 3.69-2.363h85.75v-8c-.005-2.215 .909-4.333 2.524-5.849 1.615-1.516 3.786-2.295 5.996-2.151 4.277 .367 7.543 3.978 7.48 8.27v7.73h24c8.837 0 16 7.163 16 16ZM213.92 210.62c2.129 2.343 2.676 5.722 1.395 8.617-1.281 2.895-4.149 4.763-7.315 4.763h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32c2.258-.003 4.412 .949 5.93 2.62ZM73.55 80 48 51.89v28.11Z"),
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

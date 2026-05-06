package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorThinIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C50.233 36.465 49.141 35.989 48 36 41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c1.59 .016 3.039-.912 3.69-2.363 .651-1.451 .38-3.15-.69-4.327ZM46.54 44.31 82.59 84h-38.59v-36c-.001-1.631 .988-3.099 2.5-3.71ZM48 212c-2.209 0-4-1.791-4-4v-116h45.87L199 212ZM220 48v129.23c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-85.23h-77.12c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h77.12v-36c0-2.209-1.791-4-4-4h-28v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-80.75c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h80.75v-12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v12h28c6.627 0 12 5.373 12 12Z"),
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

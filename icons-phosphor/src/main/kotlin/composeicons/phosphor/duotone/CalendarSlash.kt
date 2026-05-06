package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorDuotoneIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v40h-176v-40c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.404 32.952 50.254 32 48 32 39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c3.166-0 6.034-1.868 7.315-4.763 1.281-2.895 .734-6.274-1.395-8.617ZM73.55 80h-25.55v-28.12ZM48 208v-112h40.1L189.92 208ZM224 48v129.23c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-81.23h-73.12c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h73.12v-32h-24v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-76.75c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h76.75v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h24c8.837 0 16 7.163 16 16Z"),
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

package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RadarLine: ImageVector
    get() {
        if (_radarLine != null) return _radarLine!!
        _radarLine = remixIcon(
            name = "RadarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.507 3.623 11.483 5.395C8.574 4.516 5.97 4.945 5.072 6.5c-1.177 2.039 .79 5.652 4.678 7.897 3.888 2.245 8.001 2.142 9.178 .103 .898-1.555-.033-4.024-2.249-6.105L17.703 6.623c3.082 2.709 4.463 6.27 2.958 8.877-1.86 3.222-7.189 3.355-11.91 .629C4.029 13.403 1.48 8.722 3.34 5.5 4.845 2.893 8.62 2.308 12.507 3.623ZM15.884 1.773l1.732 1-5 8.66-1.732-1 5-8.66ZM6.732 20h10.268v2h-11.983c-.078 .001-.156-.006-.233-.023-.015-.003-.029-.007-.043-.011-.083-.022-.164-.055-.241-.1-.029-.017-.057-.035-.084-.054-.115-.083-.211-.189-.282-.312-.071-.123-.115-.26-.129-.401-.001-.007-.001-.015-.002-.022-.015-.195 .026-.396 .131-.578L6.384 16.603l1.732 1L6.732 20Z"),
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
        return _radarLine!!
    }

private var _radarLine: ImageVector? = null

package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RadarFill: ImageVector
    get() {
        if (_radarFill != null) return _radarFill!!
        _radarFill = remixIcon(
            name = "RadarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.368 4.398l-3.484 6.035 1.732 1L16.101 5.398c4.169 2.772 6.305 7.079 4.56 10.102-1.86 3.222-7.189 3.355-11.91 .629C4.029 13.403 1.48 8.722 3.34 5.5 5.085 2.477 9.883 2.173 14.368 4.398ZM15.884 1.773l1.732 1L16.116 5.371l-1.732-1L15.884 1.773ZM6.732 20h10.268v2h-11.983c-.078 .001-.156-.006-.233-.023-.015-.003-.029-.007-.043-.011-.083-.022-.164-.055-.241-.1-.029-.017-.057-.035-.084-.054-.115-.083-.211-.189-.282-.312-.071-.123-.115-.26-.129-.401-.001-.007-.001-.015-.002-.022-.015-.195 .026-.396 .131-.578L6.384 16.603l1.732 1L6.732 20Z"),
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
        return _radarFill!!
    }

private var _radarFill: ImageVector? = null

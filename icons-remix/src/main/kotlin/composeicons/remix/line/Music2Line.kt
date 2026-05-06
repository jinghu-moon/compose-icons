package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Music2Line: ImageVector
    get() {
        if (_music2Line != null) return _music2Line!!
        _music2Line = remixIcon(
            name = "Music2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3v14c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 .729 0 1.412 .195 2 .535v-8.535h-9v12c0 2.209-1.791 4-4 4C2.791 21 1 19.209 1 17 1 14.791 2.791 13 5 13c.729 0 1.412 .195 2 .535v-10.535h13ZM5 19c1.105 0 2-.895 2-2C7 15.895 6.105 15 5 15c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM16 19c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _music2Line!!
    }

private var _music2Line: ImageVector? = null

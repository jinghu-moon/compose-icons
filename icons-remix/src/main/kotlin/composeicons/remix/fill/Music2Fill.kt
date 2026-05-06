package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Music2Fill: ImageVector
    get() {
        if (_music2Fill != null) return _music2Fill!!
        _music2Fill = remixIcon(
            name = "Music2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3v14c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 .729 0 1.412 .195 2 .535v-7.535h-9v11c0 2.209-1.791 4-4 4C2.791 21 1 19.209 1 17 1 14.791 2.791 13 5 13c.729 0 1.412 .195 2 .535v-10.535h13Z"),
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
        return _music2Fill!!
    }

private var _music2Fill: ImageVector? = null

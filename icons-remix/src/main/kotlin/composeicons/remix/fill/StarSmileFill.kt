package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StarSmileFill: ImageVector
    get() {
        if (_starSmileFill != null) return _starSmileFill!!
        _starSmileFill = remixIcon(
            name = "StarSmileFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 .5l4.226 6.183 7.187 2.108-4.575 5.93 .216 7.487L12 19.69 4.946 22.208l.216-7.487L.587 8.792 7.774 6.683 12 .5ZM10 12h-2c0 2.209 1.791 4 4 4 2.142 0 3.891-1.684 3.995-3.8L16 12h-2c0 1.105-.895 2-2 2-1.054 0-1.918-.816-1.995-1.851L10 12Z"),
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
        return _starSmileFill!!
    }

private var _starSmileFill: ImageVector? = null

package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiscussFill: ImageVector
    get() {
        if (_discussFill != null) return _discussFill!!
        _discussFill = remixIcon(
            name = "DiscussFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.800 19.000 L 14.000 22.500 L 11.200 19.000 L 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 L 5.000 7.103 C 5.000 6.550 5.448 6.103 6.000 6.103 L 22.000 6.103 C 22.552 6.103 23.000 6.550 23.000 7.103 L 23.000 18.000 C 23.000 18.552 22.552 19.000 22.000 19.000 L 16.800 19.000 ZM 2.000 2.000 L 19.000 2.000 L 19.000 4.000 L 3.000 4.000 L 3.000 15.000 L 1.000 15.000 L 1.000 3.000 C 1.000 2.448 1.448 2.000 2.000 2.000 Z"),
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
        return _discussFill!!
    }

private var _discussFill: ImageVector? = null

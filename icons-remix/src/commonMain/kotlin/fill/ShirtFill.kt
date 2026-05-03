package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShirtFill: ImageVector
    get() {
        if (_shirtFill != null) return _shirtFill!!
        _shirtFill = remixIcon(
            name = "ShirtFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.998 4.000 L 6.998 11.000 L 11.998 8.500 L 16.998 11.000 L 16.998 4.000 L 19.998 4.000 C 20.550 4.000 20.998 4.448 20.998 5.000 L 20.998 21.000 C 20.998 21.552 20.550 22.000 19.998 22.000 L 3.998 22.000 C 3.446 22.000 2.998 21.552 2.998 21.000 L 2.998 5.000 C 2.998 4.448 3.446 4.000 3.998 4.000 L 6.998 4.000 ZM 11.998 8.000 L 7.498 3.000 L 16.498 3.000 L 11.998 8.000 ZM 12.998 11.236 L 11.998 10.736 L 10.998 11.236 L 10.998 20.000 L 12.998 20.000 L 12.998 11.236 ZM 14.998 14.000 L 14.998 16.000 L 18.998 16.000 L 18.998 14.000 L 14.998 14.000 Z"),
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
        return _shirtFill!!
    }

private var _shirtFill: ImageVector? = null

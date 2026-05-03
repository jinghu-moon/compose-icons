package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShirtLine: ImageVector
    get() {
        if (_shirtLine != null) return _shirtLine!!
        _shirtLine = remixIcon(
            name = "ShirtLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.998 20.000 L 18.998 20.000 L 18.998 16.000 L 14.998 16.000 L 14.998 14.000 L 18.998 14.000 L 18.998 6.000 L 16.998 6.000 L 16.998 11.000 L 12.998 9.400 L 12.998 20.000 ZM 10.998 20.000 L 10.998 9.400 L 6.998 11.000 L 6.998 6.000 L 4.998 6.000 L 4.998 20.000 L 10.998 20.000 ZM 6.998 4.000 L 6.998 3.000 L 16.998 3.000 L 16.998 4.000 L 19.998 4.000 C 20.550 4.000 20.998 4.448 20.998 5.000 L 20.998 21.000 C 20.998 21.552 20.550 22.000 19.998 22.000 L 3.998 22.000 C 3.446 22.000 2.998 21.552 2.998 21.000 L 2.998 5.000 C 2.998 4.448 3.446 4.000 3.998 4.000 L 6.998 4.000 ZM 11.998 8.000 L 15.498 5.000 L 8.498 5.000 L 11.998 8.000 Z"),
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
        return _shirtLine!!
    }

private var _shirtLine: ImageVector? = null

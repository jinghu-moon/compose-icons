package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowGoForwardLine: ImageVector
    get() {
        if (_arrowGoForwardLine != null) return _arrowGoForwardLine!!
        _arrowGoForwardLine = remixIcon(
            name = "ArrowGoForwardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.172 7.000 L 11.000 7.000 C 7.686 7.000 5.000 9.686 5.000 13.000 C 5.000 16.313 7.686 19.000 11.000 19.000 L 20.000 19.000 L 20.000 21.000 L 11.000 21.000 C 6.582 21.000 3.000 17.418 3.000 13.000 C 3.000 8.581 6.582 5.000 11.000 5.000 L 18.172 5.000 L 15.636 2.464 L 17.050 1.050 L 22.000 6.000 L 17.050 10.949 L 15.636 9.535 L 18.172 7.000 Z"),
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
        return _arrowGoForwardLine!!
    }

private var _arrowGoForwardLine: ImageVector? = null

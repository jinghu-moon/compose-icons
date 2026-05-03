package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NetflixLine: ImageVector
    get() {
        if (_netflixLine != null) return _netflixLine!!
        _netflixLine = remixIcon(
            name = "NetflixLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.985 17.208 L 16.001 2.000 L 18.001 2.000 L 18.001 22.000 C 17.321 21.733 16.648 21.567 15.981 21.500 L 8.001 6.302 L 8.001 21.500 C 7.334 21.567 6.668 21.733 6.001 22.000 L 6.001 2.000 L 8.001 2.000 L 15.985 17.208 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _netflixLine!!
    }

private var _netflixLine: ImageVector? = null

package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UnsplashFill: ImageVector
    get() {
        if (_unsplashFill != null) return _unsplashFill!!
        _unsplashFill = remixIcon(
            name = "UnsplashFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.501 11.000 L 8.501 16.000 L 15.501 16.000 L 15.501 11.000 L 21.001 11.000 L 21.001 21.000 L 3.001 21.000 L 3.001 11.000 L 8.501 11.000 ZM 15.501 3.000 L 15.501 8.000 L 8.501 8.000 L 8.501 3.000 L 15.501 3.000 Z"),
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
        return _unsplashFill!!
    }

private var _unsplashFill: ImageVector? = null

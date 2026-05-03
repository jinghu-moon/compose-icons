package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UnsplashLine: ImageVector
    get() {
        if (_unsplashLine != null) return _unsplashLine!!
        _unsplashLine = remixIcon(
            name = "UnsplashLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.001 10.000 L 10.001 14.000 L 14.000 14.000 L 14.001 10.000 L 21.001 10.000 L 21.000 14.000 L 21.001 21.000 L 3.001 21.000 L 3.001 10.000 L 10.001 10.000 ZM 8.001 12.000 L 5.001 12.000 L 5.001 19.000 L 19.001 19.000 L 19.001 16.000 L 19.001 12.000 L 16.001 12.000 L 16.000 16.000 L 8.001 16.000 L 8.001 12.000 ZM 16.001 3.000 L 16.001 9.000 L 8.001 9.000 L 8.001 3.000 L 16.001 3.000 ZM 14.001 5.000 L 10.001 5.000 L 10.001 7.000 L 14.001 7.000 L 14.001 5.000 Z"),
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
        return _unsplashLine!!
    }

private var _unsplashLine: ImageVector? = null

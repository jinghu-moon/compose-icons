package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TwitterXFill: ImageVector
    get() {
        if (_twitterXFill != null) return _twitterXFill!!
        _twitterXFill = remixIcon(
            name = "TwitterXFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.687 3.062 12.691 8.774 8.37 3.062h-6.257l7.476 9.776L2.504 20.938h3.034l5.469-6.249 4.78 6.249h6.102L14.095 10.634 20.72 3.062h-3.032ZM16.623 19.122 5.654 4.782h1.803L18.303 19.122h-1.68Z"),
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
        return _twitterXFill!!
    }

private var _twitterXFill: ImageVector? = null

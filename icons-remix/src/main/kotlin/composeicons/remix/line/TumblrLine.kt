package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TumblrLine: ImageVector
    get() {
        if (_tumblrLine != null) return _tumblrLine!!
        _tumblrLine = remixIcon(
            name = "TumblrLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.001 8c1.075 0 3.497-.673 3.497-4.5v-1.5h1.5v6h5.003v2h-5.003v2.909c.003 2.482 .003 3.687 .003 4.091-.002 2.208 1.615 3.4 4.785 3.4v1.6c-.635-.001-1.383-.001-2.242 0-2.402 .002-4.545-2.035-4.545-4.545v-7.455h-3.997v-2h1Z"),
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
        return _tumblrLine!!
    }

private var _tumblrLine: ImageVector? = null

package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PerplexityLine: ImageVector
    get() {
        if (_perplexityLine != null) return _perplexityLine!!
        _perplexityLine = remixIcon(
            name = "PerplexityLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.173 3.26 5.5 1.74v2.261 3.5h-1.5-1v1 7.5 1h1 1.5v3 2.26L7.173 20.74 11 17.261v4.74h2v-4.74l3.827 3.479 1.673 1.521v-2.26-3h1.5 1v-1-7.5-1h-1-1.5v-3.5-2.261L16.827 3.26 13 6.74v-4.739h-2v4.739L7.173 3.26ZM16.5 7.5h-1.363L16.5 6.261v1.239ZM8.863 7.5h-1.363v-1.239L8.863 7.5ZM9.963 9.5 5.827 13.26l-.327 .298v.442 1h-.5v-5.5h4.963ZM14.037 9.5h4.963v5.5h-.5v-1-.442l-.327-.298L14.037 9.5ZM7.5 14.442 11 11.261v3.297L7.5 17.74v-3.297ZM13 11.261l3.5 3.182v3.297L13 14.558v-3.297Z"),
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
        return _perplexityLine!!
    }

private var _perplexityLine: ImageVector? = null

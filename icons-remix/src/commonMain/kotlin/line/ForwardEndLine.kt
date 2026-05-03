package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ForwardEndLine: ImageVector
    get() {
        if (_forwardEndLine != null) return _forwardEndLine!!
        _forwardEndLine = remixIcon(
            name = "ForwardEndLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 4.000 C 21.448 4.000 21.000 4.448 21.000 5.000 L 21.000 10.667 L 11.777 4.518 C 11.695 4.463 11.599 4.434 11.500 4.434 C 11.224 4.434 11.000 4.658 11.000 4.934 L 11.000 10.667 L 1.777 4.518 C 1.695 4.463 1.599 4.434 1.500 4.434 C 1.224 4.434 1.000 4.658 1.000 4.934 L 1.000 19.066 C 1.000 19.164 1.029 19.261 1.084 19.343 C 1.237 19.573 1.548 19.635 1.777 19.482 L 11.000 13.333 L 11.000 19.066 C 11.000 19.164 11.029 19.261 11.084 19.343 C 11.237 19.573 11.548 19.635 11.777 19.482 L 21.000 13.333 L 21.000 19.000 C 21.000 19.552 21.448 20.000 22.000 20.000 C 22.552 20.000 23.000 19.552 23.000 19.000 L 23.000 5.000 C 23.000 4.448 22.552 4.000 22.000 4.000 ZM 3.000 7.737 L 9.394 12.000 L 3.000 16.263 L 3.000 7.737 ZM 13.000 16.263 L 13.000 7.737 L 19.394 12.000 L 13.000 16.263 Z"),
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
        return _forwardEndLine!!
    }

private var _forwardEndLine: ImageVector? = null

package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoonClearLine: ImageVector
    get() {
        if (_moonClearLine != null) return _moonClearLine!!
        _moonClearLine = remixIcon(
            name = "MoonClearLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 6.000 C 10.000 10.418 13.582 14.000 18.000 14.000 C 19.439 14.000 20.788 13.620 21.955 12.956 C 21.474 18.030 17.201 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.799 5.970 2.526 11.044 2.045 C 10.380 3.212 10.000 4.561 10.000 6.000 ZM 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 14.965 20.000 17.576 18.379 18.957 15.955 C 18.641 15.985 18.321 16.000 18.000 16.000 C 12.477 16.000 8.000 11.523 8.000 6.000 C 8.000 5.679 8.015 5.359 8.045 5.043 C 5.621 6.424 4.000 9.035 4.000 12.000 ZM 18.164 2.291 L 19.000 2.500 L 19.000 3.500 L 18.164 3.709 C 17.448 3.888 16.888 4.448 16.709 5.164 L 16.500 6.000 L 15.500 6.000 L 15.291 5.164 C 15.112 4.448 14.552 3.888 13.836 3.709 L 13.000 3.500 L 13.000 2.500 L 13.836 2.291 C 14.552 2.112 15.112 1.552 15.291 0.836 L 15.500 0.000 L 16.500 0.000 L 16.709 0.836 C 16.888 1.552 17.448 2.112 18.164 2.291 ZM 23.164 7.291 L 24.000 7.500 L 24.000 8.500 L 23.164 8.709 C 22.448 8.888 21.888 9.448 21.709 10.164 L 21.500 11.000 L 20.500 11.000 L 20.291 10.164 C 20.112 9.448 19.552 8.888 18.836 8.709 L 18.000 8.500 L 18.000 7.500 L 18.836 7.291 C 19.552 7.112 20.112 6.552 20.291 5.836 L 20.500 5.000 L 21.500 5.000 L 21.709 5.836 C 21.888 6.552 22.448 7.112 23.164 7.291 Z"),
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
        return _moonClearLine!!
    }

private var _moonClearLine: ImageVector? = null

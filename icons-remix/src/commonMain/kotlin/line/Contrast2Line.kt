package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Contrast2Line: ImageVector
    get() {
        if (_contrast2Line != null) return _contrast2Line!!
        _contrast2Line = remixIcon(
            name = "Contrast2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 21.997 C 6.477 21.997 2.000 17.520 2.000 11.997 C 2.000 6.474 6.477 1.997 12.000 1.997 C 17.523 1.997 22.000 6.474 22.000 11.997 C 22.000 17.520 17.523 21.997 12.000 21.997 ZM 12.000 19.997 C 16.418 19.997 20.000 16.415 20.000 11.997 C 20.000 7.578 16.418 3.997 12.000 3.997 C 7.582 3.997 4.000 7.578 4.000 11.997 C 4.000 16.415 7.582 19.997 12.000 19.997 ZM 7.000 15.316 C 9.080 15.165 11.117 14.294 12.707 12.704 C 14.297 11.114 15.168 9.077 15.319 6.997 C 15.645 7.214 15.955 7.466 16.243 7.754 C 18.586 10.097 18.586 13.896 16.243 16.239 C 13.899 18.583 10.101 18.583 7.757 16.239 C 7.470 15.952 7.217 15.642 7.000 15.316 Z"),
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
        return _contrast2Line!!
    }

private var _contrast2Line: ImageVector? = null

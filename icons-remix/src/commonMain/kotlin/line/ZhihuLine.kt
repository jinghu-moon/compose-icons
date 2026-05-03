package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ZhihuLine: ImageVector
    get() {
        if (_zhihuLine != null) return _zhihuLine!!
        _zhihuLine = remixIcon(
            name = "ZhihuLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.344 17.963 L 10.657 19.037 L 8.525 15.687 C 8.085 17.089 7.354 18.353 6.387 19.512 C 5.985 19.995 5.568 20.430 5.086 20.888 C 4.931 21.035 4.311 21.604 4.208 21.707 L 2.794 20.293 C 2.933 20.154 3.581 19.559 3.708 19.437 C 4.138 19.029 4.504 18.648 4.851 18.232 C 6.117 16.713 6.880 15.021 6.988 13.000 L 3.001 13.000 L 3.001 11.000 L 7.001 11.000 L 7.001 7.000 L 6.133 7.000 C 5.444 8.266 4.575 9.222 3.515 9.858 L 2.486 8.143 C 3.882 7.305 4.912 5.540 5.525 2.783 L 7.477 3.217 C 7.336 3.850 7.174 4.445 6.988 5.000 L 11.501 5.000 L 11.501 7.000 L 9.001 7.000 L 9.001 11.000 L 11.501 11.000 L 11.501 13.000 L 9.186 13.000 L 12.344 17.963 ZM 16.183 17.893 L 17.299 17.000 L 19.001 17.000 L 19.001 7.000 L 15.001 7.000 L 15.001 17.000 L 15.737 17.000 L 16.183 17.893 ZM 13.001 5.000 L 21.001 5.000 L 21.001 19.000 L 18.001 19.000 L 15.501 21.000 L 14.501 19.000 L 13.001 19.000 L 13.001 5.000 Z"),
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
        return _zhihuLine!!
    }

private var _zhihuLine: ImageVector? = null

package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Contrast2Fill: ImageVector
    get() {
        if (_contrast2Fill != null) return _contrast2Fill!!
        _contrast2Fill = remixIcon(
            name = "Contrast2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 21.997 C 6.477 21.997 2.000 17.520 2.000 11.997 C 2.000 6.474 6.477 1.997 12.000 1.997 C 17.523 1.997 22.000 6.474 22.000 11.997 C 22.000 17.520 17.523 21.997 12.000 21.997 ZM 5.329 16.422 C 6.764 18.567 9.209 19.980 11.984 19.980 C 16.402 19.980 19.984 16.399 19.984 11.980 C 19.984 9.205 18.571 6.760 16.425 5.325 C 17.271 8.353 16.503 11.737 14.121 14.118 C 11.740 16.499 8.357 17.267 5.329 16.422 Z"),
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
        return _contrast2Fill!!
    }

private var _contrast2Fill: ImageVector? = null

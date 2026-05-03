package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Certificate2Fill: ImageVector
    get() {
        if (_certificate2Fill != null) return _certificate2Fill!!
        _certificate2Fill = remixIcon(
            name = "Certificate2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 12.000 C 21.209 12.000 23.000 13.791 23.000 16.000 C 23.000 17.263 22.414 18.388 21.500 19.121 L 21.500 23.500 L 19.000 22.000 L 16.500 23.500 L 16.500 19.121 C 15.586 18.388 15.000 17.263 15.000 16.000 C 15.000 14.378 15.966 12.982 17.354 12.354 C 17.360 12.352 17.365 12.349 17.370 12.347 C 17.464 12.305 17.560 12.266 17.658 12.231 C 17.667 12.228 17.676 12.225 17.685 12.222 C 17.882 12.153 18.085 12.100 18.294 12.062 C 18.306 12.060 18.319 12.058 18.331 12.056 C 18.430 12.039 18.531 12.026 18.633 12.017 C 18.650 12.015 18.667 12.014 18.684 12.013 C 18.788 12.005 18.893 12.000 19.000 12.000 ZM 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 10.342 C 20.374 10.121 19.701 10.000 19.000 10.000 C 17.907 10.000 16.883 10.293 16.000 10.804 L 16.000 9.000 L 8.000 9.000 L 8.000 11.000 L 15.684 11.000 C 14.066 12.075 13.000 13.913 13.000 16.000 C 13.000 17.777 13.773 19.372 15.000 20.471 L 15.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 ZM 19.000 14.000 C 17.895 14.000 17.000 14.895 17.000 16.000 C 17.000 17.105 17.895 18.000 19.000 18.000 C 20.105 18.000 21.000 17.105 21.000 16.000 C 21.000 14.895 20.105 14.000 19.000 14.000 ZM 8.000 15.000 L 13.000 15.000 L 13.000 13.000 L 8.000 13.000 L 8.000 15.000 Z"),
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
        return _certificate2Fill!!
    }

private var _certificate2Fill: ImageVector? = null

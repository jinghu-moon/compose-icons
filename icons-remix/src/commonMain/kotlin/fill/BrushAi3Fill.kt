package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BrushAi3Fill: ImageVector
    get() {
        if (_brushAi3Fill != null) return _brushAi3Fill!!
        _brushAi3Fill = remixIcon(
            name = "BrushAi3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 3.997 L 10.000 3.997 L 10.000 7.997 L 4.000 7.997 L 4.000 10.997 L 20.000 10.997 L 20.000 10.000 L 22.000 10.000 L 22.000 12.997 L 21.000 12.997 L 21.000 20.997 C 21.000 21.549 20.552 21.997 20.000 21.997 L 10.000 21.997 L 10.000 15.997 L 8.000 15.997 L 8.000 21.997 L 4.000 21.997 C 3.448 21.997 3.000 21.549 3.000 20.997 L 3.000 12.997 L 2.000 12.997 L 2.000 6.997 C 2.000 6.445 2.448 5.997 3.000 5.997 L 8.000 5.997 L 8.000 2.997 C 8.000 2.445 8.448 1.997 9.000 1.997 L 13.000 1.997 L 13.000 3.997 ZM 18.529 1.319 C 18.706 0.893 19.294 0.893 19.471 1.319 L 19.724 1.931 C 20.156 2.973 20.962 3.806 21.975 4.257 L 22.692 4.576 C 23.103 4.759 23.103 5.356 22.692 5.539 L 21.933 5.877 C 20.945 6.316 20.153 7.119 19.714 8.128 L 19.467 8.693 C 19.286 9.107 18.714 9.107 18.533 8.693 L 18.287 8.128 C 17.848 7.119 17.055 6.316 16.067 5.877 L 15.308 5.539 C 14.897 5.356 14.897 4.759 15.308 4.576 L 16.025 4.257 C 17.038 3.806 17.844 2.973 18.276 1.931 L 18.529 1.319 Z"),
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
        return _brushAi3Fill!!
    }

private var _brushAi3Fill: ImageVector? = null

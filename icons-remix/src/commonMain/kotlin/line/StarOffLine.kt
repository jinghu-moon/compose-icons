package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StarOffLine: ImageVector
    get() {
        if (_starOffLine != null) return _starOffLine!!
        _starOffLine = remixIcon(
            name = "StarOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 23.413 8.792 L 18.021 13.778 L 16.606 12.363 L 18.872 10.267 L 14.039 9.694 L 12.001 5.275 L 11.217 6.974 L 9.710 5.467 L 12.001 0.500 L 15.386 7.840 L 23.413 8.792 ZM 8.459 9.873 L 5.129 10.267 L 8.702 13.572 L 7.754 18.345 L 12.001 15.968 L 16.247 18.345 L 16.078 17.491 L 8.459 9.873 ZM 18.622 20.036 L 19.054 22.208 L 12.001 18.260 L 4.947 22.208 L 6.522 14.280 L 0.588 8.792 L 6.658 8.072 L 1.394 2.808 L 2.808 1.393 L 22.607 21.192 L 21.193 22.607 L 18.622 20.036 Z"),
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
        return _starOffLine!!
    }

private var _starOffLine: ImageVector? = null

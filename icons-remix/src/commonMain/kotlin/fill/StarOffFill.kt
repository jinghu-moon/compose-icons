package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StarOffFill: ImageVector
    get() {
        if (_starOffFill != null) return _starOffFill!!
        _starOffFill = remixIcon(
            name = "StarOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 23.413 8.792 L 18.021 13.778 L 9.710 5.467 L 12.001 0.500 L 15.386 7.840 L 23.413 8.792 ZM 18.622 20.036 L 21.193 22.607 L 22.607 21.192 L 2.808 1.393 L 1.394 2.808 L 6.658 8.072 L 0.588 8.792 L 6.522 14.280 L 4.947 22.208 L 12.001 18.260 L 19.054 22.208 L 18.622 20.036 Z"),
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
        return _starOffFill!!
    }

private var _starOffFill: ImageVector? = null

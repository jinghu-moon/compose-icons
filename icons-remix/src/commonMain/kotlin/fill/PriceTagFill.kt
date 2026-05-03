package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PriceTagFill: ImageVector
    get() {
        if (_priceTagFill != null) return _priceTagFill!!
        _priceTagFill = remixIcon(
            name = "PriceTagFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.005 7.000 L 11.450 1.370 C 11.786 1.146 12.224 1.146 12.560 1.370 L 21.005 7.000 L 21.005 21.000 C 21.005 21.552 20.557 22.000 20.005 22.000 L 4.005 22.000 C 3.453 22.000 3.005 21.552 3.005 21.000 L 3.005 7.000 ZM 12.005 11.000 C 13.109 11.000 14.005 10.104 14.005 9.000 C 14.005 7.895 13.109 7.000 12.005 7.000 C 10.900 7.000 10.005 7.895 10.005 9.000 C 10.005 10.104 10.900 11.000 12.005 11.000 Z"),
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
        return _priceTagFill!!
    }

private var _priceTagFill: ImageVector? = null

package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PriceTag2Line: ImageVector
    get() {
        if (_priceTag2Line != null) return _priceTag2Line!!
        _priceTag2Line = remixIcon(
            name = "PriceTag2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.005 7.000 L 11.450 1.370 C 11.786 1.146 12.224 1.146 12.560 1.370 L 21.005 7.000 L 21.005 21.000 C 21.005 21.552 20.557 22.000 20.005 22.000 L 4.005 22.000 C 3.453 22.000 3.005 21.552 3.005 21.000 L 3.005 7.000 ZM 5.005 8.070 L 5.005 20.000 L 19.005 20.000 L 19.005 8.070 L 12.005 3.403 L 5.005 8.070 ZM 8.005 16.000 L 16.005 16.000 L 16.005 18.000 L 8.005 18.000 L 8.005 16.000 ZM 8.005 13.000 L 16.005 13.000 L 16.005 15.000 L 8.005 15.000 L 8.005 13.000 ZM 12.005 11.000 C 10.900 11.000 10.005 10.104 10.005 9.000 C 10.005 7.895 10.900 7.000 12.005 7.000 C 13.109 7.000 14.005 7.895 14.005 9.000 C 14.005 10.104 13.109 11.000 12.005 11.000 Z"),
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
        return _priceTag2Line!!
    }

private var _priceTag2Line: ImageVector? = null

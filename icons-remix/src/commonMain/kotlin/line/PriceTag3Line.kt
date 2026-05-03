package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PriceTag3Line: ImageVector
    get() {
        if (_priceTag3Line != null) return _priceTag3Line!!
        _priceTag3Line = remixIcon(
            name = "PriceTag3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.904 2.100 L 20.804 3.514 L 22.218 13.414 L 13.026 22.606 C 12.635 22.997 12.002 22.997 11.611 22.606 L 1.712 12.707 C 1.321 12.316 1.321 11.683 1.712 11.293 L 10.904 2.100 ZM 11.611 4.222 L 3.833 12.000 L 12.318 20.485 L 20.097 12.707 L 19.036 5.282 L 11.611 4.222 ZM 13.733 10.585 C 12.952 9.804 12.952 8.538 13.733 7.757 C 14.514 6.976 15.780 6.976 16.561 7.757 C 17.342 8.538 17.342 9.804 16.561 10.585 C 15.780 11.367 14.514 11.367 13.733 10.585 Z"),
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
        return _priceTag3Line!!
    }

private var _priceTag3Line: ImageVector? = null

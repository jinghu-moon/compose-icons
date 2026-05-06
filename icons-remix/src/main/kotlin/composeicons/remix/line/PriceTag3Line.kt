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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.904 2.1l9.899 1.414 1.414 9.9-9.192 9.192c-.391 .391-1.024 .391-1.414 0L1.712 12.707c-.391-.391-.391-1.024 0-1.414L10.904 2.1ZM11.611 4.222 3.833 12l8.485 8.485 7.778-7.778L19.036 5.282 11.611 4.222ZM13.733 10.585c-.781-.781-.781-2.047 0-2.828 .781-.781 2.047-.781 2.828 0 .781 .781 .781 2.047 0 2.828-.781 .781-2.047 .781-2.828 0Z"),
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
        return _priceTag3Line!!
    }

private var _priceTag3Line: ImageVector? = null

package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChromeFill: ImageVector
    get() {
        if (_chromeFill != null) return _chromeFill!!
        _chromeFill = remixIcon(
            name = "ChromeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.827 21.763 C 5.349 20.771 2.000 16.777 2.000 12.000 C 2.000 10.178 2.487 8.470 3.339 6.998 L 7.622 14.417 C 8.474 15.957 10.115 17.000 12.000 17.000 C 12.202 17.000 12.402 16.988 12.598 16.965 L 9.827 21.763 ZM 12.000 22.000 L 16.287 14.575 C 16.740 13.823 17.000 12.942 17.000 12.000 C 17.000 10.874 16.628 9.836 16.000 9.000 L 21.542 9.000 C 21.840 9.947 22.000 10.955 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 14.572 13.545 C 14.047 14.417 13.092 15.000 12.000 15.000 C 10.890 15.000 9.920 14.397 9.401 13.500 L 9.373 13.450 C 9.135 13.020 9.000 12.526 9.000 12.000 C 9.000 10.343 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 10.343 15.000 12.000 C 15.000 12.547 14.854 13.059 14.599 13.500 L 14.572 13.545 ZM 4.632 5.239 C 6.460 3.248 9.084 2.000 12.000 2.000 C 15.701 2.000 18.933 4.011 20.662 7.000 L 12.000 7.000 C 9.936 7.000 8.165 8.250 7.401 10.035 L 4.632 5.239 Z"),
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
        return _chromeFill!!
    }

private var _chromeFill: ImageVector? = null

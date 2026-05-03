package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PoliceBadgeFill: ImageVector
    get() {
        if (_policeBadgeFill != null) return _policeBadgeFill!!
        _policeBadgeFill = remixIcon(
            name = "PoliceBadgeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.913 11.674 C 3.236 10.195 3.539 8.808 2.000 6.500 L 5.500 2.500 C 5.500 2.500 9.000 4.000 12.000 1.500 C 15.000 4.000 18.500 2.500 18.500 2.500 L 22.000 6.500 C 20.461 8.808 20.764 10.195 21.087 11.674 C 21.393 13.078 21.718 14.564 20.500 17.000 C 19.343 19.315 17.348 20.123 15.485 20.877 C 14.129 21.426 12.843 21.947 12.000 23.000 C 11.158 21.947 9.872 21.426 8.515 20.877 C 6.652 20.123 4.658 19.315 3.500 17.000 C 2.282 14.564 2.607 13.078 2.913 11.674 ZM 14.378 12.773 L 16.755 10.455 L 13.469 9.977 L 12.000 7.000 L 10.530 9.977 L 7.245 10.455 L 9.622 12.773 L 9.061 16.045 L 12.000 14.500 L 14.939 16.045 L 14.378 12.773 Z"),
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
        return _policeBadgeFill!!
    }

private var _policeBadgeFill: ImageVector? = null

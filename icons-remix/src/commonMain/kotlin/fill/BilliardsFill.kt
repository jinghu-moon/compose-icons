package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BilliardsFill: ImageVector
    get() {
        if (_billiardsFill != null) return _billiardsFill!!
        _billiardsFill = remixIcon(
            name = "BilliardsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 6.000 C 8.686 6.000 6.000 8.686 6.000 12.000 C 6.000 15.314 8.686 18.000 12.000 18.000 C 15.314 18.000 18.000 15.314 18.000 12.000 C 18.000 8.686 15.314 6.000 12.000 6.000 ZM 12.000 7.750 C 13.381 7.750 14.500 8.869 14.500 10.250 C 14.500 10.882 14.266 11.458 13.880 11.898 C 14.445 12.354 14.800 13.015 14.800 13.750 C 14.800 15.131 13.546 16.250 12.000 16.250 C 10.454 16.250 9.200 15.131 9.200 13.750 C 9.200 13.015 9.555 12.354 10.121 11.897 C 9.734 11.458 9.500 10.882 9.500 10.250 C 9.500 8.869 10.619 7.750 12.000 7.750 ZM 12.000 12.750 C 11.247 12.750 10.700 13.238 10.700 13.750 C 10.700 14.262 11.247 14.750 12.000 14.750 C 12.753 14.750 13.300 14.262 13.300 13.750 C 13.300 13.238 12.753 12.750 12.000 12.750 ZM 12.000 9.250 C 11.448 9.250 11.000 9.698 11.000 10.250 C 11.000 10.802 11.448 11.250 12.000 11.250 C 12.552 11.250 13.000 10.802 13.000 10.250 C 13.000 9.698 12.552 9.250 12.000 9.250 Z"),
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
        return _billiardsFill!!
    }

private var _billiardsFill: ImageVector? = null

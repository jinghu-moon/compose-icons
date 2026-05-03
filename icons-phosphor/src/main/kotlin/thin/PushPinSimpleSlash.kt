package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorThinIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 87.250 40.000 C 87.250 37.791 89.041 36.000 91.250 36.000 L 192.000 36.000 C 194.209 36.000 196.000 37.791 196.000 40.000 C 196.000 42.209 194.209 44.000 192.000 44.000 L 180.770 44.000 L 200.350 155.000 C 200.731 157.173 199.282 159.244 197.110 159.630 C 196.880 159.678 196.645 159.701 196.410 159.700 C 194.471 159.695 192.814 158.300 192.480 156.390 L 172.640 44.000 L 91.250 44.000 C 89.041 44.000 87.250 42.209 87.250 40.000 ZM 210.690 219.000 C 209.055 220.485 206.526 220.365 205.040 218.730 L 169.870 180.000 L 132.000 180.000 L 132.000 240.000 C 132.000 242.209 130.209 244.000 128.000 244.000 C 125.791 244.000 124.000 242.209 124.000 240.000 L 124.000 180.000 L 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 C 36.000 173.791 37.791 172.000 40.000 172.000 L 52.640 172.000 L 70.520 70.720 L 45.000 42.690 C 43.514 41.033 43.653 38.486 45.310 37.000 C 46.967 35.514 49.514 35.653 51.000 37.310 L 211.000 213.310 C 211.721 214.102 212.094 215.150 212.036 216.220 C 211.977 217.289 211.493 218.291 210.690 219.000 ZM 162.590 172.000 L 77.320 78.200 L 60.770 172.000 Z"),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null

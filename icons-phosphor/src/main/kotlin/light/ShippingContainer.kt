package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorLightIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.850 72.570 L 129.650 42.230 C 128.838 41.998 127.986 41.940 127.150 42.060 L 22.000 57.080 C 15.126 58.102 10.028 63.990 10.000 70.940 L 10.000 185.060 C 10.028 192.010 15.126 197.898 22.000 198.920 L 127.130 213.920 C 127.412 213.960 127.696 213.980 127.980 213.980 C 128.538 213.979 129.093 213.901 129.630 213.750 L 235.830 183.410 C 241.816 181.687 245.955 176.229 246.000 170.000 L 246.000 86.000 C 245.967 79.769 241.836 74.303 235.850 72.570 ZM 96.000 122.000 L 78.000 122.000 L 78.000 61.200 L 122.000 54.920 L 122.000 201.080 L 78.000 194.800 L 78.000 134.000 L 96.000 134.000 C 99.314 134.000 102.000 131.314 102.000 128.000 C 102.000 124.686 99.314 122.000 96.000 122.000 ZM 22.000 185.060 L 22.000 70.940 C 21.990 69.936 22.726 69.080 23.720 68.940 L 66.000 62.940 L 66.000 122.000 L 48.000 122.000 C 44.686 122.000 42.000 124.686 42.000 128.000 C 42.000 131.314 44.686 134.000 48.000 134.000 L 66.000 134.000 L 66.000 193.080 L 23.720 187.080 C 22.718 186.939 21.980 186.071 22.000 185.060 ZM 234.000 170.000 C 233.999 170.892 233.407 171.675 232.550 171.920 L 134.000 200.050 L 134.000 56.000 L 232.550 84.160 C 233.380 84.396 233.964 85.138 234.000 86.000 Z"),
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
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null

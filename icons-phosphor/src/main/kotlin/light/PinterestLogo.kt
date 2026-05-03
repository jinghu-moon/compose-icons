package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorLightIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 112.000 C 222.000 134.050 214.300 154.190 200.320 168.730 C 187.320 182.250 169.710 190.000 152.000 190.000 C 132.580 190.000 120.450 182.930 113.370 176.360 L 101.840 225.360 C 101.208 228.076 98.788 229.998 96.000 230.000 C 95.539 230.001 95.079 229.947 94.630 229.840 C 91.405 229.083 89.404 225.855 90.160 222.630 L 122.160 86.630 C 122.610 84.502 124.176 82.784 126.254 82.140 C 128.332 81.496 130.595 82.027 132.170 83.528 C 133.744 85.029 134.383 87.264 133.840 89.370 L 116.750 162.000 C 119.550 166.330 129.210 178.000 152.000 178.000 C 180.510 178.000 210.000 153.310 210.000 112.000 C 209.990 80.897 190.531 53.120 161.303 42.485 C 132.075 31.850 99.316 40.627 79.320 64.450 C 59.323 88.273 56.359 122.058 71.900 149.000 C 73.019 150.859 73.048 153.177 71.974 155.063 C 70.901 156.948 68.893 158.108 66.724 158.095 C 64.554 158.082 62.561 156.898 61.510 155.000 C 43.444 123.689 46.887 84.423 70.126 56.734 C 93.365 29.045 131.439 18.844 165.408 31.205 C 199.378 43.566 221.991 75.851 222.000 112.000 Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null

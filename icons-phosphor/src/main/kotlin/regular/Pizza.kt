package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorRegularIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 239.540 63.000 C 238.544 58.863 235.933 55.298 232.290 53.100 C 168.173 14.314 87.827 14.314 23.710 53.100 C 20.078 55.303 17.471 58.860 16.463 62.987 C 15.456 67.113 16.131 71.471 18.340 75.100 L 114.340 232.370 C 117.241 237.152 122.427 240.072 128.020 240.072 C 133.613 240.072 138.799 237.152 141.700 232.370 L 237.700 75.100 C 239.912 71.477 240.575 67.117 239.540 63.000 ZM 63.590 118.500 C 70.703 111.797 81.170 110.077 90.054 114.150 C 98.938 118.224 104.464 127.278 104.026 137.042 C 103.588 146.805 97.273 155.328 88.060 158.590 ZM 151.510 185.450 C 143.253 177.664 141.578 165.159 147.496 155.475 C 153.413 145.791 165.304 141.575 176.000 145.370 ZM 184.440 131.520 C 166.039 123.168 144.299 129.852 133.769 147.098 C 123.238 164.345 127.224 186.737 143.060 199.290 L 128.000 224.000 L 96.500 172.430 C 110.617 166.069 119.794 152.131 120.061 136.650 C 120.327 121.168 111.634 106.923 97.744 100.080 C 83.855 93.237 67.263 95.025 55.150 104.670 L 48.800 94.260 C 97.425 64.578 158.565 64.578 207.190 94.260 ZM 215.540 80.590 C 161.785 47.804 94.215 47.804 40.460 80.590 L 32.000 66.770 C 91.029 31.095 164.971 31.095 224.000 66.770 Z"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null

package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorBoldIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.430 62.050 C 242.183 56.880 238.921 52.422 234.370 49.670 C 168.974 10.110 87.026 10.110 21.630 49.670 C 17.097 52.426 13.845 56.869 12.589 62.022 C 11.332 67.176 12.174 72.617 14.930 77.150 L 14.930 77.150 L 110.930 234.410 C 114.556 240.387 121.039 244.037 128.030 244.037 C 135.021 244.037 141.504 240.387 145.130 234.410 L 241.130 77.150 C 243.883 72.626 244.711 67.188 243.430 62.050 ZM 128.000 44.000 C 159.746 43.972 190.940 52.298 218.450 68.140 L 210.000 82.000 C 159.250 52.735 96.750 52.735 46.000 82.000 L 37.550 68.140 C 65.060 52.298 96.254 43.972 128.000 44.000 ZM 83.880 144.060 L 63.140 110.060 C 69.341 106.996 76.685 107.353 82.559 111.005 C 88.433 114.656 92.003 121.083 92.000 128.000 C 91.972 134.333 88.963 140.283 83.880 144.060 ZM 128.000 216.360 L 96.440 164.650 C 109.480 155.961 116.915 140.992 115.960 125.350 C 115.004 109.709 105.801 95.757 91.800 88.720 C 127.473 79.230 165.448 84.166 197.510 102.460 L 188.560 117.120 C 167.990 106.152 142.436 113.132 130.296 133.033 C 118.156 152.934 123.645 178.849 142.810 192.120 ZM 148.000 156.000 C 148.003 149.255 151.406 142.967 157.050 139.274 C 162.694 135.582 169.819 134.982 176.000 137.680 L 155.360 171.510 C 150.700 167.709 147.997 162.014 148.000 156.000 Z"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null

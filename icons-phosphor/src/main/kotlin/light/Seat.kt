package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorLightIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 232.000 C 222.000 235.314 219.314 238.000 216.000 238.000 L 112.000 238.000 C 108.686 238.000 106.000 235.314 106.000 232.000 C 106.000 228.686 108.686 226.000 112.000 226.000 L 216.000 226.000 C 219.314 226.000 222.000 228.686 222.000 232.000 ZM 222.000 160.000 L 222.000 192.000 C 222.000 199.732 215.732 206.000 208.000 206.000 L 114.110 206.000 C 108.800 206.017 103.942 203.016 101.580 198.260 L 43.470 82.260 C 41.509 78.317 41.509 73.683 43.470 69.740 L 65.590 25.740 C 69.012 18.907 77.282 16.081 84.170 19.390 L 117.910 33.630 L 118.250 33.800 C 121.572 35.459 124.099 38.370 125.274 41.891 C 126.450 45.413 126.179 49.258 124.520 52.580 L 124.430 52.740 L 110.180 79.160 C 109.918 79.707 109.918 80.343 110.180 80.890 L 141.960 144.890 C 142.302 145.559 142.989 145.980 143.740 145.980 L 208.000 145.980 C 211.716 145.980 215.280 147.458 217.907 150.088 C 220.533 152.717 222.005 156.284 222.000 160.000 ZM 210.000 160.000 C 210.000 158.895 209.105 158.000 208.000 158.000 L 143.770 158.000 C 138.464 158.013 133.610 155.013 131.250 150.260 L 99.470 86.260 C 97.507 82.325 97.507 77.695 99.470 73.760 L 99.560 73.590 L 113.810 47.170 C 114.023 46.708 114.051 46.182 113.890 45.700 C 113.737 45.237 113.421 44.846 113.000 44.600 L 79.350 30.370 L 79.000 30.210 C 78.724 30.072 78.419 30.000 78.110 30.000 C 77.353 29.999 76.661 30.424 76.320 31.100 L 54.200 75.100 C 53.921 75.661 53.921 76.319 54.200 76.880 L 112.320 192.880 C 112.658 193.560 113.351 193.990 114.110 193.990 L 208.000 193.990 C 209.105 193.990 210.000 193.095 210.000 191.990 Z"),
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
        return _seat!!
    }

private var _seat: ImageVector? = null

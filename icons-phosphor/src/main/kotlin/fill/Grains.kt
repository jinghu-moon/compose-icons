package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorFillIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 56.000 C 197.106 56.001 186.307 58.036 176.160 62.000 C 161.840 32.300 132.910 17.540 131.590 16.870 C 129.337 15.742 126.683 15.742 124.430 16.870 C 123.100 17.510 94.170 32.270 79.850 62.000 C 69.699 58.035 58.898 56.000 48.000 56.000 C 43.582 56.000 40.000 59.582 40.000 64.000 L 40.000 144.000 C 40.054 187.743 72.189 224.825 115.480 231.100 C 116.628 231.251 117.784 230.897 118.651 230.129 C 119.518 229.362 120.010 228.257 120.000 227.100 L 120.000 176.270 C 119.947 171.989 123.205 168.391 127.470 168.020 C 129.682 167.873 131.856 168.651 133.473 170.167 C 135.090 171.684 136.005 173.803 136.000 176.020 L 136.000 227.160 C 135.990 228.317 136.482 229.422 137.349 230.189 C 138.216 230.957 139.372 231.311 140.520 231.160 C 183.834 224.882 215.976 187.766 216.000 144.000 L 216.000 64.000 C 216.000 59.582 212.418 56.000 208.000 56.000 ZM 120.000 149.460 C 105.151 128.295 81.746 114.732 56.000 112.370 L 56.000 72.440 C 92.422 76.558 119.958 107.346 120.000 144.000 ZM 128.000 107.360 C 120.718 91.565 108.949 78.263 94.160 69.110 C 103.370 49.900 120.560 37.780 128.000 33.210 C 135.450 37.790 152.630 49.910 161.840 69.110 C 147.051 78.263 135.282 91.565 128.000 107.360 ZM 200.000 112.360 C 174.254 114.722 150.849 128.285 136.000 149.450 L 136.000 144.000 C 136.042 107.346 163.578 76.558 200.000 72.440 Z"),
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
        return _grains!!
    }

private var _grains: ImageVector? = null

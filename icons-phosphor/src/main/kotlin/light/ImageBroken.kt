package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorLightIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 104.000 214.000 C 106.581 213.999 108.873 212.348 109.690 209.900 L 124.810 164.540 L 162.230 149.540 C 163.753 148.930 164.960 147.723 165.570 146.200 L 180.570 108.780 L 225.900 93.690 C 228.348 92.873 229.999 90.581 230.000 88.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 117.770 154.430 C 116.134 155.086 114.868 156.428 114.310 158.100 L 99.680 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 171.170 L 90.580 118.590 C 90.955 118.214 91.464 118.003 91.995 118.003 C 92.526 118.003 93.035 118.214 93.410 118.590 L 126.000 151.150 ZM 218.000 83.680 L 174.100 98.310 C 172.428 98.868 171.086 100.134 170.430 101.770 L 155.380 139.380 L 138.100 146.300 L 101.900 110.100 C 99.274 107.474 95.713 105.999 92.000 105.999 C 88.287 105.999 84.726 107.474 82.100 110.100 L 38.000 154.200 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 ZM 227.510 116.860 C 225.944 115.732 223.930 115.427 222.100 116.040 L 198.300 124.000 C 196.626 124.560 195.283 125.830 194.630 127.470 L 180.000 164.000 L 143.440 178.630 C 141.811 179.290 140.554 180.632 140.000 182.300 L 132.000 206.100 C 131.389 207.930 131.695 209.941 132.823 211.507 C 133.950 213.072 135.761 214.000 137.690 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 121.730 C 230.001 119.801 229.075 117.989 227.510 116.860 ZM 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 L 146.060 202.000 L 150.480 188.740 L 186.850 174.190 C 188.373 173.580 189.580 172.373 190.190 170.850 L 204.740 134.480 L 218.000 130.060 Z"),
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
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null

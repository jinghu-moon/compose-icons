package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorLightIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 213.000 98.450 C 198.064 93.506 182.591 90.360 166.910 89.080 C 165.632 73.403 162.490 57.933 157.550 43.000 C 183.500 52.096 203.904 72.500 213.000 98.450 ZM 143.520 39.340 C 148.288 51.937 151.678 65.013 153.630 78.340 C 136.236 63.697 116.455 52.153 95.150 44.210 C 110.523 38.189 127.255 36.504 143.520 39.340 ZM 80.150 51.810 C 104.725 59.285 127.486 71.767 147.000 88.470 C 108.043 89.184 70.160 101.357 38.080 123.470 C 39.585 94.154 55.285 67.412 80.150 51.810 ZM 38.550 138.000 C 72.188 112.634 113.435 99.428 155.550 100.540 C 156.662 142.655 143.456 183.902 118.090 217.540 C 76.263 212.837 43.253 179.827 38.550 138.000 ZM 132.550 217.940 C 154.664 185.857 166.838 147.970 167.550 109.010 C 184.255 128.538 196.737 151.313 204.210 175.900 C 188.590 200.734 161.851 216.402 132.550 217.890 ZM 211.790 160.940 C 203.854 139.637 192.316 119.856 177.680 102.460 C 191.007 104.412 204.083 107.802 216.680 112.570 C 219.516 128.835 217.831 145.567 211.810 160.940 Z"),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null

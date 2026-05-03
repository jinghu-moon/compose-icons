package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorThinIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 216.140 101.640 C 199.647 95.817 182.446 92.239 165.000 91.000 C 163.745 73.565 160.153 56.378 154.320 39.900 C 183.976 48.811 207.190 71.995 216.140 101.640 ZM 145.000 37.580 C 150.670 52.272 154.466 67.619 156.300 83.260 C 136.879 66.022 114.232 52.807 89.670 44.380 C 101.689 38.843 114.767 35.984 128.000 36.000 C 133.703 36.001 139.394 36.530 145.000 37.580 ZM 79.860 49.630 C 106.753 57.660 131.508 71.608 152.310 90.450 C 110.599 90.086 69.857 103.025 36.000 127.390 C 36.221 95.638 52.801 66.244 79.860 49.630 ZM 36.440 137.000 C 71.097 110.542 113.867 96.940 157.440 98.520 C 159.020 142.093 145.418 184.863 118.960 219.520 C 75.325 215.147 40.813 180.635 36.440 137.000 ZM 128.610 220.000 C 152.973 186.146 165.912 145.408 165.550 103.700 C 184.392 124.502 198.340 149.257 206.370 176.150 C 189.753 203.206 160.360 219.781 128.610 220.000 ZM 211.610 166.340 C 203.187 141.775 189.976 119.125 172.740 99.700 C 188.381 101.534 203.728 105.330 218.420 111.000 C 219.470 116.606 219.999 122.297 220.000 128.000 C 220.016 141.233 217.157 154.311 211.620 166.330 Z"),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null

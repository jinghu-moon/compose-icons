package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorBoldIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 112.000 C 243.961 78.879 217.121 52.039 184.000 52.000 C 183.000 52.000 182.050 52.000 181.080 52.080 C 170.699 32.383 150.265 20.053 128.000 20.053 C 105.735 20.053 85.301 32.383 74.920 52.080 C 74.000 52.000 73.000 52.000 72.000 52.000 C 44.468 52.057 20.508 70.845 13.886 97.569 C 7.264 124.293 19.680 152.094 44.000 165.000 L 44.000 208.000 C 44.000 219.046 52.954 228.000 64.000 228.000 L 192.000 228.000 C 203.046 228.000 212.000 219.046 212.000 208.000 L 212.000 165.000 C 231.662 154.626 243.976 134.231 244.000 112.000 ZM 188.000 204.000 L 68.000 204.000 L 68.000 171.850 C 69.320 171.940 70.650 172.000 72.000 172.000 L 184.000 172.000 C 185.350 172.000 186.680 171.940 188.000 171.850 ZM 184.000 148.000 L 175.370 148.000 L 179.640 130.910 C 181.119 124.532 177.212 118.146 170.861 116.558 C 164.509 114.970 158.057 118.766 156.360 125.090 L 150.630 148.000 L 140.000 148.000 L 140.000 128.000 C 140.000 121.373 134.627 116.000 128.000 116.000 C 121.373 116.000 116.000 121.373 116.000 128.000 L 116.000 148.000 L 105.370 148.000 L 99.640 125.090 C 98.661 120.866 95.478 117.499 91.316 116.282 C 87.154 115.066 82.660 116.190 79.560 119.221 C 76.460 122.253 75.236 126.722 76.360 130.910 L 80.630 148.000 L 72.000 148.000 C 52.876 147.993 37.094 133.034 36.065 113.938 C 35.035 94.841 49.117 78.273 68.130 76.210 C 68.050 77.470 68.000 78.730 68.000 80.000 C 68.000 86.627 73.373 92.000 80.000 92.000 C 86.627 92.000 92.000 86.627 92.000 80.000 C 92.000 60.118 108.118 44.000 128.000 44.000 C 147.882 44.000 164.000 60.118 164.000 80.000 C 164.000 86.627 169.373 92.000 176.000 92.000 C 182.627 92.000 188.000 86.627 188.000 80.000 C 188.000 78.730 187.950 77.470 187.870 76.210 C 206.883 78.273 220.965 94.841 219.935 113.938 C 218.906 133.034 203.124 147.993 184.000 148.000 Z"),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null

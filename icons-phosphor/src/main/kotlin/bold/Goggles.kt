package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorBoldIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 60.000 L 76.000 60.000 C 34.045 60.044 0.044 94.045 -0.000 136.000 L -0.000 140.000 C 0.002 149.278 5.352 157.724 13.740 161.690 C 16.890 170.400 24.250 178.440 35.260 184.960 C 46.780 191.770 60.860 195.960 72.000 195.960 C 91.668 195.934 108.937 182.877 114.320 163.960 L 141.680 163.960 C 147.049 182.892 164.321 195.969 184.000 196.000 C 202.530 196.000 234.620 183.190 242.310 161.670 C 250.671 157.692 255.999 149.259 256.000 140.000 L 256.000 136.000 C 255.956 94.045 221.955 60.044 180.000 60.000 ZM 76.000 84.000 L 180.000 84.000 C 205.078 84.034 226.569 101.940 231.130 126.600 C 227.927 123.729 224.446 121.183 220.740 119.000 C 209.220 112.190 195.140 108.000 184.000 108.000 C 164.332 108.026 147.063 121.083 141.680 140.000 L 114.320 140.000 C 108.937 121.083 91.668 108.026 72.000 108.000 C 58.600 108.000 38.100 114.710 24.870 126.560 C 29.452 101.918 50.936 84.035 76.000 84.000 ZM 72.000 172.000 C 57.870 172.000 36.000 159.850 36.000 152.000 C 36.000 149.260 39.550 144.390 47.480 139.700 C 56.480 134.380 66.280 132.000 72.000 132.000 C 83.046 132.000 92.000 140.954 92.000 152.000 C 92.000 163.046 83.046 172.000 72.000 172.000 ZM 208.520 164.300 C 199.520 169.620 189.720 172.000 184.000 172.000 C 172.954 172.000 164.000 163.046 164.000 152.000 C 164.000 140.954 172.954 132.000 184.000 132.000 C 198.130 132.000 220.000 144.150 220.000 152.000 C 220.000 154.740 216.450 159.610 208.520 164.300 Z"),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null

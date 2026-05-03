package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Handshake: ImageVector
    get() {
        if (_handshake != null) return _handshake!!
        _handshake = phosphorBoldIcon(
            name = "Handshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 253.880 108.110 L 228.350 57.110 C 225.988 52.357 221.833 48.737 216.800 47.049 C 211.768 45.361 206.271 45.743 201.520 48.110 L 178.340 59.700 L 131.700 44.580 C 129.293 43.810 126.707 43.810 124.300 44.580 L 77.660 59.700 L 54.480 48.110 C 49.729 45.743 44.232 45.361 39.200 47.049 C 34.167 48.737 30.012 52.357 27.650 57.110 L 2.120 108.110 C -0.247 112.861 -0.629 118.358 1.059 123.390 C 2.747 128.423 6.367 132.578 11.120 134.940 L 37.790 148.280 L 88.970 185.690 C 90.182 186.577 91.549 187.231 93.000 187.620 L 155.000 203.620 C 155.980 203.870 156.988 203.998 158.000 204.000 C 161.182 203.997 164.232 202.731 166.480 200.480 L 219.100 147.860 L 244.930 134.940 C 254.810 130.002 258.817 117.990 253.880 108.110 ZM 195.760 137.260 L 168.240 111.260 C 163.509 106.784 156.070 106.899 151.480 111.520 C 141.820 121.260 126.420 128.330 110.670 121.070 L 148.860 84.070 L 171.580 84.070 L 197.390 135.700 ZM 47.320 71.370 L 60.590 78.000 L 38.590 121.900 L 25.320 115.270 ZM 154.320 178.670 L 101.230 165.000 L 59.230 134.340 L 85.170 82.500 L 128.000 68.610 L 129.690 69.160 L 90.000 107.680 L 89.870 107.800 C 85.586 112.089 83.478 118.089 84.139 124.115 C 84.800 130.141 88.158 135.542 93.270 138.800 C 114.220 152.190 139.270 150.870 159.600 136.070 L 178.800 154.220 ZM 217.320 121.900 L 195.320 78.000 L 208.590 71.370 L 230.540 115.270 ZM 118.550 219.000 C 117.755 222.082 115.767 224.722 113.025 226.338 C 110.284 227.955 107.012 228.416 103.930 227.620 L 77.330 220.750 C 75.860 220.371 74.476 219.716 73.250 218.820 L 48.920 201.000 C 43.744 197.033 42.684 189.659 46.533 184.394 C 50.381 179.130 57.729 177.902 63.080 181.630 L 85.550 198.050 L 109.930 204.340 C 113.021 205.135 115.668 207.128 117.285 209.879 C 118.903 212.630 119.358 215.913 118.550 219.000 Z"),
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
        return _handshake!!
    }

private var _handshake: ImageVector? = null

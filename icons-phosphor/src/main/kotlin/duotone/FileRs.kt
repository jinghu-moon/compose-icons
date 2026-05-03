package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileRs: ImageVector
    get() {
        if (_fileRs != null) return _fileRs!!
        _fileRs = phosphorDuotoneIcon(
            name = "FileRs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 L 184.000 216.000 C 179.582 216.000 176.000 219.582 176.000 224.000 C 176.000 228.418 179.582 232.000 184.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 64.000 144.000 L 48.000 144.000 C 43.582 144.000 40.000 147.582 40.000 152.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 C 52.418 216.000 56.000 212.418 56.000 208.000 L 56.000 200.000 L 64.000 200.000 C 65.925 199.997 67.845 199.800 69.730 199.410 L 77.090 212.000 C 79.431 215.515 84.101 216.605 87.756 214.489 C 91.412 212.373 92.792 207.781 90.910 204.000 L 83.800 191.780 C 91.795 183.770 94.181 171.735 89.849 161.281 C 85.517 150.826 75.317 144.007 64.000 144.000 ZM 56.000 184.000 L 56.000 160.000 L 64.000 160.000 C 70.627 160.000 76.000 165.373 76.000 172.000 C 76.000 178.627 70.627 184.000 64.000 184.000 ZM 155.810 196.310 C 155.179 202.506 151.807 208.093 146.620 211.540 C 141.430 215.000 135.000 216.000 129.130 216.000 C 124.023 215.968 118.940 215.296 114.000 214.000 C 111.214 213.261 109.041 211.080 108.312 208.291 C 107.582 205.502 108.410 202.537 110.478 200.529 C 112.545 198.520 115.534 197.780 118.300 198.590 C 122.680 199.790 133.250 201.290 137.850 198.230 C 138.730 197.640 139.680 196.710 139.990 194.300 C 140.340 191.630 139.280 190.200 127.210 186.710 C 117.860 184.010 102.210 179.480 104.210 163.600 C 104.842 157.528 108.139 152.050 113.210 148.650 C 125.050 140.650 143.920 145.340 146.040 145.890 C 150.315 147.014 152.869 151.390 151.745 155.665 C 150.621 159.940 146.245 162.494 141.970 161.370 C 137.480 160.200 126.740 158.810 122.140 161.930 C 120.916 162.755 120.170 164.124 120.140 165.600 C 120.020 166.500 120.000 166.690 121.250 167.500 C 123.560 168.990 127.700 170.180 131.700 171.340 C 141.490 174.170 158.050 179.000 155.810 196.310 Z"),
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
        return _fileRs!!
    }

private var _fileRs: ImageVector? = null

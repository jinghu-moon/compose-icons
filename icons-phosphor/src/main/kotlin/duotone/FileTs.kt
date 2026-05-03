package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileTs: ImageVector
    get() {
        if (_fileTs != null) return _fileTs!!
        _fileTs = phosphorDuotoneIcon(
            name = "FileTs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 L 176.000 216.000 C 171.582 216.000 168.000 219.582 168.000 224.000 C 168.000 228.418 171.582 232.000 176.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 147.810 196.310 C 147.179 202.506 143.807 208.093 138.620 211.540 C 133.430 215.000 127.000 216.000 121.130 216.000 C 116.023 215.968 110.940 215.296 106.000 214.000 C 103.214 213.261 101.041 211.080 100.312 208.291 C 99.582 205.502 100.410 202.537 102.478 200.529 C 104.545 198.520 107.534 197.780 110.300 198.590 C 114.680 199.790 125.300 201.290 129.850 198.230 C 130.730 197.640 131.680 196.710 131.990 194.300 C 132.340 191.630 131.280 190.200 119.210 186.710 C 109.860 184.010 94.210 179.480 96.210 163.600 C 96.842 157.528 100.139 152.050 105.210 148.650 C 117.050 140.650 135.920 145.340 138.040 145.890 C 142.315 147.014 144.869 151.390 143.745 155.665 C 142.621 159.940 138.245 162.494 133.970 161.370 C 129.480 160.200 118.740 158.810 114.140 161.930 C 112.916 162.755 112.170 164.124 112.140 165.600 C 112.020 166.500 112.000 166.690 113.250 167.500 C 115.560 168.990 119.700 170.180 123.700 171.340 C 133.490 174.170 150.050 179.000 147.810 196.310 ZM 88.000 152.000 C 88.000 156.418 84.418 160.000 80.000 160.000 L 68.000 160.000 L 68.000 208.000 C 68.000 212.418 64.418 216.000 60.000 216.000 C 55.582 216.000 52.000 212.418 52.000 208.000 L 52.000 160.000 L 40.000 160.000 C 35.582 160.000 32.000 156.418 32.000 152.000 C 32.000 147.582 35.582 144.000 40.000 144.000 L 80.000 144.000 C 84.418 144.000 88.000 147.582 88.000 152.000 Z"),
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
        return _fileTs!!
    }

private var _fileTs: ImageVector? = null

package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorThinIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 132.000 L 32.000 132.000 C 25.373 132.000 20.000 137.373 20.000 144.000 L 20.000 176.000 C 20.000 182.627 25.373 188.000 32.000 188.000 L 224.000 188.000 C 230.627 188.000 236.000 182.627 236.000 176.000 L 236.000 144.000 C 236.000 137.373 230.627 132.000 224.000 132.000 ZM 28.000 176.000 L 28.000 144.000 C 28.000 141.791 29.791 140.000 32.000 140.000 L 84.000 140.000 L 84.000 180.000 L 32.000 180.000 C 29.791 180.000 28.000 178.209 28.000 176.000 ZM 228.000 176.000 C 228.000 178.209 226.209 180.000 224.000 180.000 L 92.000 180.000 L 92.000 140.000 L 224.000 140.000 C 226.209 140.000 228.000 141.791 228.000 144.000 ZM 204.510 62.000 C 212.730 47.390 212.720 38.770 211.260 34.100 C 210.528 31.368 208.754 29.031 206.320 27.590 C 204.324 26.681 203.432 24.335 204.320 22.330 C 204.756 21.361 205.561 20.605 206.555 20.230 C 207.549 19.855 208.652 19.891 209.620 20.330 C 210.280 20.620 216.140 23.420 218.780 31.330 C 221.780 40.330 219.310 51.990 211.490 65.900 C 203.270 80.510 203.280 89.140 204.740 93.810 C 205.467 96.542 207.242 98.878 209.680 100.310 C 211.465 101.053 212.463 102.967 212.050 104.856 C 211.637 106.745 209.932 108.069 208.000 108.000 C 207.438 107.996 206.884 107.877 206.370 107.650 C 205.710 107.350 199.850 104.560 197.210 96.650 C 194.230 87.590 196.690 76.000 204.510 62.000 ZM 164.510 62.000 C 172.730 47.390 172.720 38.770 171.260 34.100 C 170.528 31.368 168.754 29.031 166.320 27.590 C 164.324 26.681 163.432 24.335 164.320 22.330 C 164.756 21.361 165.561 20.605 166.555 20.230 C 167.549 19.855 168.652 19.891 169.620 20.330 C 170.280 20.620 176.140 23.420 178.780 31.330 C 181.780 40.330 179.310 51.990 171.490 65.900 C 163.270 80.510 163.280 89.140 164.740 93.810 C 165.467 96.542 167.242 98.878 169.680 100.310 C 171.465 101.053 172.463 102.967 172.050 104.856 C 171.637 106.745 169.932 108.069 168.000 108.000 C 167.438 107.996 166.884 107.877 166.370 107.650 C 165.710 107.350 159.850 104.560 157.210 96.650 C 154.230 87.590 156.690 76.000 164.510 62.000 Z"),
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
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null

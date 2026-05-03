package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorThinIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 84.000 C 167.464 84.000 180.000 71.464 180.000 56.000 C 180.000 40.536 167.464 28.000 152.000 28.000 C 136.536 28.000 124.000 40.536 124.000 56.000 C 124.000 71.464 136.536 84.000 152.000 84.000 ZM 152.000 36.000 C 163.046 36.000 172.000 44.954 172.000 56.000 C 172.000 67.046 163.046 76.000 152.000 76.000 C 140.954 76.000 132.000 67.046 132.000 56.000 C 132.000 44.954 140.954 36.000 152.000 36.000 ZM 217.660 137.000 C 217.090 137.260 210.820 140.000 199.580 140.000 C 185.720 140.000 164.330 135.850 136.770 117.840 C 132.204 132.274 125.644 146.000 117.280 158.620 C 126.750 161.180 140.360 166.120 152.420 175.290 C 170.720 189.210 180.000 208.290 180.000 231.970 C 180.000 234.179 178.209 235.970 176.000 235.970 C 173.791 235.970 172.000 234.179 172.000 231.970 C 172.000 216.080 166.120 178.200 112.300 165.600 Q 110.740 167.660 109.080 169.680 C 90.230 192.510 66.660 204.400 40.480 204.400 Q 36.080 204.400 31.590 203.950 C 29.381 203.729 27.769 201.759 27.990 199.550 C 28.211 197.341 30.181 195.729 32.390 195.950 C 59.720 198.680 83.450 188.120 102.910 164.540 C 116.730 147.800 125.800 127.100 129.810 113.220 C 86.970 86.530 58.810 108.420 58.490 108.650 C 57.381 109.597 55.843 109.866 54.479 109.350 C 53.114 108.834 52.138 107.617 51.933 106.172 C 51.727 104.728 52.324 103.286 53.490 102.410 C 53.850 102.120 62.490 95.310 77.330 92.830 C 90.830 90.560 112.330 91.570 138.240 109.170 C 163.240 126.170 182.650 130.810 194.530 131.730 C 207.280 132.730 214.300 129.730 214.370 129.680 C 216.371 128.830 218.685 129.734 219.580 131.716 C 220.474 133.698 219.621 136.032 217.660 136.970 Z"),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null

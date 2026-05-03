package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) return _flyingSaucer!!
        _flyingSaucer = phosphorFillIcon(
            name = "FlyingSaucer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 183.590 213.470 C 184.987 217.662 182.722 222.193 178.530 223.590 C 174.338 224.987 169.807 222.722 168.410 218.530 L 160.410 194.530 C 159.013 190.338 161.278 185.807 165.470 184.410 C 169.662 183.013 174.193 185.278 175.590 189.470 ZM 128.000 184.000 C 123.582 184.000 120.000 187.582 120.000 192.000 L 120.000 224.000 C 120.000 228.418 123.582 232.000 128.000 232.000 C 132.418 232.000 136.000 228.418 136.000 224.000 L 136.000 192.000 C 136.000 187.582 132.418 184.000 128.000 184.000 ZM 90.530 184.410 C 88.517 183.739 86.320 183.895 84.422 184.844 C 82.524 185.793 81.081 187.457 80.410 189.470 L 72.410 213.470 C 71.013 217.662 73.278 222.193 77.470 223.590 C 81.662 224.987 86.193 222.722 87.590 218.530 L 95.590 194.530 C 96.261 192.517 96.105 190.320 95.156 188.422 C 94.207 186.524 92.543 185.081 90.530 184.410 ZM 248.000 112.000 C 248.000 128.220 234.630 142.890 210.350 153.290 C 188.220 162.780 159.000 168.000 128.000 168.000 C 97.000 168.000 67.780 162.780 45.650 153.290 C 21.370 142.890 8.000 128.220 8.000 112.000 C 8.000 103.630 11.670 91.210 29.170 79.500 C 40.540 71.890 56.110 65.740 74.350 61.650 C 84.653 45.326 101.808 34.561 120.988 32.383 C 140.168 30.206 159.300 36.851 173.000 50.450 C 176.450 53.864 179.506 57.654 182.110 61.750 C 223.430 71.090 248.000 89.740 248.000 112.000 ZM 176.000 96.000 C 176.016 87.826 173.929 79.785 169.940 72.650 L 169.880 72.560 C 161.272 57.206 144.961 47.784 127.360 48.000 C 101.250 48.340 80.000 70.250 80.000 96.830 L 80.000 99.830 C 79.979 103.531 82.524 106.754 86.130 107.590 C 99.878 110.621 113.922 112.100 128.000 112.000 C 142.070 112.113 156.107 110.647 169.850 107.630 C 173.461 106.798 176.015 103.576 176.000 99.870 Z"),
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
        return _flyingSaucer!!
    }

private var _flyingSaucer: ImageVector? = null

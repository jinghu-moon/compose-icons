package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorBoldIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.180 48.150 C 239.268 44.346 232.857 43.065 226.860 44.690 L 223.370 45.630 C 204.740 50.650 170.080 60.000 128.000 60.000 C 85.920 60.000 51.260 50.650 32.630 45.630 L 29.140 44.690 C 23.141 43.095 16.740 44.376 11.817 48.157 C 6.894 51.939 4.006 57.792 4.000 64.000 L 4.000 192.000 C 4.000 203.022 12.918 211.967 23.940 212.000 C 25.706 211.997 27.464 211.765 29.170 211.310 L 32.360 210.440 C 51.000 205.390 85.700 196.000 128.000 196.000 C 170.300 196.000 205.000 205.400 223.640 210.450 L 226.830 211.320 C 232.835 212.927 239.246 211.650 244.178 207.865 C 249.109 204.080 252.000 198.217 252.000 192.000 L 252.000 64.000 C 252.019 57.784 249.125 51.917 244.180 48.150 ZM 128.000 84.000 C 172.000 84.000 209.140 74.310 228.000 69.230 L 228.000 177.080 L 176.770 125.860 C 168.960 118.052 156.300 118.052 148.490 125.860 L 131.310 143.000 L 90.140 101.860 C 82.330 94.052 69.670 94.052 61.860 101.860 L 28.000 135.710 L 28.000 69.230 C 46.860 74.310 84.000 84.000 128.000 84.000 ZM 148.280 160.000 L 162.630 145.650 L 196.090 179.110 C 186.000 177.110 174.570 175.180 162.150 173.860 ZM 28.000 186.760 L 28.000 169.650 L 76.000 121.650 L 126.350 172.000 C 83.120 172.240 46.740 181.700 28.000 186.760 ZM 184.000 108.000 C 184.000 99.163 191.163 92.000 200.000 92.000 C 208.837 92.000 216.000 99.163 216.000 108.000 C 216.000 116.837 208.837 124.000 200.000 124.000 C 191.163 124.000 184.000 116.837 184.000 108.000 Z"),
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
        return _panorama!!
    }

private var _panorama: ImageVector? = null

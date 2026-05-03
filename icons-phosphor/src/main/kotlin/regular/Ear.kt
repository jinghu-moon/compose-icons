package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorRegularIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 104.000 C 216.000 108.418 212.418 112.000 208.000 112.000 C 203.582 112.000 200.000 108.418 200.000 104.000 C 200.000 64.235 167.764 32.000 128.000 32.000 C 88.235 32.000 56.000 64.235 56.000 104.000 C 56.000 130.700 64.530 138.920 73.570 147.640 C 82.210 156.000 92.000 165.410 92.000 188.000 C 92.000 207.882 108.118 224.000 128.000 224.000 C 138.240 224.000 146.450 219.840 153.830 210.910 C 155.629 208.643 158.513 207.524 161.370 207.985 C 164.227 208.446 166.613 210.414 167.608 213.132 C 168.604 215.849 168.054 218.893 166.170 221.090 C 155.810 233.640 143.000 240.000 128.000 240.000 C 99.295 239.967 76.033 216.705 76.000 188.000 C 76.000 172.210 70.320 166.730 62.460 159.160 C 52.460 149.500 40.000 137.500 40.000 104.000 C 40.000 55.399 79.399 16.000 128.000 16.000 C 176.601 16.000 216.000 55.399 216.000 104.000 ZM 177.870 161.080 C 176.032 160.015 173.847 159.724 171.795 160.272 C 169.742 160.819 167.992 162.161 166.930 164.000 C 165.120 167.138 161.428 168.668 157.930 167.731 C 154.431 166.793 151.999 163.622 152.000 160.000 C 152.000 150.670 156.820 144.240 162.400 136.800 C 168.770 128.300 176.000 118.670 176.000 104.000 C 176.000 77.490 154.510 56.000 128.000 56.000 C 101.490 56.000 80.000 77.490 80.000 104.000 C 80.000 108.418 83.582 112.000 88.000 112.000 C 92.418 112.000 96.000 108.418 96.000 104.000 C 96.000 86.327 110.327 72.000 128.000 72.000 C 145.673 72.000 160.000 86.327 160.000 104.000 C 160.000 113.330 155.180 119.760 149.600 127.200 C 143.230 135.700 136.000 145.330 136.000 160.000 C 136.004 170.859 143.298 180.363 153.788 183.174 C 164.277 185.985 175.347 181.402 180.780 172.000 C 182.987 168.180 181.685 163.295 177.870 161.080 Z"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null

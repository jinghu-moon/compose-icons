package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorThinIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 76.000 C 166.616 76.003 161.249 76.610 156.000 77.810 C 155.015 46.969 133.387 20.656 103.320 13.720 C 101.977 13.412 100.569 13.818 99.596 14.794 C 98.622 15.769 98.220 17.177 98.530 18.520 C 103.177 38.689 97.110 59.830 82.475 74.465 C 67.840 89.100 46.699 95.167 26.530 90.520 C 25.185 90.208 23.774 90.612 22.798 91.588 C 21.822 92.564 21.418 93.975 21.730 95.320 C 26.198 114.523 38.757 130.853 56.170 140.100 C 43.611 154.221 40.506 174.397 48.238 191.641 C 55.971 208.884 73.102 219.986 92.000 220.000 L 172.000 220.000 C 211.764 220.000 244.000 187.764 244.000 148.000 C 244.000 108.235 211.764 76.000 172.000 76.000 ZM 31.220 99.440 C 34.132 99.812 37.064 99.999 40.000 100.000 C 77.539 99.961 107.961 69.539 108.000 32.000 C 107.999 29.061 107.812 26.125 107.440 23.210 C 131.776 31.434 148.116 54.312 148.000 80.000 L 148.000 80.110 C 126.980 87.534 110.563 104.243 103.510 125.390 C 99.743 124.466 95.879 123.999 92.000 124.000 C 81.257 123.992 70.825 127.606 62.390 134.260 C 47.736 127.323 36.498 114.770 31.220 99.440 ZM 172.000 212.000 L 92.000 212.000 C 76.577 211.988 62.535 203.110 55.910 189.183 C 49.284 175.255 51.256 158.760 60.978 146.787 C 70.700 134.813 86.439 129.496 101.430 133.120 C 100.687 136.629 100.209 140.189 100.000 143.770 C 99.873 145.979 101.561 147.873 103.770 148.000 C 105.979 148.127 107.873 146.439 108.000 144.230 C 108.243 139.951 108.913 135.706 110.000 131.560 C 110.000 131.440 110.070 131.320 110.090 131.200 C 118.762 99.169 150.459 79.062 183.132 84.868 C 215.805 90.674 238.635 120.470 235.740 153.528 C 232.845 186.586 205.184 211.961 172.000 212.000 Z"),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null

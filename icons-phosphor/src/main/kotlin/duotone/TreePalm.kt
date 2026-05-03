package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorDuotoneIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 58.750 L 128.000 104.000 C 127.915 87.185 134.303 70.983 145.840 58.750 C 156.976 46.793 172.581 40.002 188.920 40.002 C 205.259 40.002 220.864 46.793 232.000 58.750 ZM 176.560 98.180 C 160.171 93.794 142.713 96.074 128.000 104.520 L 221.810 176.000 C 226.221 159.719 223.919 142.350 215.420 127.780 C 206.912 113.144 192.931 102.494 176.560 98.180 ZM 110.160 58.750 C 99.024 46.793 83.419 40.002 67.080 40.002 C 50.741 40.002 35.136 46.793 24.000 58.750 L 128.000 104.000 C 128.085 87.185 121.697 70.983 110.160 58.750 ZM 79.440 98.180 C 63.069 102.494 49.088 113.144 40.580 127.780 C 32.081 142.350 29.779 159.719 34.190 176.000 L 128.000 104.520 C 113.287 96.074 95.829 93.794 79.440 98.180 Z"),
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
                pathData = parseSvgPathData("M 237.790 53.230 C 225.145 39.687 207.448 31.999 188.920 31.999 C 170.392 31.999 152.695 39.687 140.050 53.230 C 135.233 58.284 131.174 64.011 128.000 70.230 C 124.842 64.014 120.800 58.288 116.000 53.230 C 103.355 39.687 85.658 31.999 67.130 31.999 C 48.602 31.999 30.905 39.687 18.260 53.230 C 16.460 55.121 15.696 57.773 16.214 60.332 C 16.731 62.892 18.466 65.037 20.860 66.080 L 77.000 90.550 C 58.718 95.438 43.123 107.383 33.640 123.760 C 24.029 140.160 21.434 159.742 26.440 178.080 C 27.136 180.648 29.063 182.703 31.581 183.561 C 34.100 184.420 36.881 183.969 39.000 182.360 L 120.000 120.680 L 120.000 224.000 C 120.000 228.418 123.582 232.000 128.000 232.000 C 132.418 232.000 136.000 228.418 136.000 224.000 L 136.000 120.680 L 217.000 182.360 C 219.119 183.974 221.903 184.427 224.425 183.568 C 226.947 182.709 228.876 180.652 229.570 178.080 C 234.576 159.742 231.981 140.160 222.370 123.760 C 212.885 107.380 197.286 95.436 179.000 90.550 L 235.220 66.080 C 237.614 65.037 239.349 62.892 239.866 60.332 C 240.384 57.773 239.620 55.121 237.820 53.230 ZM 67.080 48.000 C 81.220 48.032 94.716 53.918 104.360 64.260 C 111.489 71.762 116.421 81.077 118.620 91.190 L 39.000 56.530 C 47.309 50.970 57.082 48.001 67.080 48.000 ZM 40.000 161.500 C 39.618 151.091 42.209 140.789 47.470 131.800 C 54.898 118.981 67.138 109.661 81.470 105.910 C 86.242 104.637 91.161 103.995 96.100 104.000 C 101.599 103.999 107.068 104.812 112.330 106.410 ZM 208.500 131.800 C 213.771 140.786 216.373 151.088 216.000 161.500 L 143.700 106.400 C 168.582 98.887 195.374 109.383 208.530 131.800 ZM 137.380 91.190 C 139.579 81.077 144.511 71.762 151.640 64.260 C 161.284 53.918 174.780 48.032 188.920 48.000 C 198.918 48.001 208.691 50.970 217.000 56.530 Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null

package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorBoldIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.690 50.470 C 227.289 36.135 208.544 27.999 188.920 27.999 C 169.296 27.999 150.551 36.135 137.150 50.470 C 133.727 54.071 130.663 57.996 128.000 62.190 C 125.337 57.996 122.273 54.071 118.850 50.470 C 105.449 36.135 86.704 27.999 67.080 27.999 C 47.456 27.999 28.711 36.135 15.310 50.470 C 12.607 53.307 11.460 57.285 12.237 61.126 C 13.014 64.967 15.617 68.186 19.210 69.750 L 66.000 90.120 C 31.355 104.806 12.828 142.774 22.570 179.120 C 23.615 182.974 26.508 186.057 30.289 187.342 C 34.070 188.628 38.242 187.949 41.420 185.530 L 116.000 128.750 L 116.000 224.000 C 116.000 230.627 121.373 236.000 128.000 236.000 C 134.627 236.000 140.000 230.627 140.000 224.000 L 140.000 128.750 L 214.540 185.540 C 217.718 187.959 221.890 188.638 225.671 187.352 C 229.452 186.067 232.345 182.984 233.390 179.130 C 243.132 142.784 224.605 104.816 189.960 90.130 L 236.790 69.760 C 240.383 68.196 242.986 64.977 243.763 61.136 C 244.540 57.295 243.393 53.317 240.690 50.480 ZM 67.080 52.000 C 80.121 52.031 92.567 57.462 101.460 67.000 C 106.148 71.935 109.830 77.737 112.300 84.080 L 48.000 56.100 C 53.996 53.393 60.501 51.995 67.080 52.000 ZM 44.390 153.150 C 47.092 132.276 62.174 115.122 82.530 109.770 C 86.954 108.595 91.512 108.000 96.090 108.000 C 98.431 107.994 100.770 108.151 103.090 108.470 ZM 205.000 133.810 C 208.468 139.749 210.703 146.327 211.570 153.150 L 153.000 108.460 C 159.856 107.533 166.828 107.979 173.510 109.770 C 186.787 113.275 198.119 121.927 205.000 133.810 ZM 143.700 84.080 C 146.170 77.737 149.852 71.935 154.540 67.000 C 163.433 57.462 175.879 52.031 188.920 52.000 C 195.499 51.995 202.004 53.393 208.000 56.100 Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null

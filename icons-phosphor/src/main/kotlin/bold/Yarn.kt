package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Yarn: ImageVector
    get() {
        if (_yarn != null) return _yarn!!
        _yarn = phosphorBoldIcon(
            name = "Yarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 212.000 L 195.830 212.000 C 236.713 178.949 247.837 121.251 222.174 75.369 C 196.511 29.486 141.525 8.766 91.964 26.302 C 42.404 43.838 12.685 94.529 21.588 146.341 C 30.492 198.153 75.428 236.015 128.000 236.000 L 232.000 236.000 C 238.627 236.000 244.000 230.627 244.000 224.000 C 244.000 217.373 238.627 212.000 232.000 212.000 ZM 128.000 44.000 C 140.048 43.989 151.955 46.593 162.900 51.630 Q 153.210 56.450 144.000 62.140 C 133.747 55.770 123.003 50.226 111.870 45.560 C 117.184 44.524 122.586 44.002 128.000 44.000 ZM 79.330 59.600 C 94.357 63.812 108.844 69.756 122.500 77.310 Q 115.770 82.660 109.500 88.510 C 95.411 81.293 80.456 75.909 65.000 72.490 C 69.272 67.664 74.080 63.339 79.330 59.600 ZM 51.110 94.230 C 65.183 96.556 78.885 100.735 91.860 106.660 Q 86.420 112.910 81.420 119.560 C 70.095 114.776 58.211 111.443 46.050 109.640 C 47.230 104.350 48.924 99.189 51.110 94.230 ZM 53.870 167.460 C 48.284 156.997 44.991 145.465 44.210 133.630 C 52.263 134.960 60.163 137.094 67.790 140.000 C 62.539 148.830 57.888 158.004 53.870 167.460 ZM 71.000 189.670 C 90.196 134.382 132.067 89.909 186.100 67.420 C 190.184 71.332 193.868 75.640 197.100 80.280 C 143.227 100.765 101.737 144.846 84.550 199.860 C 79.702 196.929 75.162 193.515 71.000 189.670 ZM 122.670 211.820 C 117.267 211.487 111.909 210.633 106.670 209.270 C 121.437 159.476 158.934 119.631 207.740 101.870 C 209.421 107.004 210.600 112.288 211.260 117.650 C 168.935 133.906 136.334 168.576 122.710 211.820 ZM 149.070 209.310 C 160.752 180.762 182.593 157.552 210.380 144.160 C 204.120 175.819 180.326 201.120 149.110 209.310 Z"),
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
        return _yarn!!
    }

private var _yarn: ImageVector? = null

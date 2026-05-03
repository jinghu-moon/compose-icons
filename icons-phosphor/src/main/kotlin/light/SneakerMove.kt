package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorLightIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.260 168.420 L 201.640 154.110 C 184.655 145.692 173.935 128.347 174.000 109.390 L 174.000 80.000 C 174.000 76.686 171.314 74.000 168.000 74.000 C 140.399 73.967 118.033 51.601 118.000 24.000 C 117.998 21.724 116.708 19.645 114.670 18.632 C 112.631 17.619 110.195 17.847 108.380 19.220 L 31.380 77.630 L 31.230 77.740 C 28.137 80.231 26.248 83.918 26.033 87.883 C 25.817 91.848 27.296 95.719 30.100 98.530 L 143.820 212.240 C 144.944 213.366 146.469 213.999 148.060 214.000 L 224.000 214.000 C 231.732 214.000 238.000 207.732 238.000 200.000 L 238.000 180.940 C 238.013 175.634 235.013 170.780 230.260 168.420 ZM 226.000 200.000 C 226.000 201.105 225.105 202.000 224.000 202.000 L 150.540 202.000 L 38.590 90.000 C 38.197 89.610 37.983 89.074 38.000 88.520 C 38.028 87.976 38.277 87.466 38.690 87.110 L 53.050 76.220 L 93.050 116.220 C 95.397 118.532 99.170 118.519 101.501 116.191 C 103.832 113.862 103.849 110.090 101.540 107.740 L 62.710 68.910 L 107.000 35.300 C 112.081 62.466 134.495 83.010 162.000 85.710 L 162.000 109.390 C 161.919 132.895 175.210 154.401 196.270 164.840 L 224.890 179.160 C 225.566 179.496 225.996 180.185 226.000 180.940 ZM 70.800 182.000 L 32.000 182.000 C 28.686 182.000 26.000 179.314 26.000 176.000 C 26.000 172.686 28.686 170.000 32.000 170.000 L 70.800 170.000 C 74.114 170.000 76.800 172.686 76.800 176.000 C 76.800 179.314 74.114 182.000 70.800 182.000 ZM 108.800 208.000 C 108.800 211.314 106.114 214.000 102.800 214.000 L 48.000 214.000 C 44.686 214.000 42.000 211.314 42.000 208.000 C 42.000 204.686 44.686 202.000 48.000 202.000 L 102.800 202.000 C 106.114 202.000 108.800 204.686 108.800 208.000 Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null

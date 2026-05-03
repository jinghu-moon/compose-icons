package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorDuotoneIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 152.000 56.000 C 152.000 69.255 141.255 80.000 128.000 80.000 C 114.745 80.000 104.000 69.255 104.000 56.000 C 104.000 42.745 114.745 32.000 128.000 32.000 C 141.255 32.000 152.000 42.745 152.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 128.000 88.000 C 145.673 88.000 160.000 73.673 160.000 56.000 C 160.000 38.327 145.673 24.000 128.000 24.000 C 110.327 24.000 96.000 38.327 96.000 56.000 C 96.000 73.673 110.327 88.000 128.000 88.000 ZM 128.000 40.000 C 136.837 40.000 144.000 47.163 144.000 56.000 C 144.000 64.837 136.837 72.000 128.000 72.000 C 119.163 72.000 112.000 64.837 112.000 56.000 C 112.000 47.163 119.163 40.000 128.000 40.000 ZM 48.000 96.000 C 48.000 87.163 55.163 80.000 64.000 80.000 C 72.837 80.000 80.000 87.163 80.000 96.000 C 80.000 104.837 72.837 112.000 64.000 112.000 C 55.163 112.000 48.000 104.837 48.000 96.000 ZM 222.240 110.610 C 219.483 114.061 214.452 114.625 211.000 111.870 C 209.850 110.980 187.290 94.170 151.680 112.480 C 151.400 122.655 150.397 132.797 148.680 142.830 L 181.110 169.830 C 183.642 171.938 184.623 175.384 183.580 178.510 L 167.580 226.510 C 166.183 230.702 161.652 232.967 157.460 231.570 C 153.268 230.173 151.003 225.642 152.400 221.450 L 166.670 178.630 L 144.590 160.230 C 143.147 165.094 141.445 169.878 139.490 174.560 C 125.740 207.300 101.110 229.190 66.290 239.640 C 62.100 240.793 57.755 238.390 56.506 234.227 C 55.256 230.065 57.558 225.666 61.690 224.320 C 122.370 206.110 132.830 152.100 135.110 122.670 C 108.000 139.880 86.570 144.000 72.360 144.000 C 65.666 144.023 59.016 142.917 52.690 140.730 C 49.201 139.205 47.270 135.433 48.073 131.711 C 48.877 127.989 52.193 125.349 56.000 125.400 C 57.143 125.398 58.273 125.648 59.310 126.130 C 59.310 126.130 86.070 136.810 131.500 105.930 C 183.790 70.390 219.500 98.160 221.010 99.360 C 222.665 100.688 223.725 102.620 223.956 104.730 C 224.187 106.840 223.569 108.955 222.240 110.610 Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null

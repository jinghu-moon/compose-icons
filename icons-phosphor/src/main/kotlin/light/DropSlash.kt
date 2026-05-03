package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorLightIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 67.260 70.070 C 50.510 94.930 42.000 119.770 42.000 144.000 C 42.004 178.903 63.102 210.343 95.401 223.573 C 127.700 236.804 164.791 229.201 189.280 204.330 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 128.000 218.000 C 87.151 217.950 54.050 184.849 54.000 144.000 C 54.000 123.000 61.270 101.240 75.590 79.270 L 181.180 195.420 C 167.258 209.860 148.058 218.012 128.000 218.000 ZM 91.400 49.070 C 90.246 47.971 89.577 46.459 89.540 44.866 C 89.502 43.274 90.099 41.732 91.200 40.580 C 101.404 29.760 112.570 19.890 124.560 11.090 C 126.626 9.645 129.374 9.645 131.440 11.090 C 146.508 22.188 160.290 34.934 172.530 49.090 C 199.660 80.260 214.000 113.090 214.000 144.000 C 214.003 151.727 212.967 159.419 210.920 166.870 C 210.205 169.473 207.839 171.278 205.140 171.280 C 204.603 171.279 204.069 171.209 203.550 171.070 C 202.014 170.649 200.708 169.635 199.920 168.251 C 199.132 166.866 198.927 165.226 199.350 163.690 C 201.114 157.276 202.006 150.653 202.000 144.000 C 202.000 84.370 143.000 35.060 128.000 23.480 C 118.008 31.228 108.608 39.711 99.880 48.860 C 97.596 51.259 93.800 51.353 91.400 49.070 Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null

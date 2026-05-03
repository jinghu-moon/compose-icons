package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorLightIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.070 176.940 C 214.410 167.200 206.000 139.730 206.000 104.000 C 206.000 60.922 171.078 26.000 128.000 26.000 C 84.922 26.000 50.000 60.922 50.000 104.000 C 50.000 139.740 41.580 167.200 35.920 176.940 C 33.392 181.268 33.372 186.618 35.865 190.966 C 38.359 195.314 42.988 197.997 48.000 198.000 L 90.480 198.000 C 93.490 216.370 109.365 229.856 127.980 229.856 C 146.595 229.856 162.470 216.370 165.480 198.000 L 208.000 198.000 C 213.009 197.989 217.630 195.304 220.120 190.957 C 222.609 186.611 222.586 181.265 220.060 176.940 ZM 128.000 218.000 C 115.955 217.996 105.490 209.720 102.710 198.000 L 153.290 198.000 C 150.510 209.720 140.045 217.996 128.000 218.000 ZM 209.710 185.000 C 209.374 185.624 208.719 186.010 208.010 186.000 L 48.000 186.000 C 47.291 186.010 46.636 185.624 46.300 185.000 C 45.943 184.381 45.943 183.619 46.300 183.000 C 53.870 170.000 62.000 139.690 62.000 104.000 C 62.000 67.549 91.549 38.000 128.000 38.000 C 164.451 38.000 194.000 67.549 194.000 104.000 C 194.000 139.680 202.140 169.950 209.710 183.000 C 210.067 183.619 210.067 184.381 209.710 185.000 Z"),
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
        return _bell!!
    }

private var _bell: ImageVector? = null

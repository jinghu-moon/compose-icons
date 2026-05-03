package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorLightIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 78.000 C 168.569 78.000 182.000 64.569 182.000 48.000 C 182.000 31.431 168.569 18.000 152.000 18.000 C 135.431 18.000 122.000 31.431 122.000 48.000 C 122.000 64.569 135.431 78.000 152.000 78.000 ZM 152.000 30.000 C 161.941 30.000 170.000 38.059 170.000 48.000 C 170.000 57.941 161.941 66.000 152.000 66.000 C 142.059 66.000 134.000 57.941 134.000 48.000 C 134.000 38.059 142.059 30.000 152.000 30.000 ZM 214.000 144.000 C 214.000 147.314 211.314 150.000 208.000 150.000 C 173.520 150.000 156.940 133.250 142.300 118.480 C 138.830 114.970 135.550 111.660 132.150 108.700 L 117.000 143.610 L 155.520 171.120 C 157.084 172.253 158.007 174.069 158.000 176.000 L 158.000 232.000 C 158.000 235.314 155.314 238.000 152.000 238.000 C 148.686 238.000 146.000 235.314 146.000 232.000 L 146.000 179.090 L 112.080 154.860 L 77.500 234.390 C 76.114 237.316 72.656 238.615 69.686 237.324 C 66.717 236.034 65.307 232.620 66.500 229.610 L 121.500 103.000 C 111.320 100.250 98.430 103.000 82.990 111.290 C 71.875 117.415 61.500 124.797 52.070 133.290 C 49.647 135.490 45.908 135.343 43.666 132.959 C 41.424 130.575 41.505 126.834 43.850 124.550 C 53.975 115.357 65.141 107.379 77.120 100.780 C 103.050 86.780 124.760 86.390 139.890 99.520 C 143.660 102.790 147.290 106.450 150.790 109.990 C 164.410 123.740 178.480 137.990 207.960 137.990 C 209.560 137.979 211.098 138.608 212.232 139.737 C 213.366 140.865 214.003 142.400 214.000 144.000 Z"),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorLightIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 78.000 C 178.359 78.000 190.000 66.359 190.000 52.000 C 190.000 37.641 178.359 26.000 164.000 26.000 C 149.641 26.000 138.000 37.641 138.000 52.000 C 138.000 66.359 149.641 78.000 164.000 78.000 ZM 164.000 38.000 C 171.732 38.000 178.000 44.268 178.000 52.000 C 178.000 59.732 171.732 66.000 164.000 66.000 C 156.268 66.000 150.000 59.732 150.000 52.000 C 150.000 44.268 156.268 38.000 164.000 38.000 ZM 253.160 196.940 L 198.600 104.860 C 196.101 100.606 191.534 97.995 186.600 98.000 L 186.600 98.000 C 181.665 97.991 177.096 100.603 174.600 104.860 L 146.720 151.910 L 100.160 72.910 C 97.644 68.636 93.055 66.012 88.095 66.012 C 83.135 66.012 78.546 68.636 76.030 72.910 L 2.830 197.000 C 1.761 198.852 1.758 201.134 2.823 202.989 C 3.889 204.843 5.861 205.991 8.000 206.000 L 248.000 206.000 C 250.156 206.000 252.146 204.843 253.213 202.969 C 254.280 201.096 254.259 198.794 253.160 196.940 ZM 86.270 79.000 C 86.628 78.383 87.287 78.004 88.000 78.004 C 88.713 78.004 89.372 78.383 89.730 79.000 L 115.070 122.000 L 60.930 122.000 ZM 18.500 194.000 L 53.860 134.000 L 122.150 134.000 L 141.450 166.770 L 141.450 166.770 L 157.450 193.970 ZM 171.430 194.000 L 153.580 163.710 L 184.830 111.000 C 185.185 110.385 185.840 110.004 186.550 110.000 C 187.264 109.989 187.926 110.374 188.270 111.000 L 237.470 194.000 Z"),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null

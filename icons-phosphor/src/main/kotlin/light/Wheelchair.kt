package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorLightIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 253.690 190.100 C 252.640 186.958 249.242 185.261 246.100 186.310 L 227.000 192.660 L 197.320 133.320 C 196.312 131.301 194.257 130.018 192.000 130.000 L 110.000 130.000 L 110.000 102.050 C 110.660 102.050 111.330 102.050 112.000 102.050 L 168.000 102.050 C 171.314 102.050 174.000 99.364 174.000 96.050 C 174.000 92.736 171.314 90.050 168.000 90.050 L 112.000 90.050 C 111.330 90.050 110.670 90.050 110.000 90.050 L 110.000 77.400 C 125.090 74.320 135.396 60.314 133.848 44.991 C 132.300 29.668 119.401 18.006 104.000 18.006 C 88.599 18.006 75.700 29.668 74.152 44.991 C 72.604 60.314 82.910 74.320 98.000 77.400 L 98.000 91.400 C 62.757 98.556 38.670 131.254 42.284 167.035 C 45.898 202.816 76.037 230.036 112.000 230.000 C 144.620 230.000 174.000 207.920 181.810 177.500 C 182.638 174.291 180.709 171.018 177.500 170.190 C 174.291 169.362 171.018 171.291 170.190 174.500 C 163.700 199.710 139.190 218.000 112.000 218.000 C 82.703 217.990 58.013 196.133 54.450 167.053 C 50.888 137.973 69.571 110.802 98.000 103.720 L 98.000 136.000 C 98.000 139.314 100.686 142.000 104.000 142.000 L 188.290 142.000 L 218.630 202.680 C 219.969 205.350 223.068 206.629 225.900 205.680 L 249.900 197.680 C 253.037 196.630 254.732 193.239 253.690 190.100 ZM 86.000 48.000 C 86.000 38.059 94.059 30.000 104.000 30.000 C 113.941 30.000 122.000 38.059 122.000 48.000 C 122.000 57.941 113.941 66.000 104.000 66.000 C 94.059 66.000 86.000 57.941 86.000 48.000 Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null

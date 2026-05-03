package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorLightIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.900 82.790 L 189.210 30.100 C 183.744 24.639 174.886 24.639 169.420 30.100 L 62.100 137.420 C 56.639 142.886 56.639 151.744 62.100 157.210 L 84.200 179.310 L 35.760 227.760 C 34.155 229.256 33.494 231.508 34.037 233.634 C 34.580 235.760 36.240 237.420 38.366 237.963 C 40.492 238.506 42.744 237.845 44.240 236.240 L 92.690 187.800 L 114.790 209.900 C 120.256 215.361 129.114 215.361 134.580 209.900 L 241.900 102.580 C 247.361 97.114 247.361 88.256 241.900 82.790 ZM 126.100 201.420 C 125.725 201.796 125.216 202.007 124.685 202.007 C 124.154 202.007 123.645 201.796 123.270 201.420 L 101.170 179.310 L 132.240 148.240 C 134.443 145.876 134.378 142.192 132.093 139.907 C 129.808 137.622 126.124 137.557 123.760 139.760 L 92.690 170.830 L 70.580 148.730 C 70.204 148.355 69.993 147.846 69.993 147.315 C 69.993 146.784 70.204 146.275 70.580 145.900 L 106.480 110.000 L 162.000 110.000 L 162.000 165.520 ZM 233.420 94.100 L 174.000 153.520 L 174.000 104.000 C 174.000 100.686 171.314 98.000 168.000 98.000 L 118.480 98.000 L 177.900 38.580 C 178.275 38.204 178.784 37.993 179.315 37.993 C 179.846 37.993 180.355 38.204 180.730 38.580 L 233.420 91.270 C 233.796 91.645 234.007 92.154 234.007 92.685 C 234.007 93.216 233.796 93.725 233.420 94.100 ZM 60.000 86.000 C 74.359 86.000 86.000 74.359 86.000 60.000 C 86.000 45.641 74.359 34.000 60.000 34.000 C 45.641 34.000 34.000 45.641 34.000 60.000 C 34.000 74.359 45.641 86.000 60.000 86.000 ZM 60.000 46.000 C 67.732 46.000 74.000 52.268 74.000 60.000 C 74.000 67.732 67.732 74.000 60.000 74.000 C 52.268 74.000 46.000 67.732 46.000 60.000 C 46.000 52.268 52.268 46.000 60.000 46.000 Z"),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null

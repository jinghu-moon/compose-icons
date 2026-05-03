package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorLightIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.910 74.790 L 181.220 22.100 C 178.594 19.474 175.033 17.999 171.320 17.999 C 167.607 17.999 164.046 19.474 161.420 22.100 L 22.090 161.410 C 19.464 164.036 17.989 167.597 17.989 171.310 C 17.989 175.023 19.464 178.584 22.090 181.210 L 74.780 233.900 C 77.406 236.526 80.967 238.001 84.680 238.001 C 88.393 238.001 91.954 236.526 94.580 233.900 L 233.910 94.590 C 236.536 91.964 238.011 88.403 238.011 84.690 C 238.011 80.977 236.536 77.416 233.910 74.790 ZM 225.420 86.100 L 86.100 225.410 L 86.100 225.410 C 85.725 225.786 85.216 225.997 84.685 225.997 C 84.154 225.997 83.645 225.786 83.270 225.410 L 30.580 172.730 C 30.204 172.355 29.993 171.846 29.993 171.315 C 29.993 170.784 30.204 170.275 30.580 169.900 L 64.000 136.480 L 91.760 164.240 C 93.256 165.845 95.508 166.506 97.634 165.963 C 99.760 165.420 101.420 163.760 101.963 161.634 C 102.506 159.508 101.845 157.256 100.240 155.760 L 72.480 128.000 L 96.000 104.480 L 123.760 132.240 C 126.124 134.443 129.808 134.378 132.093 132.093 C 134.378 129.808 134.443 126.124 132.240 123.760 L 104.480 96.000 L 128.000 72.490 L 155.760 100.240 C 158.124 102.443 161.808 102.378 164.093 100.093 C 166.378 97.808 166.443 94.124 164.240 91.760 L 136.490 64.000 L 169.900 30.590 C 170.275 30.214 170.784 30.003 171.315 30.003 C 171.846 30.003 172.355 30.214 172.730 30.590 L 225.420 83.270 C 225.796 83.645 226.007 84.154 226.007 84.685 C 226.007 85.216 225.796 85.725 225.420 86.100 Z"),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null

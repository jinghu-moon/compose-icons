package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorFillIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 198.000 131.660 C 184.810 146.660 172.660 151.950 161.630 151.950 C 146.690 151.950 133.820 142.340 123.200 134.410 C 104.000 120.070 91.310 110.600 70.000 134.890 C 68.166 137.210 65.201 138.329 62.291 137.799 C 59.381 137.269 57.001 135.177 56.102 132.358 C 55.204 129.540 55.934 126.456 58.000 124.340 C 89.050 88.930 114.340 107.810 132.800 121.590 C 152.000 135.930 164.690 145.400 186.000 121.110 C 187.834 118.790 190.799 117.671 193.709 118.201 C 196.619 118.731 198.999 120.823 199.898 123.642 C 200.796 126.460 200.066 129.544 198.000 131.660 Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null

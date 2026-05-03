package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorBoldIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 128.000 C 252.003 152.270 237.384 174.151 214.962 183.440 C 192.540 192.728 166.730 187.593 149.570 170.430 L 149.080 169.900 L 89.220 102.310 C 75.094 88.442 52.421 88.582 38.466 102.623 C 24.512 116.663 24.512 139.337 38.466 153.377 C 52.421 167.418 75.094 167.558 89.220 153.690 L 92.300 150.210 C 96.693 145.239 104.284 144.772 109.255 149.165 C 114.226 153.558 114.693 161.149 110.300 166.120 L 106.950 169.900 L 106.460 170.430 C 83.027 193.859 45.039 193.856 21.610 170.425 C -1.820 146.994 -1.820 109.006 21.610 85.575 C 45.039 62.144 83.027 62.141 106.460 85.570 L 106.950 86.100 L 166.810 153.690 C 180.936 167.558 203.609 167.418 217.564 153.377 C 231.518 139.337 231.518 116.663 217.564 102.623 C 203.609 88.582 180.936 88.442 166.810 102.310 L 163.730 105.790 C 159.337 110.761 151.746 111.228 146.775 106.835 C 141.804 102.442 141.337 94.851 145.730 89.880 L 149.080 86.100 L 149.570 85.570 C 166.730 68.407 192.540 63.272 214.962 72.560 C 237.384 81.849 252.003 103.730 252.000 128.000 Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null

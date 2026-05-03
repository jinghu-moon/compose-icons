package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorFillIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 232.000 C 224.000 236.418 220.418 240.000 216.000 240.000 L 112.000 240.000 C 107.582 240.000 104.000 236.418 104.000 232.000 C 104.000 227.582 107.582 224.000 112.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 227.582 224.000 232.000 ZM 208.000 144.000 L 143.780 144.000 L 112.000 80.000 L 126.190 53.680 C 126.233 53.610 126.269 53.536 126.300 53.460 C 130.248 45.559 127.048 35.954 119.150 32.000 L 118.680 31.780 L 85.000 17.570 C 77.133 13.813 67.706 17.046 63.800 24.840 L 41.680 68.840 C 39.440 73.351 39.440 78.649 41.680 83.160 L 99.790 199.160 C 102.490 204.593 108.043 208.021 114.110 208.000 L 208.000 208.000 C 216.837 208.000 224.000 200.837 224.000 192.000 L 224.000 160.000 C 224.000 151.163 216.837 144.000 208.000 144.000 Z"),
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
        return _seat!!
    }

private var _seat: ImageVector? = null

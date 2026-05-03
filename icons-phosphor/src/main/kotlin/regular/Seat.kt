package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorRegularIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 232.000 C 224.000 236.418 220.418 240.000 216.000 240.000 L 112.000 240.000 C 107.582 240.000 104.000 236.418 104.000 232.000 C 104.000 227.582 107.582 224.000 112.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 227.582 224.000 232.000 ZM 224.000 160.000 L 224.000 192.000 C 224.000 200.837 216.837 208.000 208.000 208.000 L 114.110 208.000 C 108.040 208.019 102.488 204.587 99.790 199.150 L 41.680 83.150 C 39.440 78.639 39.440 73.341 41.680 68.830 L 63.800 24.830 C 67.706 17.036 77.133 13.803 85.000 17.560 L 118.690 31.780 L 119.160 32.000 C 127.058 35.954 130.258 45.559 126.310 53.460 C 126.279 53.536 126.243 53.610 126.200 53.680 L 112.000 80.000 L 143.780 144.000 L 208.000 144.000 C 216.837 144.000 224.000 151.163 224.000 160.000 ZM 208.000 160.000 L 143.770 160.000 C 137.703 160.020 132.152 156.587 129.460 151.150 L 97.670 87.150 C 95.436 82.649 95.436 77.361 97.670 72.860 L 97.790 72.640 L 112.000 46.320 L 78.570 32.210 C 78.410 32.148 78.253 32.078 78.100 32.000 L 56.000 76.000 L 114.100 192.000 L 208.000 192.000 Z"),
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

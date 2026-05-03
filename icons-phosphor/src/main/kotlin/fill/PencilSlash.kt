package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) return _pencilSlash!!
        _pencilSlash = phosphorFillIcon(
            name = "PencilSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 90.280 98.380 L 36.680 152.000 C 33.672 154.994 31.987 159.066 32.000 163.310 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 92.690 224.000 C 96.936 224.014 101.010 222.324 104.000 219.310 L 154.400 168.920 L 202.090 221.380 C 204.002 223.535 206.925 224.496 209.743 223.895 C 212.560 223.294 214.837 221.225 215.704 218.478 C 216.571 215.730 215.893 212.729 213.930 210.620 ZM 101.060 110.260 L 117.000 127.740 L 68.000 176.690 L 51.310 160.000 ZM 48.000 208.000 L 48.000 179.310 L 76.690 208.000 ZM 96.000 204.690 L 79.320 188.000 L 127.730 139.590 L 143.620 157.070 ZM 227.320 96.000 L 183.000 140.340 C 179.869 143.469 174.794 143.466 171.665 140.335 C 168.536 137.204 168.539 132.129 171.670 129.000 L 186.350 114.320 L 169.660 97.660 L 156.310 111.000 C 153.165 113.988 148.211 113.925 145.143 110.857 C 142.075 107.789 142.012 102.835 145.000 99.690 L 158.350 86.340 L 158.350 86.340 L 141.660 69.660 L 129.660 81.660 C 126.537 84.786 121.471 84.788 118.345 81.665 C 115.219 78.542 115.217 73.476 118.340 70.350 L 160.000 28.690 C 163.001 25.689 167.071 24.002 171.315 24.002 C 175.559 24.002 179.629 25.689 182.630 28.690 L 227.320 73.370 C 230.321 76.371 232.008 80.441 232.008 84.685 C 232.008 88.929 230.321 92.999 227.320 96.000 Z"),
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
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null

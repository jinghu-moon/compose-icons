package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) return _pencilSimpleSlash!!
        _pencilSimpleSlash = phosphorRegularIcon(
            name = "PencilSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 90.280 98.380 L 36.680 152.000 C 33.672 154.994 31.987 159.066 32.000 163.310 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 92.690 224.000 C 96.936 224.014 101.010 222.324 104.000 219.310 L 154.400 168.920 L 202.090 221.380 C 204.002 223.535 206.925 224.496 209.743 223.895 C 212.560 223.294 214.837 221.225 215.704 218.478 C 216.571 215.730 215.893 212.729 213.930 210.620 ZM 92.690 208.000 L 48.000 208.000 L 48.000 163.310 L 101.060 110.310 L 143.620 157.120 ZM 227.320 73.370 L 182.630 28.690 C 179.629 25.689 175.559 24.002 171.315 24.002 C 167.071 24.002 163.001 25.689 160.000 28.690 L 118.330 70.360 C 115.207 73.486 115.209 78.552 118.335 81.675 C 121.461 84.798 126.527 84.796 129.650 81.670 L 136.000 75.310 L 180.690 120.000 L 171.690 129.000 C 168.559 132.123 168.552 137.194 171.675 140.325 C 174.798 143.456 179.869 143.463 183.000 140.340 L 227.320 96.000 C 230.321 92.999 232.008 88.929 232.008 84.685 C 232.008 80.441 230.321 76.371 227.320 73.370 ZM 192.000 108.690 L 147.320 64.000 L 171.320 40.000 L 216.000 84.690 Z"),
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
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null

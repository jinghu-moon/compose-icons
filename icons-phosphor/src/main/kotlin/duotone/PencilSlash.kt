package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) return _pencilSlash!!
        _pencilSlash = phosphorDuotoneIcon(
            name = "PencilSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 221.660 90.340 L 192.000 120.000 L 136.000 64.000 L 165.660 34.340 C 168.784 31.218 173.846 31.218 176.970 34.340 L 221.660 79.000 C 223.168 80.501 224.016 82.542 224.016 84.670 C 224.016 86.798 223.168 88.839 221.660 90.340 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 90.280 98.380 L 36.680 152.000 C 33.672 154.994 31.987 159.066 32.000 163.310 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 92.690 224.000 C 96.936 224.014 101.010 222.324 104.000 219.310 L 154.400 168.920 L 202.090 221.380 C 204.002 223.535 206.925 224.496 209.743 223.895 C 212.560 223.294 214.837 221.225 215.704 218.478 C 216.571 215.730 215.893 212.729 213.930 210.620 ZM 116.920 127.740 L 68.000 176.690 L 51.310 160.000 L 101.060 110.260 ZM 48.000 179.310 L 76.690 208.000 L 48.000 208.000 ZM 96.000 204.690 L 79.320 188.000 L 127.730 139.590 L 143.620 157.070 ZM 227.320 73.370 L 182.630 28.690 C 179.629 25.689 175.559 24.002 171.315 24.002 C 167.071 24.002 163.001 25.689 160.000 28.690 L 118.330 70.360 C 115.207 73.486 115.209 78.552 118.335 81.675 C 121.461 84.798 126.527 84.796 129.650 81.670 L 136.000 75.310 L 152.690 92.000 L 145.000 99.690 C 142.893 101.692 142.037 104.680 142.765 107.494 C 143.494 110.309 145.691 112.506 148.506 113.235 C 151.320 113.963 154.308 113.107 156.310 111.000 L 164.000 103.310 L 180.690 120.000 L 171.690 129.000 C 168.559 132.123 168.552 137.194 171.675 140.325 C 174.798 143.456 179.869 143.463 183.000 140.340 L 227.320 96.000 C 230.321 92.999 232.008 88.929 232.008 84.685 C 232.008 80.441 230.321 76.371 227.320 73.370 ZM 192.000 108.690 L 147.320 64.000 L 171.320 40.000 L 216.000 84.690 Z"),
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

package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorFillIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 24.000 L 88.000 24.000 C 57.169 24.000 32.138 48.920 32.000 79.750 C 32.000 122.470 40.000 155.150 46.700 175.030 C 55.420 200.830 67.320 220.520 79.340 229.030 C 81.998 230.951 85.191 231.990 88.470 232.000 C 96.877 231.976 103.848 225.484 104.470 217.100 C 105.320 205.580 109.470 167.990 128.000 167.990 C 146.530 167.990 150.680 205.580 151.530 217.100 C 151.959 222.882 155.466 227.986 160.710 230.460 C 165.884 232.942 172.001 232.402 176.660 229.050 C 188.660 220.520 200.580 200.830 209.300 175.050 C 216.000 155.150 224.000 122.470 224.000 79.750 C 223.862 48.920 198.831 24.000 168.000 24.000 ZM 171.000 80.570 C 175.101 82.227 177.082 86.894 175.425 90.995 C 173.768 95.096 169.101 97.077 165.000 95.420 L 128.000 80.610 L 91.000 95.420 C 86.899 97.077 82.232 95.096 80.575 90.995 C 78.918 86.894 80.899 82.227 85.000 80.570 L 106.460 72.000 L 85.000 63.420 C 80.899 61.763 78.918 57.096 80.575 52.995 C 82.232 48.894 86.899 46.913 91.000 48.570 L 128.000 63.380 L 165.000 48.570 C 169.101 46.913 173.768 48.894 175.425 52.995 C 177.082 57.096 175.101 61.763 171.000 63.420 L 149.540 72.000 Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null

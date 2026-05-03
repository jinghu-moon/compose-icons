package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorDuotoneIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 72.000 L 120.690 123.050 C 96.690 116.350 75.110 108.790 75.110 88.050 C 75.110 65.960 97.110 48.050 128.000 48.050 C 151.200 48.000 168.370 57.640 176.000 72.000 ZM 120.690 123.050 L 72.000 168.000 C 72.000 190.090 97.070 208.000 128.000 208.000 C 158.930 208.000 184.000 190.090 184.000 168.000 C 184.000 138.430 150.520 131.400 120.690 123.050 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 175.930 136.000 C 185.120 143.110 192.000 153.200 192.000 168.000 C 192.000 181.340 185.000 193.700 172.250 202.790 C 160.330 211.310 144.610 216.000 128.000 216.000 C 111.390 216.000 95.670 211.310 83.750 202.790 C 71.000 193.700 64.000 181.340 64.000 168.000 C 64.000 163.582 67.582 160.000 72.000 160.000 C 76.418 160.000 80.000 163.582 80.000 168.000 C 80.000 185.350 102.000 200.000 128.000 200.000 C 154.000 200.000 176.000 185.350 176.000 168.000 C 176.000 153.150 165.460 144.420 137.230 136.000 L 40.000 136.000 C 35.582 136.000 32.000 132.418 32.000 128.000 C 32.000 123.582 35.582 120.000 40.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 ZM 76.330 104.000 C 78.895 104.002 81.306 102.774 82.813 100.698 C 84.319 98.621 84.738 95.948 83.940 93.510 C 83.367 91.730 83.087 89.869 83.110 88.000 C 83.110 69.760 102.410 56.000 128.000 56.000 C 146.840 56.000 162.160 63.420 169.000 75.850 C 171.244 79.465 175.924 80.691 179.652 78.641 C 183.380 76.590 184.851 71.981 183.000 68.150 C 173.330 50.520 152.770 40.000 128.000 40.000 C 93.290 40.000 67.110 60.630 67.110 88.000 C 67.093 91.560 67.640 95.101 68.730 98.490 C 69.806 101.776 72.872 103.999 76.330 104.000 Z"),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null

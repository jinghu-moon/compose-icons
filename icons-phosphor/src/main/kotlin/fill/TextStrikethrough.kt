package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorFillIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 82.710 94.580 C 86.000 76.570 104.580 64.000 128.000 64.000 C 146.200 64.000 161.590 71.410 169.180 83.830 C 171.483 87.602 170.292 92.527 166.520 94.830 C 162.748 97.133 157.823 95.942 155.520 92.170 C 150.940 84.660 140.390 80.000 128.000 80.000 C 112.700 80.000 100.270 87.330 98.450 97.420 C 97.764 101.224 94.456 103.994 90.590 104.000 C 90.110 104.001 89.632 103.957 89.160 103.870 C 84.814 103.084 81.927 98.926 82.710 94.580 ZM 192.000 136.000 L 168.290 136.000 C 173.369 141.407 176.136 148.583 176.000 156.000 C 176.000 176.190 154.920 192.000 128.000 192.000 C 104.110 192.000 84.170 179.220 80.570 161.600 C 79.905 158.764 80.835 155.791 82.997 153.838 C 85.158 151.886 88.210 151.262 90.964 152.211 C 93.719 153.160 95.739 155.530 96.240 158.400 C 98.240 168.270 112.240 176.000 128.000 176.000 C 145.350 176.000 160.000 166.840 160.000 156.000 C 160.000 146.860 153.240 141.570 134.280 136.000 L 64.000 136.000 C 59.582 136.000 56.000 132.418 56.000 128.000 C 56.000 123.582 59.582 120.000 64.000 120.000 L 192.000 120.000 C 196.418 120.000 200.000 123.582 200.000 128.000 C 200.000 132.418 196.418 136.000 192.000 136.000 Z"),
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

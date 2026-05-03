package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorThinIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 36.000 C 161.679 36.023 192.658 54.431 208.780 84.000 L 128.000 84.000 C 105.219 84.028 86.218 101.420 84.180 124.110 L 54.510 72.720 C 71.868 49.603 99.091 36.000 128.000 36.000 ZM 128.000 164.000 C 108.118 164.000 92.000 147.882 92.000 128.000 C 92.000 108.118 108.118 92.000 128.000 92.000 C 147.882 92.000 164.000 108.118 164.000 128.000 C 164.000 147.882 147.882 164.000 128.000 164.000 ZM 36.000 128.000 C 35.983 111.075 40.660 94.477 49.510 80.050 L 89.900 150.000 C 89.900 150.090 90.010 150.170 90.070 150.260 C 101.523 169.829 125.988 177.467 146.540 167.890 L 116.840 219.320 C 70.718 213.625 36.058 174.472 36.000 128.000 ZM 128.000 220.000 C 127.230 220.000 126.470 220.000 125.710 220.000 L 166.100 150.000 C 166.136 149.936 166.166 149.869 166.190 149.800 C 177.487 130.088 171.873 105.014 153.250 92.000 L 212.660 92.000 C 224.743 120.416 221.765 152.998 204.730 178.753 C 187.696 204.507 158.878 219.999 128.000 220.000 Z"),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null

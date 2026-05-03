package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorThinIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 92.578 27.993 59.795 46.726 41.818 77.248 C 23.840 107.769 23.350 145.523 40.530 176.500 L 28.630 212.190 C 27.192 216.502 28.314 221.257 31.528 224.472 C 34.743 227.686 39.498 228.808 43.810 227.370 L 79.500 215.470 C 116.080 235.739 161.411 231.104 193.132 203.851 C 224.854 176.599 236.266 132.485 221.741 93.268 C 207.216 54.051 169.821 28.014 128.000 28.000 ZM 128.000 220.000 C 111.825 220.005 95.934 215.745 81.930 207.650 C 81.321 207.300 80.632 207.114 79.930 207.110 C 79.498 207.110 79.069 207.181 78.660 207.320 L 41.280 219.780 C 39.843 220.259 38.258 219.885 37.186 218.814 C 36.115 217.742 35.741 216.157 36.220 214.720 L 48.680 177.340 C 49.044 176.253 48.923 175.062 48.350 174.070 C 27.495 138.022 33.457 92.461 62.884 62.992 C 92.312 33.523 137.865 27.498 173.942 48.301 C 210.019 69.105 227.622 111.550 216.857 151.780 C 206.093 192.011 169.646 219.993 128.000 220.000 Z"),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null

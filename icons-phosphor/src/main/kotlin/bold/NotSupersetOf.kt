package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorBoldIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 188.000 L 89.670 188.000 L 104.220 172.000 L 152.000 172.000 C 178.183 171.979 202.029 156.927 213.311 133.299 C 224.592 109.671 221.305 81.664 204.860 61.290 L 216.860 48.070 C 221.221 43.154 220.817 35.645 215.954 31.226 C 211.091 26.806 203.577 27.120 199.100 31.930 L 186.700 45.560 C 176.209 39.297 164.218 35.993 152.000 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 C 44.000 54.627 49.373 60.000 56.000 60.000 L 152.000 60.000 C 158.228 59.996 164.386 61.322 170.060 63.890 L 93.600 148.000 L 56.000 148.000 C 49.373 148.000 44.000 153.373 44.000 160.000 C 44.000 166.627 49.373 172.000 56.000 172.000 L 71.780 172.000 L 39.120 207.930 C 36.175 211.093 35.159 215.595 36.459 219.716 C 37.759 223.838 41.175 226.942 45.401 227.843 C 49.628 228.744 54.012 227.303 56.880 224.070 L 67.880 212.000 L 208.000 212.000 C 214.627 212.000 220.000 206.627 220.000 200.000 C 220.000 193.373 214.627 188.000 208.000 188.000 ZM 188.440 79.360 C 197.554 92.844 198.481 110.257 190.849 124.632 C 183.218 139.007 168.275 147.995 152.000 148.000 L 126.000 148.000 Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null

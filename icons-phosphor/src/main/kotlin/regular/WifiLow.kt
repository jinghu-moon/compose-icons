package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorRegularIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 204.000 C 140.000 210.627 134.627 216.000 128.000 216.000 C 121.373 216.000 116.000 210.627 116.000 204.000 C 116.000 197.373 121.373 192.000 128.000 192.000 C 134.627 192.000 140.000 197.373 140.000 204.000 ZM 172.710 158.530 C 146.052 139.156 109.948 139.156 83.290 158.530 C 79.717 161.131 78.929 166.137 81.530 169.710 C 84.131 173.283 89.137 174.071 92.710 171.470 C 113.749 156.169 142.251 156.169 163.290 171.470 C 166.863 174.071 171.869 173.283 174.470 169.710 C 177.071 166.137 176.283 161.131 172.710 158.530 Z"),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null

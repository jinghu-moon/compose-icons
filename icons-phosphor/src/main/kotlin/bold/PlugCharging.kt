package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorBoldIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 180.000 48.000 L 180.000 16.000 C 180.000 9.373 174.627 4.000 168.000 4.000 C 161.373 4.000 156.000 9.373 156.000 16.000 L 156.000 48.000 L 100.000 48.000 L 100.000 16.000 C 100.000 9.373 94.627 4.000 88.000 4.000 C 81.373 4.000 76.000 9.373 76.000 16.000 L 76.000 48.000 L 32.550 48.000 C 24.400 48.000 20.000 54.180 20.000 60.000 C 20.000 66.627 25.373 72.000 32.000 72.000 L 44.000 72.000 L 44.000 164.000 C 44.028 188.289 63.711 207.972 88.000 208.000 L 116.000 208.000 L 116.000 240.000 C 116.000 246.627 121.373 252.000 128.000 252.000 C 134.627 252.000 140.000 246.627 140.000 240.000 L 140.000 208.000 L 168.000 208.000 C 192.289 207.972 211.972 188.289 212.000 164.000 L 212.000 72.000 L 224.000 72.000 C 230.627 72.000 236.000 66.627 236.000 60.000 C 236.000 53.373 230.627 48.000 224.000 48.000 ZM 188.000 164.000 C 188.000 175.046 179.046 184.000 168.000 184.000 L 88.000 184.000 C 76.954 184.000 68.000 175.046 68.000 164.000 L 68.000 72.000 L 188.000 72.000 ZM 102.140 134.830 C 99.912 131.608 99.397 127.502 100.760 123.830 L 112.760 91.830 C 115.085 85.622 122.002 82.475 128.210 84.800 C 134.418 87.125 137.565 94.042 135.240 100.250 L 129.320 116.000 L 144.000 116.000 C 147.936 115.999 151.621 117.928 153.864 121.162 C 156.107 124.396 156.621 128.525 155.240 132.210 L 143.240 164.210 C 140.915 170.418 133.998 173.565 127.790 171.240 C 121.582 168.915 118.435 161.998 120.760 155.790 L 126.680 140.000 L 112.000 140.000 C 108.064 139.998 104.380 138.066 102.140 134.830 Z"),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null

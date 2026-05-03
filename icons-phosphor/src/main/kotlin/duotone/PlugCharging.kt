package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorDuotoneIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 64.000 L 200.000 160.000 C 200.000 177.673 185.673 192.000 168.000 192.000 L 88.000 192.000 C 70.327 192.000 56.000 177.673 56.000 160.000 L 56.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 56.000 L 176.000 56.000 L 176.000 16.000 C 176.000 11.582 172.418 8.000 168.000 8.000 C 163.582 8.000 160.000 11.582 160.000 16.000 L 160.000 56.000 L 96.000 56.000 L 96.000 16.000 C 96.000 11.582 92.418 8.000 88.000 8.000 C 83.582 8.000 80.000 11.582 80.000 16.000 L 80.000 56.000 L 32.550 56.000 C 26.280 56.000 24.000 60.780 24.000 64.000 C 24.000 68.418 27.582 72.000 32.000 72.000 L 48.000 72.000 L 48.000 160.000 C 48.000 182.091 65.909 200.000 88.000 200.000 L 120.000 200.000 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 200.000 L 168.000 200.000 C 190.091 200.000 208.000 182.091 208.000 160.000 L 208.000 72.000 L 224.000 72.000 C 228.418 72.000 232.000 68.418 232.000 64.000 C 232.000 59.582 228.418 56.000 224.000 56.000 ZM 192.000 160.000 C 192.000 173.255 181.255 184.000 168.000 184.000 L 88.000 184.000 C 74.745 184.000 64.000 173.255 64.000 160.000 L 64.000 72.000 L 192.000 72.000 ZM 105.420 132.560 C 103.926 130.401 103.586 127.647 104.510 125.190 L 116.510 93.190 C 118.062 89.048 122.678 86.948 126.820 88.500 C 130.962 90.052 133.062 94.668 131.510 98.810 L 123.510 120.000 L 144.000 120.000 C 146.624 120.000 149.081 121.287 150.576 123.444 C 152.070 125.601 152.412 128.353 151.490 130.810 L 139.490 162.810 C 137.938 166.952 133.322 169.052 129.180 167.500 C 125.038 165.948 122.938 161.332 124.490 157.190 L 132.490 136.000 L 112.000 136.000 C 109.375 136.002 106.916 134.717 105.420 132.560 Z"),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null

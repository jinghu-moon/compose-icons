package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = phosphorFillIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.000 172.000 C 80.000 178.627 74.627 184.000 68.000 184.000 C 61.373 184.000 56.000 178.627 56.000 172.000 C 56.000 165.373 61.373 160.000 68.000 160.000 C 74.627 160.000 80.000 165.373 80.000 172.000 ZM 120.000 172.000 C 120.000 200.719 96.719 224.000 68.000 224.000 C 39.281 224.000 16.000 200.719 16.000 172.000 C 16.000 143.281 39.281 120.000 68.000 120.000 C 96.705 120.033 119.967 143.295 120.000 172.000 ZM 96.000 172.000 C 96.000 156.536 83.464 144.000 68.000 144.000 C 52.536 144.000 40.000 156.536 40.000 172.000 C 40.000 187.464 52.536 200.000 68.000 200.000 C 83.464 200.000 96.000 187.464 96.000 172.000 ZM 248.000 188.000 C 247.967 207.080 233.054 222.820 214.003 223.882 C 194.953 224.944 178.383 210.958 176.230 192.000 L 144.000 192.000 C 139.582 192.000 136.000 188.418 136.000 184.000 L 136.000 172.000 C 135.961 134.461 105.539 104.039 68.000 104.000 L 40.000 104.000 C 35.582 104.000 32.000 100.418 32.000 96.000 C 32.000 91.582 35.582 88.000 40.000 88.000 L 48.000 88.000 L 48.000 56.000 L 40.000 56.000 C 35.582 56.000 32.000 52.418 32.000 48.000 C 32.000 43.582 35.582 40.000 40.000 40.000 L 160.000 40.000 C 164.418 40.000 168.000 43.582 168.000 48.000 C 168.000 52.418 164.418 56.000 160.000 56.000 L 152.000 56.000 L 152.000 97.880 L 176.000 104.380 L 176.000 72.000 C 176.000 67.582 179.582 64.000 184.000 64.000 C 188.418 64.000 192.000 67.582 192.000 72.000 L 192.000 108.710 L 228.390 118.570 L 228.600 118.630 C 235.405 120.634 240.057 126.906 240.000 134.000 L 240.000 165.460 C 245.172 171.834 247.996 179.792 248.000 188.000 ZM 228.000 188.000 C 228.000 179.163 220.837 172.000 212.000 172.000 C 203.163 172.000 196.000 179.163 196.000 188.000 C 196.000 196.837 203.163 204.000 212.000 204.000 C 220.837 204.000 228.000 196.837 228.000 188.000 Z"),
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
        return _tractor!!
    }

private var _tractor: ImageVector? = null

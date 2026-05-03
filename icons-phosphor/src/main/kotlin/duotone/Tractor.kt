package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = phosphorDuotoneIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 188.000 C 240.000 203.464 227.464 216.000 212.000 216.000 C 196.536 216.000 184.000 203.464 184.000 188.000 C 184.000 172.536 196.536 160.000 212.000 160.000 C 227.464 160.000 240.000 172.536 240.000 188.000 ZM 68.000 128.000 C 43.699 128.000 24.000 147.699 24.000 172.000 C 24.000 196.301 43.699 216.000 68.000 216.000 C 92.301 216.000 112.000 196.301 112.000 172.000 C 112.000 147.699 92.301 128.000 68.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 240.000 165.410 L 240.000 134.000 C 240.035 126.925 235.387 120.679 228.600 118.680 L 228.390 118.620 L 192.000 108.710 L 192.000 72.000 C 192.000 67.582 188.418 64.000 184.000 64.000 C 179.582 64.000 176.000 67.582 176.000 72.000 L 176.000 104.380 L 152.000 97.880 L 152.000 56.000 L 160.000 56.000 C 164.418 56.000 168.000 52.418 168.000 48.000 C 168.000 43.582 164.418 40.000 160.000 40.000 L 40.000 40.000 C 35.582 40.000 32.000 43.582 32.000 48.000 C 32.000 52.418 35.582 56.000 40.000 56.000 L 48.000 56.000 L 48.000 88.000 L 40.000 88.000 C 35.582 88.000 32.000 91.582 32.000 96.000 C 32.000 100.418 35.582 104.000 40.000 104.000 L 68.000 104.000 C 105.539 104.039 135.961 134.461 136.000 172.000 L 136.000 184.000 C 136.000 188.418 139.582 192.000 144.000 192.000 L 176.230 192.000 C 177.912 207.248 189.071 219.755 204.030 223.157 C 218.988 226.559 234.459 220.108 242.570 207.087 C 250.681 194.066 249.649 177.336 240.000 165.410 ZM 68.000 88.000 L 64.000 88.000 L 64.000 56.000 L 136.000 56.000 L 136.000 122.770 C 120.226 100.940 94.933 88.007 68.000 88.000 ZM 152.000 114.450 L 224.000 134.000 L 224.000 154.100 C 205.267 147.469 184.704 157.272 178.060 176.000 L 152.000 176.000 ZM 212.000 208.000 C 200.954 208.000 192.000 199.046 192.000 188.000 C 192.000 176.954 200.954 168.000 212.000 168.000 C 223.046 168.000 232.000 176.954 232.000 188.000 C 232.000 199.046 223.046 208.000 212.000 208.000 ZM 68.000 120.000 C 39.281 120.000 16.000 143.281 16.000 172.000 C 16.000 200.719 39.281 224.000 68.000 224.000 C 96.719 224.000 120.000 200.719 120.000 172.000 C 119.967 143.295 96.705 120.033 68.000 120.000 ZM 68.000 208.000 C 48.118 208.000 32.000 191.882 32.000 172.000 C 32.000 152.118 48.118 136.000 68.000 136.000 C 87.882 136.000 104.000 152.118 104.000 172.000 C 104.000 191.882 87.882 208.000 68.000 208.000 ZM 80.000 172.000 C 80.000 178.627 74.627 184.000 68.000 184.000 C 61.373 184.000 56.000 178.627 56.000 172.000 C 56.000 165.373 61.373 160.000 68.000 160.000 C 74.627 160.000 80.000 165.373 80.000 172.000 Z"),
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
        return _tractor!!
    }

private var _tractor: ImageVector? = null

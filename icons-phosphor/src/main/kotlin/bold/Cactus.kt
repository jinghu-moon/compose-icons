package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorBoldIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 204.000 L 172.000 204.000 L 172.000 188.000 C 211.746 187.956 243.956 155.746 244.000 116.000 C 244.000 98.327 229.673 84.000 212.000 84.000 C 194.327 84.000 180.000 98.327 180.000 116.000 C 180.000 120.418 176.418 124.000 172.000 124.000 L 172.000 56.000 C 172.000 31.699 152.301 12.000 128.000 12.000 C 103.699 12.000 84.000 31.699 84.000 56.000 L 84.000 84.000 C 79.582 84.000 76.000 80.418 76.000 76.000 C 76.000 58.327 61.673 44.000 44.000 44.000 C 26.327 44.000 12.000 58.327 12.000 76.000 C 12.044 115.746 44.254 147.956 84.000 148.000 L 84.000 204.000 L 40.000 204.000 C 33.373 204.000 28.000 209.373 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 C 228.000 209.373 222.627 204.000 216.000 204.000 ZM 96.000 124.000 L 84.000 124.000 C 57.502 123.972 36.028 102.498 36.000 76.000 C 36.000 71.582 39.582 68.000 44.000 68.000 C 48.418 68.000 52.000 71.582 52.000 76.000 C 52.000 93.673 66.327 108.000 84.000 108.000 L 96.000 108.000 C 102.627 108.000 108.000 102.627 108.000 96.000 L 108.000 56.000 C 108.000 44.954 116.954 36.000 128.000 36.000 C 139.046 36.000 148.000 44.954 148.000 56.000 L 148.000 136.000 C 148.000 142.627 153.373 148.000 160.000 148.000 L 172.000 148.000 C 189.673 148.000 204.000 133.673 204.000 116.000 C 204.000 111.582 207.582 108.000 212.000 108.000 C 216.418 108.000 220.000 111.582 220.000 116.000 C 219.972 142.498 198.498 163.972 172.000 164.000 L 160.000 164.000 C 153.373 164.000 148.000 169.373 148.000 176.000 L 148.000 204.000 L 108.000 204.000 L 108.000 136.000 C 108.000 129.373 102.627 124.000 96.000 124.000 Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null

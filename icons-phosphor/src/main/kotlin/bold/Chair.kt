package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorBoldIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 128.000 L 180.000 128.000 L 180.000 108.000 L 192.000 108.000 C 203.046 108.000 212.000 99.046 212.000 88.000 L 212.000 40.000 C 212.000 28.954 203.046 20.000 192.000 20.000 L 64.000 20.000 C 52.954 20.000 44.000 28.954 44.000 40.000 L 44.000 88.000 C 44.000 99.046 52.954 108.000 64.000 108.000 L 76.000 108.000 L 76.000 128.000 L 48.000 128.000 C 36.954 128.000 28.000 136.954 28.000 148.000 L 28.000 172.000 C 28.000 183.046 36.954 192.000 48.000 192.000 L 56.000 192.000 L 56.000 224.000 C 56.000 230.627 61.373 236.000 68.000 236.000 C 74.627 236.000 80.000 230.627 80.000 224.000 L 80.000 192.000 L 176.000 192.000 L 176.000 224.000 C 176.000 230.627 181.373 236.000 188.000 236.000 C 194.627 236.000 200.000 230.627 200.000 224.000 L 200.000 192.000 L 208.000 192.000 C 219.046 192.000 228.000 183.046 228.000 172.000 L 228.000 148.000 C 228.000 136.954 219.046 128.000 208.000 128.000 ZM 68.000 44.000 L 188.000 44.000 L 188.000 84.000 L 68.000 84.000 ZM 100.000 108.000 L 156.000 108.000 L 156.000 128.000 L 100.000 128.000 ZM 204.000 168.000 L 52.000 168.000 L 52.000 152.000 L 204.000 152.000 Z"),
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
        return _chair!!
    }

private var _chair: ImageVector? = null

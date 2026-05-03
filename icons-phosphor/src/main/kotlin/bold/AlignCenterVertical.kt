package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorBoldIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 116.000 L 216.000 116.000 L 216.000 72.000 C 216.000 60.954 207.046 52.000 196.000 52.000 L 156.000 52.000 C 144.954 52.000 136.000 60.954 136.000 72.000 L 136.000 116.000 L 120.000 116.000 L 120.000 48.000 C 120.000 36.954 111.046 28.000 100.000 28.000 L 60.000 28.000 C 48.954 28.000 40.000 36.954 40.000 48.000 L 40.000 116.000 L 32.000 116.000 C 25.373 116.000 20.000 121.373 20.000 128.000 C 20.000 134.627 25.373 140.000 32.000 140.000 L 40.000 140.000 L 40.000 208.000 C 40.000 219.046 48.954 228.000 60.000 228.000 L 100.000 228.000 C 111.046 228.000 120.000 219.046 120.000 208.000 L 120.000 140.000 L 136.000 140.000 L 136.000 184.000 C 136.000 195.046 144.954 204.000 156.000 204.000 L 196.000 204.000 C 207.046 204.000 216.000 195.046 216.000 184.000 L 216.000 140.000 L 224.000 140.000 C 230.627 140.000 236.000 134.627 236.000 128.000 C 236.000 121.373 230.627 116.000 224.000 116.000 ZM 96.000 204.000 L 64.000 204.000 L 64.000 52.000 L 96.000 52.000 ZM 192.000 180.000 L 160.000 180.000 L 160.000 76.000 L 192.000 76.000 Z"),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null

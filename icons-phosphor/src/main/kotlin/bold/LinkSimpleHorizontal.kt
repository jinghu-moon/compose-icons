package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimpleHorizontal: ImageVector
    get() {
        if (_linkSimpleHorizontal != null) return _linkSimpleHorizontal!!
        _linkSimpleHorizontal = phosphorBoldIcon(
            name = "LinkSimpleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.000 116.000 L 176.000 116.000 C 182.627 116.000 188.000 121.373 188.000 128.000 C 188.000 134.627 182.627 140.000 176.000 140.000 L 80.000 140.000 C 73.373 140.000 68.000 134.627 68.000 128.000 C 68.000 121.373 73.373 116.000 80.000 116.000 ZM 104.000 164.000 L 64.000 164.000 C 44.118 164.000 28.000 147.882 28.000 128.000 C 28.000 108.118 44.118 92.000 64.000 92.000 L 104.000 92.000 C 110.627 92.000 116.000 86.627 116.000 80.000 C 116.000 73.373 110.627 68.000 104.000 68.000 L 64.000 68.000 C 30.863 68.000 4.000 94.863 4.000 128.000 C 4.000 161.137 30.863 188.000 64.000 188.000 L 104.000 188.000 C 110.627 188.000 116.000 182.627 116.000 176.000 C 116.000 169.373 110.627 164.000 104.000 164.000 ZM 192.000 68.000 L 152.000 68.000 C 145.373 68.000 140.000 73.373 140.000 80.000 C 140.000 86.627 145.373 92.000 152.000 92.000 L 192.000 92.000 C 211.882 92.000 228.000 108.118 228.000 128.000 C 228.000 147.882 211.882 164.000 192.000 164.000 L 152.000 164.000 C 145.373 164.000 140.000 169.373 140.000 176.000 C 140.000 182.627 145.373 188.000 152.000 188.000 L 192.000 188.000 C 225.137 188.000 252.000 161.137 252.000 128.000 C 252.000 94.863 225.137 68.000 192.000 68.000 Z"),
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
        return _linkSimpleHorizontal!!
    }

private var _linkSimpleHorizontal: ImageVector? = null

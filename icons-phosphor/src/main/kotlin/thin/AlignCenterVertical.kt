package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorThinIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 124.000 L 204.000 124.000 L 204.000 72.000 C 204.000 65.373 198.627 60.000 192.000 60.000 L 152.000 60.000 C 145.373 60.000 140.000 65.373 140.000 72.000 L 140.000 124.000 L 116.000 124.000 L 116.000 48.000 C 116.000 41.373 110.627 36.000 104.000 36.000 L 64.000 36.000 C 57.373 36.000 52.000 41.373 52.000 48.000 L 52.000 124.000 L 32.000 124.000 C 29.791 124.000 28.000 125.791 28.000 128.000 C 28.000 130.209 29.791 132.000 32.000 132.000 L 52.000 132.000 L 52.000 208.000 C 52.000 214.627 57.373 220.000 64.000 220.000 L 104.000 220.000 C 110.627 220.000 116.000 214.627 116.000 208.000 L 116.000 132.000 L 140.000 132.000 L 140.000 184.000 C 140.000 190.627 145.373 196.000 152.000 196.000 L 192.000 196.000 C 198.627 196.000 204.000 190.627 204.000 184.000 L 204.000 132.000 L 224.000 132.000 C 226.209 132.000 228.000 130.209 228.000 128.000 C 228.000 125.791 226.209 124.000 224.000 124.000 ZM 108.000 208.000 C 108.000 210.209 106.209 212.000 104.000 212.000 L 64.000 212.000 C 61.791 212.000 60.000 210.209 60.000 208.000 L 60.000 48.000 C 60.000 45.791 61.791 44.000 64.000 44.000 L 104.000 44.000 C 106.209 44.000 108.000 45.791 108.000 48.000 ZM 196.000 184.000 C 196.000 186.209 194.209 188.000 192.000 188.000 L 152.000 188.000 C 149.791 188.000 148.000 186.209 148.000 184.000 L 148.000 72.000 C 148.000 69.791 149.791 68.000 152.000 68.000 L 192.000 68.000 C 194.209 68.000 196.000 69.791 196.000 72.000 Z"),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null

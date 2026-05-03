package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorThinIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 140.000 L 132.000 140.000 L 132.000 116.000 L 184.000 116.000 C 190.627 116.000 196.000 110.627 196.000 104.000 L 196.000 64.000 C 196.000 57.373 190.627 52.000 184.000 52.000 L 132.000 52.000 L 132.000 32.000 C 132.000 29.791 130.209 28.000 128.000 28.000 C 125.791 28.000 124.000 29.791 124.000 32.000 L 124.000 52.000 L 72.000 52.000 C 65.373 52.000 60.000 57.373 60.000 64.000 L 60.000 104.000 C 60.000 110.627 65.373 116.000 72.000 116.000 L 124.000 116.000 L 124.000 140.000 L 48.000 140.000 C 41.373 140.000 36.000 145.373 36.000 152.000 L 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 L 124.000 204.000 L 124.000 224.000 C 124.000 226.209 125.791 228.000 128.000 228.000 C 130.209 228.000 132.000 226.209 132.000 224.000 L 132.000 204.000 L 208.000 204.000 C 214.627 204.000 220.000 198.627 220.000 192.000 L 220.000 152.000 C 220.000 145.373 214.627 140.000 208.000 140.000 ZM 68.000 104.000 L 68.000 64.000 C 68.000 61.791 69.791 60.000 72.000 60.000 L 184.000 60.000 C 186.209 60.000 188.000 61.791 188.000 64.000 L 188.000 104.000 C 188.000 106.209 186.209 108.000 184.000 108.000 L 72.000 108.000 C 69.791 108.000 68.000 106.209 68.000 104.000 ZM 212.000 192.000 C 212.000 194.209 210.209 196.000 208.000 196.000 L 48.000 196.000 C 45.791 196.000 44.000 194.209 44.000 192.000 L 44.000 152.000 C 44.000 149.791 45.791 148.000 48.000 148.000 L 208.000 148.000 C 210.209 148.000 212.000 149.791 212.000 152.000 Z"),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null

package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorThinIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 124.000 L 172.000 124.000 L 172.000 48.000 C 172.000 41.373 166.627 36.000 160.000 36.000 L 96.000 36.000 C 89.373 36.000 84.000 41.373 84.000 48.000 L 84.000 124.000 L 48.000 124.000 C 45.791 124.000 44.000 125.791 44.000 128.000 C 44.000 130.209 45.791 132.000 48.000 132.000 L 84.000 132.000 L 84.000 208.000 C 84.000 214.627 89.373 220.000 96.000 220.000 L 160.000 220.000 C 166.627 220.000 172.000 214.627 172.000 208.000 L 172.000 132.000 L 208.000 132.000 C 210.209 132.000 212.000 130.209 212.000 128.000 C 212.000 125.791 210.209 124.000 208.000 124.000 ZM 164.000 208.000 C 164.000 210.209 162.209 212.000 160.000 212.000 L 96.000 212.000 C 93.791 212.000 92.000 210.209 92.000 208.000 L 92.000 48.000 C 92.000 45.791 93.791 44.000 96.000 44.000 L 160.000 44.000 C 162.209 44.000 164.000 45.791 164.000 48.000 Z"),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null

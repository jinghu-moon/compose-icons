package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignCenterHorizontalSimple: ImageVector
    get() {
        if (_alignCenterHorizontalSimple != null) return _alignCenterHorizontalSimple!!
        _alignCenterHorizontalSimple = phosphorThinIcon(
            name = "AlignCenterHorizontalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 84.000 L 132.000 84.000 L 132.000 48.000 C 132.000 45.791 130.209 44.000 128.000 44.000 C 125.791 44.000 124.000 45.791 124.000 48.000 L 124.000 84.000 L 48.000 84.000 C 41.373 84.000 36.000 89.373 36.000 96.000 L 36.000 160.000 C 36.000 166.627 41.373 172.000 48.000 172.000 L 124.000 172.000 L 124.000 208.000 C 124.000 210.209 125.791 212.000 128.000 212.000 C 130.209 212.000 132.000 210.209 132.000 208.000 L 132.000 172.000 L 208.000 172.000 C 214.627 172.000 220.000 166.627 220.000 160.000 L 220.000 96.000 C 220.000 89.373 214.627 84.000 208.000 84.000 ZM 212.000 160.000 C 212.000 162.209 210.209 164.000 208.000 164.000 L 48.000 164.000 C 45.791 164.000 44.000 162.209 44.000 160.000 L 44.000 96.000 C 44.000 93.791 45.791 92.000 48.000 92.000 L 208.000 92.000 C 210.209 92.000 212.000 93.791 212.000 96.000 Z"),
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
        return _alignCenterHorizontalSimple!!
    }

private var _alignCenterHorizontalSimple: ImageVector? = null

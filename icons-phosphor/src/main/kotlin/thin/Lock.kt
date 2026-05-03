package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = phosphorThinIcon(
            name = "Lock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 84.000 L 172.000 84.000 L 172.000 56.000 C 172.000 31.699 152.301 12.000 128.000 12.000 C 103.699 12.000 84.000 31.699 84.000 56.000 L 84.000 84.000 L 48.000 84.000 C 41.373 84.000 36.000 89.373 36.000 96.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 96.000 C 220.000 89.373 214.627 84.000 208.000 84.000 ZM 92.000 56.000 C 92.000 36.118 108.118 20.000 128.000 20.000 C 147.882 20.000 164.000 36.118 164.000 56.000 L 164.000 84.000 L 92.000 84.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 96.000 C 44.000 93.791 45.791 92.000 48.000 92.000 L 208.000 92.000 C 210.209 92.000 212.000 93.791 212.000 96.000 ZM 136.000 152.000 C 136.000 156.418 132.418 160.000 128.000 160.000 C 123.582 160.000 120.000 156.418 120.000 152.000 C 120.000 147.582 123.582 144.000 128.000 144.000 C 132.418 144.000 136.000 147.582 136.000 152.000 Z"),
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
        return _lock!!
    }

private var _lock: ImageVector? = null

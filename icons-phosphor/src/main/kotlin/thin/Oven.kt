package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Oven: ImageVector
    get() {
        if (_oven != null) return _oven!!
        _oven = phosphorThinIcon(
            name = "Oven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 76.000 76.000 C 76.000 71.582 79.582 68.000 84.000 68.000 C 88.418 68.000 92.000 71.582 92.000 76.000 C 92.000 80.418 88.418 84.000 84.000 84.000 C 79.582 84.000 76.000 80.418 76.000 76.000 ZM 120.000 76.000 C 120.000 71.582 123.582 68.000 128.000 68.000 C 132.418 68.000 136.000 71.582 136.000 76.000 C 136.000 80.418 132.418 84.000 128.000 84.000 C 123.582 84.000 120.000 80.418 120.000 76.000 ZM 164.000 76.000 C 164.000 71.582 167.582 68.000 172.000 68.000 C 176.418 68.000 180.000 71.582 180.000 76.000 C 180.000 80.418 176.418 84.000 172.000 84.000 C 167.582 84.000 164.000 80.418 164.000 76.000 ZM 184.000 108.000 L 72.000 108.000 C 69.791 108.000 68.000 109.791 68.000 112.000 L 68.000 184.000 C 68.000 186.209 69.791 188.000 72.000 188.000 L 184.000 188.000 C 186.209 188.000 188.000 186.209 188.000 184.000 L 188.000 112.000 C 188.000 109.791 186.209 108.000 184.000 108.000 ZM 180.000 180.000 L 76.000 180.000 L 76.000 116.000 L 180.000 116.000 Z"),
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
        return _oven!!
    }

private var _oven: ImageVector? = null

package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorFillIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM68 188c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM68 140c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM68 92C61.373 92 56 86.627 56 80 56 73.373 61.373 68 68 68c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM192 184h-88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM192 136h-88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM192 88h-88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null

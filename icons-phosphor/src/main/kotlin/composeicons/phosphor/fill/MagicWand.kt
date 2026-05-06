package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MagicWand: ImageVector
    get() {
        if (_magicWand != null) return _magicWand!!
        _magicWand = phosphorFillIcon(
            name = "MagicWand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 152c0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8ZM56 72h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM184 192h-8v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM219.31 80 80 219.31c-6.248 6.243-16.372 6.243-22.62 0L36.68 198.63c-3.001-3.001-4.688-7.071-4.688-11.315 0-4.244 1.686-8.314 4.688-11.315L176 36.69c3.001-3.001 7.071-4.688 11.315-4.688 4.244 0 8.314 1.686 11.315 4.688l20.68 20.68c3.001 3.001 4.688 7.071 4.688 11.315 0 4.244-1.686 8.314-4.688 11.315ZM208 68.69 187.31 48l-32 32L176 100.69Z"),
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
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null

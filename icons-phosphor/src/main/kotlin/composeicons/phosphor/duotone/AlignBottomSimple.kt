package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) return _alignBottomSimple!!
        _alignBottomSimple = phosphorDuotoneIcon(
            name = "AlignBottomSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 40v152c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8v-152c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 232c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8ZM80 192v-152C80 31.163 87.163 24 96 24h64c8.837 0 16 7.163 16 16v152c0 8.837-7.163 16-16 16h-64c-8.837 0-16-7.163-16-16ZM96 192h64v-152h-64Z"),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null

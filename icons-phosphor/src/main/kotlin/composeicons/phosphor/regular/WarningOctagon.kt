package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorRegularIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 136v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM232 91.55v72.9c.014 4.246-1.676 8.32-4.69 11.31l-51.55 51.55c-2.99 3.014-7.064 4.704-11.31 4.69h-72.9c-4.246 .014-8.32-1.676-11.31-4.69L28.69 175.76C25.676 172.77 23.986 168.696 24 164.45v-72.9c-.014-4.246 1.676-8.32 4.69-11.31L80.24 28.69C83.23 25.676 87.304 23.986 91.55 24h72.9c4.246-.014 8.32 1.676 11.31 4.69l51.55 51.55c3.014 2.99 4.704 7.064 4.69 11.31ZM216 91.55 164.45 40h-72.9L40 91.55v72.9L91.55 216h72.9L216 164.45ZM128 160c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null

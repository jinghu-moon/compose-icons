package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorThinIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 136v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM228 91.55v72.9c.003 3.184-1.26 6.238-3.51 8.49l-51.55 51.55c-2.252 2.25-5.306 3.512-8.49 3.51h-72.9c-3.184 .003-6.238-1.26-8.49-3.51L31.51 172.94C29.26 170.688 27.997 167.634 28 164.45v-72.9c-.003-3.184 1.26-6.238 3.51-8.49L83.06 31.51C85.312 29.26 88.366 27.997 91.55 28h72.9c3.184-.003 6.238 1.26 8.49 3.51l51.55 51.55c2.25 2.252 3.512 5.306 3.51 8.49ZM220 91.55c.001-1.061-.42-2.079-1.17-2.83L167.28 37.17c-.754-.744-1.77-1.164-2.83-1.17h-72.9c-1.06 .006-2.076 .426-2.83 1.17L37.17 88.72c-.75 .751-1.171 1.769-1.17 2.83v72.9c-.001 1.061 .42 2.079 1.17 2.83l51.55 51.55c.754 .744 1.77 1.164 2.83 1.17h72.9c1.06-.006 2.076-.426 2.83-1.17l51.55-51.55c.75-.751 1.171-1.769 1.17-2.83ZM128 164c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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

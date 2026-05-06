package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorRegularIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 72c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8h24c30.928 0 56-25.072 56-56C224 97.072 198.928 72 168 72ZM208 128c0 22.091-17.909 40-40 40h-16v-80h16c22.091 0 40 17.909 40 40ZM24 48c0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8ZM232 208c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8ZM104 152c0-9.48-8.61-13-26.88-18.26C61.37 129.2 41.78 123.55 41.78 104 41.78 85.76 58.21 72 80 72c15.72 0 29.18 7.3 35.12 19 1.395 2.561 1.287 5.678-.284 8.136-1.57 2.457-4.354 3.866-7.264 3.675-2.91-.191-5.486-1.95-6.723-4.591C97.64 91.93 89.65 88 80 88 67.33 88 57.78 94.88 57.78 104c0 7 9 10.1 23.77 14.36C97.78 123 120 129.45 120 152c0 17.64-17.94 32-40 32C57.94 184 40 169.64 40 152c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 8.67 11 16 24 16 13 0 24-7.33 24-16Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null

package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorRegularIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 104c0 4.418-3.582 8-8 8h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8ZM168 128h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM256 104v24c0 17.673-14.327 32-32 32h-5.19c-7.19 15.8-21.79 29.43-43.23 40.16-14.65 7.185-30.159 12.464-46.15 15.71-.945 .173-1.915 .173-2.86 0C110.579 212.624 95.07 207.345 80.42 200.16 59 189.43 44.38 175.8 37.19 160h-5.19C14.327 160 0 145.673 0 128v-24C0 86.327 14.327 72 32 72h.85c1.532-4.636 5.097-8.318 9.68-10l80-29.09c3.534-1.28 7.406-1.28 10.94 0l80 29.09c4.583 1.682 8.148 5.364 9.68 10h.85c17.673 0 32 14.327 32 32ZM32.55 144c-.365-2.651-.549-5.324-.55-8v-48c-8.837 0-16 7.163-16 16v24c0 8.837 7.163 16 16 16ZM208 136v-58.91L128 48 48 77.09v58.91c0 45 69.09 61.52 80 63.84C138.89 197.52 208 181 208 136ZM240 104c0-8.837-7.163-16-16-16v48c-.001 2.676-.185 5.349-.55 8h.55c8.837 0 16-7.163 16-16Z"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null

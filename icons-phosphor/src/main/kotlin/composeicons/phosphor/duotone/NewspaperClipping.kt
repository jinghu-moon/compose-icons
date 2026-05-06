package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorDuotoneIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48h-176c-4.418 0-8 3.582-8 8v160L64 200l32 16 32-16 32 16 32-16 32 16v-160c0-4.418-3.582-8-8-8ZM112 160h-48v-64h48Z"),
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
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v160c.001 2.772 1.438 5.346 3.797 6.803 2.359 1.456 5.304 1.588 7.783 .347L64 208.94l28.42 14.21c2.253 1.128 4.907 1.128 7.16 0L128 208.94l28.42 14.21c2.253 1.128 4.907 1.128 7.16 0L192 208.94l28.42 14.21c2.479 1.241 5.424 1.109 7.783-.347 2.359-1.456 3.796-4.03 3.797-6.803v-160c0-8.837-7.163-16-16-16ZM216 203.06 195.58 192.84c-2.253-1.128-4.907-1.128-7.16 0L160 207.06 131.58 192.84c-2.253-1.128-4.907-1.128-7.16 0L96 207.06 67.58 192.84c-2.253-1.128-4.907-1.128-7.16 0L40 203.06v-147.06h176ZM136 112c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8ZM136 144c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8ZM64 168h48c4.418 0 8-3.582 8-8v-64c0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8ZM72 104h32v48h-32Z"),
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
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null

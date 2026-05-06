package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorRegularIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 104c0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8ZM80 144h96c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM232 56v152c-.001 2.772-1.438 5.346-3.797 6.803-2.359 1.456-5.304 1.588-7.783 .347L192 200.94l-28.42 14.21c-2.253 1.128-4.907 1.128-7.16 0L128 200.94 99.58 215.15c-2.253 1.128-4.907 1.128-7.16 0L64 200.94 35.58 215.15c-2.479 1.241-5.424 1.109-7.783-.347C25.438 213.346 24.001 210.772 24 208v-152C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM216 56h-176v139.06L60.42 184.84c2.253-1.128 4.907-1.128 7.16 0L96 199.06l28.42-14.22c2.253-1.128 4.907-1.128 7.16 0L160 199.06l28.42-14.22c2.253-1.128 4.907-1.128 7.16 0L216 195.06Z"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null

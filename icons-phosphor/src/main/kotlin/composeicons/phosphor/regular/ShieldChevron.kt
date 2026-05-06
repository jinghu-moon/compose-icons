package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorRegularIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-160C39.163 40 32 47.163 32 56v56c0 52.72 25.52 84.67 46.93 102.19 23.06 18.86 46 25.26 47 25.53 1.375 .374 2.825 .374 4.2 0 1-.27 23.91-6.67 47-25.53C198.48 196.67 224 164.72 224 112v-56c0-8.837-7.163-16-16-16ZM167.4 201.42c-11.727 9.657-25.064 17.172-39.4 22.2C113.852 218.68 100.679 211.298 89.08 201.81 79.434 194.019 71.151 184.679 64.57 174.17L128 129.77l63.43 44.4c-6.467 10.335-14.585 19.541-24.03 27.25ZM208 112q0 26.31-9.14 47.84L132.59 113.45c-2.756-1.93-6.424-1.93-9.18 0L57.13 159.84C51.06 145.52 48 129.54 48 112v-56h160Z"),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null

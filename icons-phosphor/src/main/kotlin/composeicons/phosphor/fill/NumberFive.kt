package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorFillIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-144C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM124 104c20.492 .001 38.271 14.147 42.874 34.116 4.603 19.968-5.187 40.471-23.611 49.443-18.423 8.972-40.602 4.038-53.484-11.898-2.709-3.439-2.15-8.417 1.255-11.17 3.404-2.753 8.389-2.258 11.185 1.11 7.426 9.191 19.822 12.73 30.982 8.847 11.159-3.883 18.68-14.354 18.796-26.169 .116-11.815-7.197-22.432-18.278-26.534-11.081-4.102-23.544-.807-31.149 8.236-2.309 2.693-6.116 3.544-9.352 2.091-3.236-1.454-5.128-4.866-4.648-8.381L96.12 70.87C96.68 66.943 100.033 64.02 104 64h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-49.06L107 107.4c5.385-2.25 11.164-3.405 17-3.4Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null

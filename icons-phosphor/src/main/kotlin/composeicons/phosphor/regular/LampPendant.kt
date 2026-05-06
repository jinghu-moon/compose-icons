package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorRegularIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 74.78v-2.78c0-8.837-7.163-16-16-16h-24v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40h-24C87.163 56 80 63.163 80 72v2.78C40.859 93.273 15.923 132.711 16 176c0 4.418 3.582 8 8 8h64c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40h64c4.418 0 8-3.582 8-8C240.077 132.711 215.141 93.273 176 74.78ZM128 208c-13.255 0-24-10.745-24-24h48c0 13.255-10.745 24-24 24ZM32.33 168C35.26 132.234 57.936 101.106 91.08 87.35 94.048 86.112 95.987 83.216 96 80v-8h64v8c.001 3.227 1.942 6.138 4.92 7.38 33.135 13.751 55.809 44.865 58.75 80.62Z"),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null

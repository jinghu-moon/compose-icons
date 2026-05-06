package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorLightIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 34h-80c-3.314 0-6 2.686-6 6v128c.05 43.058 34.942 77.95 78 78 3.314 0 6-2.686 6-6v-66h2c38.66 0 70-31.34 70-70C222 65.34 190.66 34 152 34ZM78 62.91 133.74 162h-55.74ZM138 145.1 82.26 46h55.74ZM78.28 174h59.72v59.73C106.31 230.793 81.211 205.691 78.28 174ZM152 162h-2v-116h2c32.033 0 58 25.967 58 58 0 32.033-25.967 58-58 58Z"),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null

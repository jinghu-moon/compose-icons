package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorLightIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185 60.67C167.18 34 145.87 18 128 18 110.13 18 88.82 34 71 60.67 52.57 88.32 42 121.61 42 152c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86C214 121.61 203.43 88.32 185 60.67ZM128 226C87.151 225.95 54.05 192.849 54 152 54 123.92 63.84 93.06 81 67.33 96.11 44.65 114.56 30 128 30c13.44 0 31.89 14.65 47 37.33 17.15 25.73 27 56.59 27 84.67-.05 40.849-33.151 73.95-74 74Z"),
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
        return _egg!!
    }

private var _egg: ImageVector? = null

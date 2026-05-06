package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorLightIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185 60.67C167.18 34 145.87 18 128 18 110.13 18 88.82 34 71 60.67 52.57 88.32 42 121.61 42 152c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86C214 121.61 203.43 88.32 185 60.67ZM128 226C87.151 225.95 54.05 192.849 54 152 54 123.92 63.84 93.06 81 67.33 96.11 44.65 114.56 30 128 30c10.52 0 24.12 9 36.78 23.77L123.52 100c-1.401 1.564-1.882 3.747-1.269 5.756 .614 2.008 2.233 3.55 4.269 4.064L153 116.43l-6.87 34.39c-.65 3.247 1.453 6.407 4.7 7.06 .385 .078 .777 .118 1.17 .12 2.854-.006 5.309-2.022 5.87-4.82l8-40c.63-3.139-1.315-6.22-4.42-7l-22.37-5.59L172.28 63.39q1.36 1.92 2.72 3.94c17.15 25.73 27 56.59 27 84.67-.05 40.849-33.151 73.95-74 74Z"),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorLightIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90 48v-32c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM128 54c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6ZM160 54c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6ZM251.6 100.8 222 123v61c0 16.569-13.431 30-30 30h-128C47.431 214 34 200.569 34 184v-61L4.4 100.8C1.749 98.812 1.212 95.051 3.2 92.4c1.988-2.651 5.749-3.188 8.4-1.2L34 108v-28c0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6v28L244.4 91.2c2.651-1.988 6.412-1.451 8.4 1.2 1.988 2.651 1.451 6.412-1.2 8.4ZM210 86h-164v98c0 9.941 8.059 18 18 18h128c9.941 0 18-8.059 18-18Z"),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null

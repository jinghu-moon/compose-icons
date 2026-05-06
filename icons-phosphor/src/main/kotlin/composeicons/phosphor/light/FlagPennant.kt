package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorLightIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242 98.33 58 34.33c-1.839-.65-3.878-.366-5.469 .762C50.939 36.219 49.996 38.05 50 40v176c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-43.73L242 109.67c2.417-.836 4.038-3.113 4.038-5.67 0-2.557-1.621-4.834-4.038-5.67ZM62 159.56v-111.12L221.74 104Z"),
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
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorLightIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44.08 51.37C42.763 52.507 42.004 54.16 42 55.9v168.1c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-45.22c28.08-22.79 51.88-11 79.34 2.57 16.12 8 33.49 16.58 52 16.58 13.57 0 27.76-4.6 42.56-17.42 1.32-1.129 2.086-2.774 2.1-4.51v-120.1c.002-2.35-1.368-4.486-3.505-5.463-2.138-.977-4.649-.617-6.425 .923-29 25.12-53.28 13.09-81.41-.84C110.77 36.71 79 21.16 44.08 51.37ZM218 173.17c-28.08 22.8-51.88 11-79.34-2.58C113.4 158.08 85.09 144.07 54 164v-105.28c28.08-22.8 51.88-11 79.34 2.56 25.26 12.51 53.57 26.52 84.66 6.63Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null

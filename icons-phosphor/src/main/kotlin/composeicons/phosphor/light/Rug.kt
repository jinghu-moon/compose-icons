package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorLightIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 18c-3.314 0-6 2.686-6 6v18h-36v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-36v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-36v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v208c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h36v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h36v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h36v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-208c0-3.314-2.686-6-6-6ZM62 54h132v148h-132ZM128 174c2.105-.001 4.056-1.105 5.14-2.91l24-40c1.142-1.902 1.142-4.278 0-6.18l-24-40C132.055 83.107 130.104 82.005 128 82.005c-2.104 0-4.055 1.102-5.14 2.905l-24 40c-1.142 1.902-1.142 4.278 0 6.18l24 40c1.084 1.805 3.035 2.909 5.14 2.91ZM128 99.66 145 128l-17 28.34L111 128Z"),
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
        return _rug!!
    }

private var _rug: ImageVector? = null

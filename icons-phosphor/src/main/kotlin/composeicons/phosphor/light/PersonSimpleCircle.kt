package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorLightIcon(
            name = "PersonSimpleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM114 80c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14ZM182 112c0 3.314-2.686 6-6 6h-42v16.18l31 46.49c1.839 2.761 1.091 6.491-1.67 8.33-2.761 1.839-6.491 1.091-8.33-1.67L128 146.82l-27 40.51c-1.839 2.761-5.569 3.509-8.33 1.67C89.909 187.161 89.161 183.431 91 180.67l31-46.49v-16.18h-42c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h96c3.314 0 6 2.686 6 6Z"),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null

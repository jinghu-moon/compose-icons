package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = phosphorLightIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 218h-26v-178c0-7.732-6.268-14-14-14h-128C56.268 26 50 32.268 50 40v178h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h208c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM62 40c0-1.105 .895-2 2-2h128c1.105 0 2 .895 2 2v178h-132ZM166 132c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _door!!
    }

private var _door: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorLightIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 224c0 3.314-2.686 6-6 6C143.694 229.934 98.066 184.306 98 128v-81.51L60.24 84.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L99.76 27.76c2.343-2.34 6.137-2.34 8.48 0l48 48c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L110 46.49v81.51c.055 49.683 40.317 89.945 90 90 3.314 0 6 2.686 6 6Z"),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null

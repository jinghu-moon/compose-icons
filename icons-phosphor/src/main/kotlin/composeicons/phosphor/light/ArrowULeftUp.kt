package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorLightIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 80v88c0 34.242-27.758 62-62 62C109.758 230 82 202.242 82 168v-121.51L44.24 84.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L83.76 27.76c2.343-2.34 6.137-2.34 8.48 0l48 48c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L94 46.49v121.51c0 27.614 22.386 50 50 50 27.614 0 50-22.386 50-50v-88c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null

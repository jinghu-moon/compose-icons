package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorLightIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 32v144c0 3.314-2.686 6-6 6h-129.51l37.75 37.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723l-48-48c-2.34-2.343-2.34-6.137 0-8.48L91.76 123.76c1.496-1.605 3.748-2.266 5.874-1.723 2.126 .543 3.786 2.203 4.329 4.329 .543 2.126-.118 4.379-1.723 5.874L62.49 170h123.51v-138c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null

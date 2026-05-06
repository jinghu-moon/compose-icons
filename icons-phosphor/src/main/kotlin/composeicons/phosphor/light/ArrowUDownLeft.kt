package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorLightIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 112c-.039 34.226-27.774 61.961-62 62h-121.51l37.75 37.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723l-48-48c-2.34-2.343-2.34-6.137 0-8.48L75.76 115.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L46.49 162h121.51c27.614 0 50-22.386 50-50C218 84.386 195.614 62 168 62h-88c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h88c34.226 .039 61.961 27.774 62 62Z"),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null

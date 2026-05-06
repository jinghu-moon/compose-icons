package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorLightIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 34h-64C83.85 34 74 43.85 74 56v144c0 12.15 9.85 22 22 22h64c12.15 0 22-9.85 22-22v-144C182 43.85 172.15 34 160 34ZM170 200c0 5.523-4.477 10-10 10h-64c-5.523 0-10-4.477-10-10v-144C86 50.477 90.477 46 96 46h64c5.523 0 10 4.477 10 10ZM214 88v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-80c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM246 104v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM54 88v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-80c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM22 104v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null

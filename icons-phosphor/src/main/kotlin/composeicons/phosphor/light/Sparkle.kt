package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sparkle: ImageVector
    get() {
        if (_sparkle != null) return _sparkle!!
        _sparkle = phosphorLightIcon(
            name = "Sparkle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196.89 130.94 144.4 111.6 125.06 59.11C123.043 53.64 117.83 50.007 112 50.007c-5.83 0-11.043 3.633-13.06 9.103L79.6 111.6 27.11 130.94c-5.47 2.017-9.103 7.23-9.103 13.06 0 5.83 3.633 11.043 9.103 13.06l52.49 19.34 19.34 52.49c2.017 5.47 7.23 9.103 13.06 9.103 5.83 0 11.043-3.633 13.06-9.103l19.34-52.49 52.49-19.34c5.47-2.017 9.103-7.23 9.103-13.06 0-5.83-3.633-11.043-9.103-13.06ZM192.74 145.8l-55.08 20.3c-1.651 .607-2.953 1.909-3.56 3.56l-20.3 55.08c-.279 .753-.997 1.252-1.8 1.252-.803 0-1.521-.499-1.8-1.252L89.9 169.66c-.607-1.651-1.909-2.953-3.56-3.56L31.26 145.8c-.753-.279-1.252-.997-1.252-1.8 0-.803 .499-1.521 1.252-1.8L86.34 121.9c1.651-.607 2.953-1.909 3.56-3.56L110.2 63.26c.279-.753 .997-1.252 1.8-1.252 .803 0 1.521 .499 1.8 1.252l20.3 55.08c.607 1.651 1.909 2.953 3.56 3.56l55.08 20.3c.753 .279 1.252 .997 1.252 1.8 0 .803-.499 1.521-1.252 1.8ZM146 40c0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6ZM246 88c0 3.314-2.686 6-6 6h-10v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-10c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10v-10c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v10h10c3.314 0 6 2.686 6 6Z"),
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
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null

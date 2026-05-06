package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorLightIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217.9 110.1l-80-80C135.274 27.474 131.713 25.999 128 25.999c-3.713 0-7.274 1.475-9.9 4.101l-80 80C35.467 112.721 33.991 116.285 34 120v96c0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6v-58h36v58c0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6v-96c.009-3.715-1.467-7.279-4.1-9.9ZM210 210h-52v-58c0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v58h-52v-90c-.003-.532 .206-1.043 .58-1.42l80-80c.376-.379 .887-.592 1.42-.592 .533 0 1.044 .213 1.42 .592l80 80c.374 .377 .583 .888 .58 1.42Z"),
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
        return _house!!
    }

private var _house: ImageVector? = null

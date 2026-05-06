package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorLightIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v144c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM40 54h176c1.105 0 2 .895 2 2v107.57L188.53 134.1c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101l-21.42 21.42L101.9 110.1C99.274 107.474 95.713 105.999 92 105.999c-3.713 0-7.274 1.475-9.9 4.101L38 154.2v-98.2c0-1.105 .895-2 2-2ZM38 200v-28.83L90.58 118.59c.376-.379 .887-.592 1.42-.592 .533 0 1.044 .213 1.42 .592L176.83 202h-136.83c-1.105 0-2-.895-2-2ZM216 202h-22.2l-38-38 21.41-21.42c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l38 38v19.42c0 .537-.216 1.052-.6 1.429-.384 .376-.903 .582-1.44 .571ZM146 100c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10Z"),
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
        return _image!!
    }

private var _image: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorLightIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-144C64.268 42 58 48.268 58 56v18h-18C32.268 74 26 80.268 26 88v112c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-18h18c7.732 0 14-6.268 14-14v-112c0-7.732-6.268-14-14-14ZM70 56c0-1.105 .895-2 2-2h144c1.105 0 2 .895 2 2v67.57L204.53 110.1c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101l-21.42 21.41L117.9 86.1C115.274 83.474 111.713 81.999 108 81.999c-3.713 0-7.274 1.475-9.9 4.101L70 114.2ZM186 200c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-112c0-1.105 .895-2 2-2h18v82c0 7.732 6.268 14 14 14h114ZM216 170h-144c-1.105 0-2-.895-2-2v-36.83L106.58 94.59c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l49.66 49.66c1.125 1.127 2.653 1.76 4.245 1.76 1.592 0 3.12-.633 4.245-1.76l25.65-25.66c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l22 22v27.41c0 .537-.216 1.052-.6 1.429-.384 .376-.903 .582-1.44 .571ZM162 84c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null

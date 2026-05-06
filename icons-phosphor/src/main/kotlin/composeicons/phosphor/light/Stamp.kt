package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorLightIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 224c0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6ZM222 144v40c0 7.732-6.268 14-14 14h-160c-7.732 0-14-6.268-14-14v-40c0-7.732 6.268-14 14-14h58.9L90.68 54.29c-1.899-8.857 .305-18.098 5.998-25.144C102.37 22.101 110.942 18.004 120 18h16c9.06 .001 17.634 4.096 23.329 11.143 5.695 7.046 7.9 16.289 6.001 25.147L149.1 130h58.9c7.732 0 14 6.268 14 14ZM119.17 130h17.66L153.59 51.77c1.138-5.313-.185-10.856-3.6-15.083C146.575 32.461 141.434 30.003 136 30h-16c-5.435 0-10.58 2.457-13.997 6.683-3.417 4.227-4.741 9.772-3.603 15.087ZM210 144c0-1.105-.895-2-2-2h-160c-1.105 0-2 .895-2 2v40c0 1.105 .895 2 2 2h160c1.105 0 2-.895 2-2Z"),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorLightIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 122h-18v-74c-.001-4.15-1.844-8.085-5.03-10.744-3.186-2.659-7.387-3.767-11.47-3.026l-160 29.09C38.843 64.528 34.002 70.324 34 77.09v44.91h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v44.91c.002 6.766 4.843 12.562 11.5 13.77l160 29.09c.825 .15 1.662 .227 2.5 .23 7.732 0 14-6.268 14-14v-74h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM46 77.09c-.016-.978 .678-1.824 1.64-2l160-29.1h.37c1.105 0 2 .895 2 2v74h-164.01ZM210 208c-.002 .591-.266 1.152-.72 1.53-.454 .383-1.055 .544-1.64 .44l-160-29.1c-.962-.176-1.656-1.022-1.64-2v-44.87h164Z"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null

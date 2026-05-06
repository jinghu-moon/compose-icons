package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bag: ImageVector
    get() {
        if (_bag != null) return _bag!!
        _bag = phosphorLightIcon(
            name = "Bag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 66h-42v-2C174 38.595 153.405 18 128 18 102.595 18 82 38.595 82 64v2h-42C32.268 66 26 72.268 26 80v120c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-120c0-7.732-6.268-14-14-14ZM94 64C94 45.222 109.222 30 128 30c18.778 0 34 15.222 34 34v2h-68ZM218 200c0 1.105-.895 2-2 2h-176c-1.105 0-2-.895-2-2v-120c0-1.105 .895-2 2-2h42v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h68v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h42c1.105 0 2 .895 2 2Z"),
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
        return _bag!!
    }

private var _bag: ImageVector? = null

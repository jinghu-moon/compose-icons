package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorLightIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M194 152v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM232 82c-3.314 0-6 2.686-6 6v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-80c0-3.314-2.686-6-6-6ZM220.44 212c2.231 2.452 2.052 6.249-.4 8.48-2.452 2.231-6.249 2.052-8.48-.4L166 169.92v54.08c0 2.291-1.304 4.382-3.361 5.39-2.058 1.008-4.509 .755-6.319-.65L85.94 174h-45.94c-7.732 0-14-6.268-14-14v-64C26 88.268 32.268 82 40 82h46.07L51.56 44c-1.865-2.484-1.526-5.981 .782-8.06 2.308-2.079 5.821-2.053 8.098 .06ZM154 156.72 97 94h-57c-1.105 0-2 .895-2 2v64c0 1.105 .895 2 2 2h48c1.333-0 2.627 .443 3.68 1.26L154 211.73ZM123.83 67.72 154 44.27v62.56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-74.83c0-2.291-1.304-4.382-3.361-5.39-2.058-1.008-4.509-.755-6.319 .65L116.47 58.26c-1.771 1.287-2.701 3.437-2.425 5.61 .276 2.172 1.713 4.022 3.75 4.825 2.037 .804 4.35 .434 6.035-.965Z"),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.City: ImageVector
    get() {
        if (_city != null) return _city!!
        _city = phosphorLightIcon(
            name = "City",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 210h-10v-122c0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6v42h-52v-90c0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6v170h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM166 94h52v116h-52ZM154 142v68h-52v-68ZM38 46h52v164h-52ZM70 72v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM70 120v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM70 168v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM122 184v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM186 184v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM186 136v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6Z"),
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
        return _city!!
    }

private var _city: ImageVector? = null

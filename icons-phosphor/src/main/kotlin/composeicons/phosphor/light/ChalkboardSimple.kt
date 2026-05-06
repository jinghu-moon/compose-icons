package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorLightIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 194h-10v-26c0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6v26h-116v-138c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-80c0-7.732-6.268-14-14-14h-176C32.268 42 26 48.268 26 56v138h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM166 174h52v20h-52Z"),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null

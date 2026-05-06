package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) return _chalkboard!!
        _chalkboard = phosphorLightIcon(
            name = "Chalkboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 194h-10v-138c0-7.732-6.268-14-14-14h-176C32.268 42 26 48.268 26 56v138h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM38 56c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2v138h-20v-26c0-3.314-2.686-6-6-6h-72c-3.314 0-6 2.686-6 6v26h-44v-108h116v50c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-56c0-3.314-2.686-6-6-6h-128c-3.314 0-6 2.686-6 6v114h-20ZM186 194h-60v-20h60Z"),
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
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null

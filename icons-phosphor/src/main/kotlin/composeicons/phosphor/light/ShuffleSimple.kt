package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorLightIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 48v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-25.52l-47.13 47.14c-2.344 2.344-6.146 2.344-8.49 0-2.344-2.344-2.344-6.146 0-8.49L193.52 54h-25.52c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM208 162c-3.314 0-6 2.686-6 6v25.52L52.24 43.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L193.52 202h-25.52c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6ZM101.13 146.38 43.76 203.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l57.38-57.37c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0Z"),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null

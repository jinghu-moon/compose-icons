package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorLightIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 50h-42v-10C174 27.85 164.15 18 152 18h-48C91.85 18 82 27.85 82 40v10h-42c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v146c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-146h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM94 40c0-5.523 4.477-10 10-10h48c5.523 0 10 4.477 10 10v10h-68ZM194 208c0 1.105-.895 2-2 2h-128c-1.105 0-2-.895-2-2v-146h132ZM110 104v64c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM158 104v64c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) return _squaresFour!!
        _squaresFour = phosphorLightIcon(
            name = "SquaresFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 42h-48C48.268 42 42 48.268 42 56v48c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM106 104c0 1.105-.895 2-2 2h-48c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2ZM200 42h-48c-7.732 0-14 6.268-14 14v48c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM202 104c0 1.105-.895 2-2 2h-48c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2ZM104 138h-48c-7.732 0-14 6.268-14 14v48c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM106 200c0 1.105-.895 2-2 2h-48c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2ZM200 138h-48c-7.732 0-14 6.268-14 14v48c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM202 200c0 1.105-.895 2-2 2h-48c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2Z"),
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
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null

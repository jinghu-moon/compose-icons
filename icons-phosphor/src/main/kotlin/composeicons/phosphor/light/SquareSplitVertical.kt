package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SquareSplitVertical: ImageVector
    get() {
        if (_squareSplitVertical != null) return _squareSplitVertical!!
        _squareSplitVertical = phosphorLightIcon(
            name = "SquareSplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 42h-144C48.268 42 42 48.268 42 56v144c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM56 54h144c1.105 0 2 .895 2 2v66h-148v-66c0-1.105 .895-2 2-2ZM200 202h-144c-1.105 0-2-.895-2-2v-66h148v66c0 1.105-.895 2-2 2Z"),
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
        return _squareSplitVertical!!
    }

private var _squareSplitVertical: ImageVector? = null

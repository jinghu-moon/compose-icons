package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorLightIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 42h-40c-7.732 0-14 6.268-14 14v88c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18v-88C110 48.268 103.732 42 96 42h-40C48.268 42 42 48.268 42 56v88c0 47.496 38.504 86 86 86h.65C175.71 229.65 214 190.62 214 143v-87c0-7.732-6.268-14-14-14ZM160 54h40c1.105 0 2 .895 2 2v34h-44v-34c0-1.105 .895-2 2-2ZM56 54h40c1.105 0 2 .895 2 2v34h-44v-34c0-1.105 .895-2 2-2ZM128.56 218h-.56C87.131 218 54 184.869 54 144v-42h44v42c0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30v-42h44v41c0 41.05-32.94 74.7-73.44 75Z"),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) return _alignTopSimple!!
        _alignTopSimple = phosphorLightIcon(
            name = "AlignTopSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 32c0 3.314-2.686 6-6 6h-144c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h144c3.314 0 6 2.686 6 6ZM174 72v152c0 7.732-6.268 14-14 14h-64c-7.732 0-14-6.268-14-14v-152C82 64.268 88.268 58 96 58h64c7.732 0 14 6.268 14 14ZM162 72c0-1.105-.895-2-2-2h-64c-1.105 0-2 .895-2 2v152c0 1.105 .895 2 2 2h64c1.105 0 2-.895 2-2Z"),
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
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null

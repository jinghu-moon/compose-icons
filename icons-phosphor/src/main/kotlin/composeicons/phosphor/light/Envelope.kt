package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Envelope: ImageVector
    get() {
        if (_envelope != null) return _envelope!!
        _envelope = phosphorLightIcon(
            name = "Envelope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192c-3.314 0-6 2.686-6 6v136c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-136c0-3.314-2.686-6-6-6ZM128 135.86 47.42 62h161.16ZM101.67 128 38 186.36v-116.72ZM110.55 136.14 124 148.42c2.293 2.097 5.807 2.097 8.1 0l13.4-12.28L208.58 194h-161.15ZM154.33 128 218 69.64v116.72Z"),
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
        return _envelope!!
    }

private var _envelope: ImageVector? = null

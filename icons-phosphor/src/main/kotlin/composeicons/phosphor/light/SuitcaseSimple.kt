package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SuitcaseSimple: ImageVector
    get() {
        if (_suitcaseSimple != null) return _suitcaseSimple!!
        _suitcaseSimple = phosphorLightIcon(
            name = "SuitcaseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 58h-42v-10C174 35.85 164.15 26 152 26h-48C91.85 26 82 35.85 82 48v10h-42C32.268 58 26 64.268 26 72v128c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM94 48c0-5.523 4.477-10 10-10h48c5.523 0 10 4.477 10 10v10h-68ZM40 70h176c1.105 0 2 .895 2 2v74h-180v-74c0-1.105 .895-2 2-2ZM216 202h-176c-1.105 0-2-.895-2-2v-42h180v42c0 1.105-.895 2-2 2Z"),
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
        return _suitcaseSimple!!
    }

private var _suitcaseSimple: ImageVector? = null

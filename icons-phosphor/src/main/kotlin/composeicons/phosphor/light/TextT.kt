package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorLightIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 56v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-26h-60v132h26c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h26v-132h-60v26c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32c0-3.314 2.686-6 6-6h144c3.314 0 6 2.686 6 6Z"),
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
        return _textT!!
    }

private var _textT: ImageVector? = null

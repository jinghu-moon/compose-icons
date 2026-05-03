package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LineVertical: ImageVector
    get() {
        if (_lineVertical != null) return _lineVertical!!
        _lineVertical = phosphorLightIcon(
            name = "LineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.000 24.000 L 134.000 232.000 C 134.000 235.314 131.314 238.000 128.000 238.000 C 124.686 238.000 122.000 235.314 122.000 232.000 L 122.000 24.000 C 122.000 20.686 124.686 18.000 128.000 18.000 C 131.314 18.000 134.000 20.686 134.000 24.000 Z"),
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
        return _lineVertical!!
    }

private var _lineVertical: ImageVector? = null

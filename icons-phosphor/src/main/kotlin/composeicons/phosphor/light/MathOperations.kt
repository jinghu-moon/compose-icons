package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorLightIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M110 72c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6ZM104 178h-26v-26c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v26h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h26v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h26c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM152 174h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM216 194h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM155.76 100.24c2.343 2.34 6.137 2.34 8.48 0L184 80.49l19.76 19.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L192.49 72 212.24 52.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L184 63.51 164.24 43.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L175.51 72 155.76 91.76c-2.34 2.343-2.34 6.137 0 8.48Z"),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null

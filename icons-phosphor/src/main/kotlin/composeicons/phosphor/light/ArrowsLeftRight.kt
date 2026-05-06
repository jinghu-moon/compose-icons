package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorLightIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 171.76c2.34 2.343 2.34 6.137 0 8.48l-32 32c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L193.51 182h-145.51c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h145.51L171.76 148.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147ZM75.76 116.24c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L62.49 86h145.51c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-145.51L84.24 52.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L43.76 75.76c-2.34 2.343-2.34 6.137 0 8.48Z"),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null

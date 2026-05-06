package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorLightIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.24 123.76c2.34 2.343 2.34 6.137 0 8.48l-72 72c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L169.51 134h-137.51c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h137.51L107.76 60.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147ZM216 34c-3.314 0-6 2.686-6 6v176c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-176c0-3.314-2.686-6-6-6Z"),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null

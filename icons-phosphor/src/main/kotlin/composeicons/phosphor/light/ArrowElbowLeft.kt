package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorLightIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 100.24l-96 96c-2.343 2.34-6.137 2.34-8.48 0L30 94.48v57.52c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-72c0-3.314 2.686-6 6-6h72c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-57.52L136 183.51 227.76 91.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333Z"),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null

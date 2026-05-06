package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorLightIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 128c0 56.333-45.667 102-102 102C71.667 230 26 184.333 26 128 26 87.82 49.35 51.14 85.5 34.55c2.982-1.239 6.409 .104 7.756 3.039 1.346 2.935 .129 6.409-2.756 7.861C58.61 60.09 38 92.49 38 128c0 49.706 40.294 90 90 90 49.706 0 90-40.294 90-90C218 92.49 197.39 60.09 165.5 45.45c-2.884-1.452-4.102-4.926-2.756-7.861 1.346-2.935 4.774-4.278 7.756-3.039C206.65 51.14 230 87.82 230 128Z"),
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
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null

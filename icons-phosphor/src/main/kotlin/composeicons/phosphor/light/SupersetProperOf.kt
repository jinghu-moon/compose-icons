package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorLightIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c-.055 47.474-38.526 85.945-86 86h-72c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h72c40.869 0 74-33.131 74-74C210 87.131 176.869 54 136 54h-72c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h72c47.474 .055 85.945 38.526 86 86Z"),
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
        return _supersetProperOf!!
    }

private var _supersetProperOf: ImageVector? = null

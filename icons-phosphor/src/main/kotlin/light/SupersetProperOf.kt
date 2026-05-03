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
                pathData = parseSvgPathData("M 222.000 128.000 C 221.945 175.474 183.474 213.945 136.000 214.000 L 64.000 214.000 C 60.686 214.000 58.000 211.314 58.000 208.000 C 58.000 204.686 60.686 202.000 64.000 202.000 L 136.000 202.000 C 176.869 202.000 210.000 168.869 210.000 128.000 C 210.000 87.131 176.869 54.000 136.000 54.000 L 64.000 54.000 C 60.686 54.000 58.000 51.314 58.000 48.000 C 58.000 44.686 60.686 42.000 64.000 42.000 L 136.000 42.000 C 183.474 42.055 221.945 80.526 222.000 128.000 Z"),
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

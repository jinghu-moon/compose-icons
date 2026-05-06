package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorLightIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M173.75 49.72l-48 160c-.953 3.176-4.299 4.978-7.475 4.025-3.176-.953-4.978-4.299-4.025-7.475L159.94 54h-71.94c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h80c1.896-.001 3.681 .895 4.814 2.416 1.133 1.521 1.48 3.487 .936 5.304Z"),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null

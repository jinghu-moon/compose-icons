package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) return _numberCircleSeven!!
        _numberCircleSeven = phosphorLightIcon(
            name = "NumberCircleSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM156.91 84.56c1.124 1.602 1.396 3.65 .73 5.49l-32 88c-.862 2.372-3.116 3.95-5.64 3.95-.682-.008-1.358-.13-2-.36-1.496-.543-2.715-1.659-3.388-3.101-.673-1.442-.746-3.093-.202-4.589L143.43 94h-39.43c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c1.956 .002 3.788 .957 4.91 2.56Z"),
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
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null

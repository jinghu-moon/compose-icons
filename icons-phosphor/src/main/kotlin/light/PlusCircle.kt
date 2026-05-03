package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlusCircle: ImageVector
    get() {
        if (_plusCircle != null) return _plusCircle!!
        _plusCircle = phosphorLightIcon(
            name = "PlusCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 174.000 128.000 C 174.000 131.314 171.314 134.000 168.000 134.000 L 134.000 134.000 L 134.000 168.000 C 134.000 171.314 131.314 174.000 128.000 174.000 C 124.686 174.000 122.000 171.314 122.000 168.000 L 122.000 134.000 L 88.000 134.000 C 84.686 134.000 82.000 131.314 82.000 128.000 C 82.000 124.686 84.686 122.000 88.000 122.000 L 122.000 122.000 L 122.000 88.000 C 122.000 84.686 124.686 82.000 128.000 82.000 C 131.314 82.000 134.000 84.686 134.000 88.000 L 134.000 122.000 L 168.000 122.000 C 171.314 122.000 174.000 124.686 174.000 128.000 Z"),
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
        return _plusCircle!!
    }

private var _plusCircle: ImageVector? = null

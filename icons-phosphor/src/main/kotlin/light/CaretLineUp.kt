package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorLightIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.240 196.240 C 209.897 198.580 206.103 198.580 203.760 196.240 L 128.000 120.490 L 52.240 196.240 C 49.876 198.443 46.192 198.378 43.907 196.093 C 41.622 193.808 41.557 190.124 43.760 187.760 L 123.760 107.760 C 126.103 105.420 129.897 105.420 132.240 107.760 L 212.240 187.760 C 214.580 190.103 214.580 193.897 212.240 196.240 ZM 48.000 78.000 L 208.000 78.000 C 211.314 78.000 214.000 75.314 214.000 72.000 C 214.000 68.686 211.314 66.000 208.000 66.000 L 48.000 66.000 C 44.686 66.000 42.000 68.686 42.000 72.000 C 42.000 75.314 44.686 78.000 48.000 78.000 Z"),
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
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null

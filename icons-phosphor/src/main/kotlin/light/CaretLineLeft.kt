package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorLightIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.240 203.760 C 197.845 205.256 198.506 207.508 197.963 209.634 C 197.420 211.760 195.760 213.420 193.634 213.963 C 191.508 214.506 189.256 213.845 187.760 212.240 L 107.760 132.240 C 105.420 129.897 105.420 126.103 107.760 123.760 L 187.760 43.760 C 190.124 41.557 193.808 41.622 196.093 43.907 C 198.378 46.192 198.443 49.876 196.240 52.240 L 120.490 128.000 ZM 72.000 42.000 C 68.686 42.000 66.000 44.686 66.000 48.000 L 66.000 208.000 C 66.000 211.314 68.686 214.000 72.000 214.000 C 75.314 214.000 78.000 211.314 78.000 208.000 L 78.000 48.000 C 78.000 44.686 75.314 42.000 72.000 42.000 Z"),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorLightIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 43.760 76.240 C 41.557 73.876 41.622 70.192 43.907 67.907 C 46.192 65.622 49.876 65.557 52.240 67.760 L 128.000 143.510 L 203.760 67.760 C 206.124 65.557 209.808 65.622 212.093 67.907 C 214.378 70.192 214.443 73.876 212.240 76.240 L 132.240 156.240 C 129.897 158.580 126.103 158.580 123.760 156.240 ZM 208.000 186.000 L 48.000 186.000 C 44.686 186.000 42.000 188.686 42.000 192.000 C 42.000 195.314 44.686 198.000 48.000 198.000 L 208.000 198.000 C 211.314 198.000 214.000 195.314 214.000 192.000 C 214.000 188.686 211.314 186.000 208.000 186.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null

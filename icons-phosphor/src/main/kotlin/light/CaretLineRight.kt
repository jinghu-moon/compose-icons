package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorLightIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 148.240 123.760 C 150.580 126.103 150.580 129.897 148.240 132.240 L 68.240 212.240 C 65.876 214.443 62.192 214.378 59.907 212.093 C 57.622 209.808 57.557 206.124 59.760 203.760 L 135.510 128.000 L 59.760 52.240 C 57.557 49.876 57.622 46.192 59.907 43.907 C 62.192 41.622 65.876 41.557 68.240 43.760 ZM 184.000 42.000 C 180.686 42.000 178.000 44.686 178.000 48.000 L 178.000 208.000 C 178.000 211.314 180.686 214.000 184.000 214.000 C 187.314 214.000 190.000 211.314 190.000 208.000 L 190.000 48.000 C 190.000 44.686 187.314 42.000 184.000 42.000 Z"),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorLightIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.240 60.240 L 60.240 204.240 C 57.876 206.443 54.192 206.378 51.907 204.093 C 49.622 201.808 49.557 198.124 51.760 195.760 L 195.760 51.760 C 198.124 49.557 201.808 49.622 204.093 51.907 C 206.378 54.192 206.443 57.876 204.240 60.240 ZM 66.000 112.000 C 66.000 115.314 68.686 118.000 72.000 118.000 C 75.314 118.000 78.000 115.314 78.000 112.000 L 78.000 78.000 L 112.000 78.000 C 115.314 78.000 118.000 75.314 118.000 72.000 C 118.000 68.686 115.314 66.000 112.000 66.000 L 78.000 66.000 L 78.000 32.000 C 78.000 28.686 75.314 26.000 72.000 26.000 C 68.686 26.000 66.000 28.686 66.000 32.000 L 66.000 66.000 L 32.000 66.000 C 28.686 66.000 26.000 68.686 26.000 72.000 C 26.000 75.314 28.686 78.000 32.000 78.000 L 66.000 78.000 ZM 224.000 178.000 L 144.000 178.000 C 140.686 178.000 138.000 180.686 138.000 184.000 C 138.000 187.314 140.686 190.000 144.000 190.000 L 224.000 190.000 C 227.314 190.000 230.000 187.314 230.000 184.000 C 230.000 180.686 227.314 178.000 224.000 178.000 Z"),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null

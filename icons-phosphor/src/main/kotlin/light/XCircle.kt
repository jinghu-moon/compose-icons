package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.XCircle: ImageVector
    get() {
        if (_xCircle != null) return _xCircle!!
        _xCircle = phosphorLightIcon(
            name = "XCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.240 100.240 L 136.480 128.000 L 164.240 155.760 C 165.845 157.256 166.506 159.508 165.963 161.634 C 165.420 163.760 163.760 165.420 161.634 165.963 C 159.508 166.506 157.256 165.845 155.760 164.240 L 128.000 136.480 L 100.240 164.240 C 97.876 166.443 94.192 166.378 91.907 164.093 C 89.622 161.808 89.557 158.124 91.760 155.760 L 119.520 128.000 L 91.760 100.240 C 89.557 97.876 89.622 94.192 91.907 91.907 C 94.192 89.622 97.876 89.557 100.240 91.760 L 128.000 119.520 L 155.760 91.760 C 158.124 89.557 161.808 89.622 164.093 91.907 C 166.378 94.192 166.443 97.876 164.240 100.240 ZM 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 184.306 26.066 229.934 71.694 230.000 128.000 ZM 218.000 128.000 C 218.000 78.294 177.706 38.000 128.000 38.000 C 78.294 38.000 38.000 78.294 38.000 128.000 C 38.000 177.706 78.294 218.000 128.000 218.000 C 177.683 217.945 217.945 177.683 218.000 128.000 Z"),
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
        return _xCircle!!
    }

private var _xCircle: ImageVector? = null

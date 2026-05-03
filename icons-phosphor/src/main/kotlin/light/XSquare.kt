package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.XSquare: ImageVector
    get() {
        if (_xSquare != null) return _xSquare!!
        _xSquare = phosphorLightIcon(
            name = "XSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 164.240 100.240 L 136.480 128.000 L 164.240 155.760 C 165.845 157.256 166.506 159.508 165.963 161.634 C 165.420 163.760 163.760 165.420 161.634 165.963 C 159.508 166.506 157.256 165.845 155.760 164.240 L 128.000 136.480 L 100.240 164.240 C 97.876 166.443 94.192 166.378 91.907 164.093 C 89.622 161.808 89.557 158.124 91.760 155.760 L 119.520 128.000 L 91.760 100.240 C 89.557 97.876 89.622 94.192 91.907 91.907 C 94.192 89.622 97.876 89.557 100.240 91.760 L 128.000 119.520 L 155.760 91.760 C 158.124 89.557 161.808 89.622 164.093 91.907 C 166.378 94.192 166.443 97.876 164.240 100.240 Z"),
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
        return _xSquare!!
    }

private var _xSquare: ImageVector? = null

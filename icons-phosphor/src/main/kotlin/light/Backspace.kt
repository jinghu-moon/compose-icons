package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorLightIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 42.000 L 68.530 42.000 C 63.613 42.002 59.058 44.583 56.530 48.800 L 10.860 124.910 C 9.718 126.812 9.718 129.188 10.860 131.090 L 56.530 207.200 C 59.058 211.417 63.613 213.998 68.530 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 L 68.530 202.000 C 67.823 201.992 67.173 201.612 66.820 201.000 L 66.820 201.000 L 23.000 128.000 L 66.820 55.000 C 67.173 54.388 67.823 54.008 68.530 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 ZM 164.240 108.240 L 144.480 128.000 L 164.240 147.760 C 165.845 149.256 166.506 151.508 165.963 153.634 C 165.420 155.760 163.760 157.420 161.634 157.963 C 159.508 158.506 157.256 157.845 155.760 156.240 L 136.000 136.480 L 116.240 156.240 C 113.876 158.443 110.192 158.378 107.907 156.093 C 105.622 153.808 105.557 150.124 107.760 147.760 L 127.520 128.000 L 107.760 108.240 C 105.557 105.876 105.622 102.192 107.907 99.907 C 110.192 97.622 113.876 97.557 116.240 99.760 L 136.000 119.520 L 155.760 99.760 C 158.124 97.557 161.808 97.622 164.093 99.907 C 166.378 102.192 166.443 105.876 164.240 108.240 Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorLightIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 182.000 104.000 L 182.000 136.000 C 182.000 139.314 179.314 142.000 176.000 142.000 L 94.480 142.000 L 108.240 155.760 C 109.845 157.256 110.506 159.508 109.963 161.634 C 109.420 163.760 107.760 165.420 105.634 165.963 C 103.508 166.506 101.256 165.845 99.760 164.240 L 75.760 140.240 C 73.420 137.897 73.420 134.103 75.760 131.760 L 99.760 107.760 C 102.124 105.557 105.808 105.622 108.093 107.907 C 110.378 110.192 110.443 113.876 108.240 116.240 L 94.480 130.000 L 170.000 130.000 L 170.000 104.000 C 170.000 100.686 172.686 98.000 176.000 98.000 C 179.314 98.000 182.000 100.686 182.000 104.000 ZM 230.000 56.000 L 230.000 200.000 C 230.000 207.732 223.732 214.000 216.000 214.000 L 40.000 214.000 C 32.268 214.000 26.000 207.732 26.000 200.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 ZM 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 L 38.000 200.000 C 38.000 201.105 38.895 202.000 40.000 202.000 L 216.000 202.000 C 217.105 202.000 218.000 201.105 218.000 200.000 Z"),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null

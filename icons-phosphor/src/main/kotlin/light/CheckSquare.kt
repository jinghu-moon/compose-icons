package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) return _checkSquare!!
        _checkSquare = phosphorLightIcon(
            name = "CheckSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.240 99.760 C 174.580 102.103 174.580 105.897 172.240 108.240 L 116.240 164.240 C 113.897 166.580 110.103 166.580 107.760 164.240 L 83.760 140.240 C 81.557 137.876 81.622 134.192 83.907 131.907 C 86.192 129.622 89.876 129.557 92.240 131.760 L 112.000 151.510 L 163.760 99.760 C 166.103 97.420 169.897 97.420 172.240 99.760 ZM 222.000 48.000 L 222.000 208.000 C 222.000 215.732 215.732 222.000 208.000 222.000 L 48.000 222.000 C 40.268 222.000 34.000 215.732 34.000 208.000 L 34.000 48.000 C 34.000 40.268 40.268 34.000 48.000 34.000 L 208.000 34.000 C 215.732 34.000 222.000 40.268 222.000 48.000 ZM 210.000 48.000 C 210.000 46.895 209.105 46.000 208.000 46.000 L 48.000 46.000 C 46.895 46.000 46.000 46.895 46.000 48.000 L 46.000 208.000 C 46.000 209.105 46.895 210.000 48.000 210.000 L 208.000 210.000 C 209.105 210.000 210.000 209.105 210.000 208.000 Z"),
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
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null

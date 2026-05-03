package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorLightIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.240 84.240 C 217.897 86.580 214.103 86.580 211.760 84.240 L 174.000 46.490 L 174.000 168.000 C 174.000 202.242 146.242 230.000 112.000 230.000 C 77.758 230.000 50.000 202.242 50.000 168.000 L 50.000 80.000 C 50.000 76.686 52.686 74.000 56.000 74.000 C 59.314 74.000 62.000 76.686 62.000 80.000 L 62.000 168.000 C 62.000 195.614 84.386 218.000 112.000 218.000 C 139.614 218.000 162.000 195.614 162.000 168.000 L 162.000 46.490 L 124.240 84.240 C 121.876 86.443 118.192 86.378 115.907 84.093 C 113.622 81.808 113.557 78.124 115.760 75.760 L 163.760 27.760 C 166.103 25.420 169.897 25.420 172.240 27.760 L 220.240 75.760 C 222.580 78.103 222.580 81.897 220.240 84.240 Z"),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null

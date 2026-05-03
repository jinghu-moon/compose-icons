package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorLightIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.240 180.240 L 172.240 228.240 C 169.897 230.580 166.103 230.580 163.760 228.240 L 115.760 180.240 C 113.557 177.876 113.622 174.192 115.907 171.907 C 118.192 169.622 121.876 169.557 124.240 171.760 L 162.000 209.510 L 162.000 88.000 C 162.000 60.386 139.614 38.000 112.000 38.000 C 84.386 38.000 62.000 60.386 62.000 88.000 L 62.000 176.000 C 62.000 179.314 59.314 182.000 56.000 182.000 C 52.686 182.000 50.000 179.314 50.000 176.000 L 50.000 88.000 C 50.000 53.758 77.758 26.000 112.000 26.000 C 146.242 26.000 174.000 53.758 174.000 88.000 L 174.000 209.510 L 211.760 171.760 C 214.124 169.557 217.808 169.622 220.093 171.907 C 222.378 174.192 222.443 177.876 220.240 180.240 Z"),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null

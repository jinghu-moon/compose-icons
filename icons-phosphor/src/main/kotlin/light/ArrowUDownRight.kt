package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorLightIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 172.240 L 180.240 220.240 C 177.876 222.443 174.192 222.378 171.907 220.093 C 169.622 217.808 169.557 214.124 171.760 211.760 L 209.510 174.000 L 88.000 174.000 C 53.758 174.000 26.000 146.242 26.000 112.000 C 26.000 77.758 53.758 50.000 88.000 50.000 L 176.000 50.000 C 179.314 50.000 182.000 52.686 182.000 56.000 C 182.000 59.314 179.314 62.000 176.000 62.000 L 88.000 62.000 C 60.386 62.000 38.000 84.386 38.000 112.000 C 38.000 139.614 60.386 162.000 88.000 162.000 L 209.510 162.000 L 171.760 124.240 C 169.557 121.876 169.622 118.192 171.907 115.907 C 174.192 113.622 177.876 113.557 180.240 115.760 L 228.240 163.760 C 230.580 166.103 230.580 169.897 228.240 172.240 Z"),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null

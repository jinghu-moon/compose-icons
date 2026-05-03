package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorLightIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 112.000 C 229.961 146.226 202.226 173.961 168.000 174.000 L 46.490 174.000 L 84.240 211.760 C 85.845 213.256 86.506 215.508 85.963 217.634 C 85.420 219.760 83.760 221.420 81.634 221.963 C 79.508 222.506 77.256 221.845 75.760 220.240 L 27.760 172.240 C 25.420 169.897 25.420 166.103 27.760 163.760 L 75.760 115.760 C 78.124 113.557 81.808 113.622 84.093 115.907 C 86.378 118.192 86.443 121.876 84.240 124.240 L 46.490 162.000 L 168.000 162.000 C 195.614 162.000 218.000 139.614 218.000 112.000 C 218.000 84.386 195.614 62.000 168.000 62.000 L 80.000 62.000 C 76.686 62.000 74.000 59.314 74.000 56.000 C 74.000 52.686 76.686 50.000 80.000 50.000 L 168.000 50.000 C 202.226 50.039 229.961 77.774 230.000 112.000 Z"),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null

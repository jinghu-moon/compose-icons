package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorLightIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.240 100.240 C 217.897 102.580 214.103 102.580 211.760 100.240 L 174.000 62.490 L 174.000 192.000 C 174.000 195.314 171.314 198.000 168.000 198.000 L 24.000 198.000 C 20.686 198.000 18.000 195.314 18.000 192.000 C 18.000 188.686 20.686 186.000 24.000 186.000 L 162.000 186.000 L 162.000 62.490 L 124.240 100.240 C 121.876 102.443 118.192 102.378 115.907 100.093 C 113.622 97.808 113.557 94.124 115.760 91.760 L 163.760 43.760 C 166.103 41.420 169.897 41.420 172.240 43.760 L 220.240 91.760 C 222.580 94.103 222.580 97.897 220.240 100.240 Z"),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null

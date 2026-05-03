package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorLightIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 72.000 C 238.000 75.314 235.314 78.000 232.000 78.000 L 94.000 78.000 L 94.000 201.510 L 131.760 163.760 C 134.124 161.557 137.808 161.622 140.093 163.907 C 142.378 166.192 142.443 169.876 140.240 172.240 L 92.240 220.240 C 89.897 222.580 86.103 222.580 83.760 220.240 L 35.760 172.240 C 33.557 169.876 33.622 166.192 35.907 163.907 C 38.192 161.622 41.876 161.557 44.240 163.760 L 82.000 201.510 L 82.000 72.000 C 82.000 68.686 84.686 66.000 88.000 66.000 L 232.000 66.000 C 235.314 66.000 238.000 68.686 238.000 72.000 Z"),
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
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
